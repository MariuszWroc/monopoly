package com.monopoly.service;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.monopoly.domain.Game;

@Service
public class GameService {
	private static Logger logger = LoggerFactory.getLogger(GameService.class.getName());
	private final Map<String, Game> availableGames = new LinkedHashMap<>();
	
	public Map<String, Game> getAvailableGames() {
		return Collections.unmodifiableMap(availableGames);
	}
	
	public Game getGameByLogin(String login) {
		return getAvailableGames().get(login);
	}
	
	public Game getMyGameBylLogin(String login) {
		return getAvailableGames().get(login);
	}
	
	public void addGame(String login, Game game) {
		getAvailableGames().put(login, game);
	}
	
	public void removeGame(String login) {
		getAvailableGames().remove(login);
	}
}
