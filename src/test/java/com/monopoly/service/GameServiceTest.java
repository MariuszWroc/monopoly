package com.monopoly.service;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.monopoly.constant.Colour;
import com.monopoly.domain.Player;
import com.monopoly.model.Account;
import com.monopoly.model.Role;

@RunWith(MockitoJUnitRunner.class)
public class GameServiceTest {
	private static Colour playerColour;
	@InjectMocks
	Account owner = new Account(1, "Mariusz", "Czarny", "mczarny", "123", "mariusz.zlatan@gmail.com", true, Role.ADMIN);
	@InjectMocks
	Player player = new Player(owner, playerColour);
	@Mock
	GameService service = new GameService(owner);


	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		playerColour = Colour.BROWN;
	}

	@Test
	public final void testCreatePlayer() {
		when(service.createPlayer(owner, playerColour)).thenReturn(player);
		assertEquals(player, service.createPlayer(owner, playerColour));
	}

	@Test
	public final void testBanUser() {
		when(service.banUser(player)).thenReturn(owner.getLogin());
		assertEquals(player, service.banUser(player));
	}

	@Test
	public final void testJoinToGame() {
		when(service.joinToGame(player)).thenReturn(owner.getLogin());
		assertEquals(player, service.joinToGame(player));
	}

	@Test
	public final void testCreateGame() {
		when(service.createGame()).thenReturn(owner.getLogin());
		assertEquals(player, service.createPlayer(owner, playerColour));
	}

	@Test
	public final void testStartGame() {
		when(service.joinToGame(player)).thenReturn(owner.getLogin());
		assertEquals(player, service.createPlayer(owner, playerColour));
	}

	@Test
	public final void testDestroyGame() {
		when(service.joinToGame(player)).thenReturn(owner.getLogin());
		assertEquals(player, service.createPlayer(owner, playerColour));
	}

}
