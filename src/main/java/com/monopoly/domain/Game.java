package com.monopoly.domain;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.monopoly.constant.Colour;
import com.monopoly.constant.Dice;

public final class Game {
	private static final int NUMBER_OF_FIELDS = 40;
	private final String userOwnerLogin;
	private final BankResources bankResources;
	private final Map<Colour, Player> playersByColour;
	
	public Game(String userOwnerLogin, List<Player> players) {
		this.userOwnerLogin = userOwnerLogin;
		bankResources = new BankResources(players.size());
		playersByColour = players.stream().collect(Collectors.toMap(Player::getPawnColour, Function.identity()));
	}
	
	public void movePlayerPawn(Colour pawnColour) {
		Player player = playersByColour.get(pawnColour);
		int newPosition = (player.getPawnPosition() + Dice.rollDice()) % NUMBER_OF_FIELDS;
		player.setPawnPosition(newPosition);
	}

	public String getUserOwnerLogin() {
		return userOwnerLogin;
	}

	public Map<Colour, Player> getPlayersByColour() {
		return playersByColour;
	}

	public BankResources getBankResources() {
		return bankResources;
	}
	
}
