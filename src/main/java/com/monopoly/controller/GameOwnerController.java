package com.monopoly.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monopoly.service.GameService;

@RestController
public class GameOwnerController {
	private static final Logger logger = LoggerFactory.getLogger(GameOwnerController.class);
	
	@Autowired
	private GameService gameService;
	
	@PostMapping
	public void createGame() {
		gameService.createGame();
	}
	
	@PostMapping
	public void destroyGame() {
		gameService.destroyGame();
	}
	
	@PostMapping
	public void banPlayer() {
	}

	@PostMapping
	public void availablePlayerList() {
	}
}
