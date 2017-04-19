package com.monopoly.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monopoly.constant.Colour;
import com.monopoly.domain.Player;
import com.monopoly.model.Account;
import com.monopoly.service.GameService;

@RestController
public class GamePlayerController {
	private static final Logger logger = LoggerFactory.getLogger(GameOwnerController.class);

	@Autowired
	private GameService gameService;

	@PostMapping
	public void joinToGame() {
		Player player = null;
		gameService.joinToGame(player);
	}
	
	@PostMapping
	public void createPlayer() {
		Account user = null;
		Colour playerColour = null;
		gameService.createPlayer(user, playerColour);
	}

	@PostMapping
	public void quitGame() {
	}

	@GetMapping
	public void availableGameList() {
	}

}
