package com.monopoly.service;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.monopoly.constant.Colour;
import com.monopoly.domain.Game;
import com.monopoly.domain.Player;

@Service
@Scope("session")
public class OwnerService {
	private static Logger logger = LoggerFactory.getLogger(OwnerService.class.getName());
	
	@Autowired
	GameService gameService;
	
	public String createGame(String login, List<Player> players) {
		String createGameMessage = "NO CREATED GAME";
		Game gameByLogin = gameService.getGameByLogin(login);
		if (gameByLogin == null) {
			Game game = new Game(players);
			gameService.addGame(login, game);
		} else {
			logger.info("Game for user {0} already exist ", login);
		}
		
		return createGameMessage;
	}

	public String startGame(String login) {
		String startGameMessage = "NO STARTED GAME";
		Game gameByLogin = gameService.getGameByLogin(login);
		Map<Colour, Player> playersByColour = gameByLogin.getPlayersByColour();
		int playerSize = playersByColour.size();
		if (playerSize >= 2) {
			gameByLogin.start();
		} else {
			logger.info("To few players, must be at least two. Now are {0} available player(s)", playerSize);
		}
		
		return startGameMessage;
	}
	
	public String destroyGame(String login) {
		String destroyGameMessage = "NO GAME TO DESTROY";
		Game gameByLogin = gameService.getGameByLogin(login);
		if (gameByLogin == null) {
			logger.info("Game for user {0} no game exist ", login);
		} else {
			gameService.removeGame(login);
		}
		
		return destroyGameMessage;
	}
	
	// TODO: to fix
	public String banUser(Player player) {
		String userbannedLogin = "NO BANNED USERS";
		
		List<Object> gamePlayers = null;
		if (gamePlayers == null) {
			logger.info("no user to ban");
		} else {
			gamePlayers.remove(player);
			userbannedLogin = player.getUser().getLogin();
			logger.info("Ban user ", userbannedLogin);
		}
		return userbannedLogin;
	}
}
