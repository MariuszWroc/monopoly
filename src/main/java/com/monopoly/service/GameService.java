package com.monopoly.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.monopoly.constant.Colour;
import com.monopoly.domain.Game;
import com.monopoly.domain.Player;
import com.monopoly.model.Account;

public class GameService {
	private static Logger logger = LoggerFactory.getLogger(GameService.class.getName());
	private Integer instanceId;
	private final Account owner;
	private List<Player> players;
	private Game game;
	
	public GameService(Account owner) {
		this.owner = owner;
	}
	
	public Player createPlayer(Account user) {
		return new Player(user, Colour.AZURE);
	}

	public void banUser(Player player) {
		if (players == null) {
			logger.info("Ban user " + player.getUser().getLogin());
		} else {
			players.remove(player);
		}
	}

	public void joinToGame(Player player) {
		if (players == null) {
			logger.info("User joined to " + instanceId);
		} else {
		}
	}

	public void createGame() {
		if (instanceId == null) {
			instanceId = 1;
			players = new ArrayList<>();
		} else {
			logger.info("Game exist " + instanceId);
		}
	}

	public void startGame() {
		if (players.size() >= 2) {
			List<Player> players = null;
			game = new Game(players);
		} else {
			logger.info("To few players, must be at least two. Now are " + players.size() + " available player(s)");
		}
	}
	
	public void destroyGame() {
		game = null;
	}
}
