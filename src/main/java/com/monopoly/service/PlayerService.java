package com.monopoly.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.monopoly.constant.Colour;
import com.monopoly.domain.Player;
import com.monopoly.model.Account;

@Service
@Scope("session")
public class PlayerService {
	private static Logger logger = LoggerFactory.getLogger(PlayerService.class.getName());
	
	public Player createPlayer(Account user, Colour playerColour) {
		return new Player(user, playerColour);
	}

	// TODO: to fix
	public String joinToGame(Player player) {
		String userJoinedLogin = "NO JOINED USERS";
		
		List<Object> instanceId = null;
		if (instanceId == null) {
			logger.info("No created game to join");
		} else {
			List<Object> gamePlayers = null;
			gamePlayers.add(player);
			logger.info("User joined to game: ", instanceId);
		}
		return userJoinedLogin;
	}
}
