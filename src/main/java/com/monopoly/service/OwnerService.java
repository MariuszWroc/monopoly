package com.monopoly.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monopoly.domain.Game;
import com.monopoly.domain.Player;
import com.monopoly.model.Account;

@Service
public class OwnerService {
	private static Logger logger = LoggerFactory.getLogger(OwnerService.class.getName());
	
	@Autowired
	GameService gameService;
	
	public String createGame(String login, List<Player> players) {
		String userJoinedLogin = "NO STARTED GAME";
		Game gameByLogin = gameService.getGameByLogin(login);
		if (gameByLogin == null) {
			Game game = new Game(login, players);
			gameService.addGame(login, game);
		} else {
			logger.info("Game for user {0} exist ", login);
		}
		return userJoinedLogin;
	}

	// TODO: to fix
	public String startGame(String login) {
		gameService.getGameByLogin(login);
		List<Player> gamePlayers = null;
		if (gamePlayers.size() >= 2) {
			List<Player> players = null;
			Game game = new Game(login, players);
		} else {
			logger.info("To few players, must be at least two. Now are " + gamePlayers.size() + " available player(s)");
		}
		return null;
	}
	
	// TODO: to fix
	public String destroyGame() {
		Object game = null;
		return null;
	}
}
