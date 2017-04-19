package com.monopoly.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.monopoly.service.GameService;

@RestController
public class GamePlayerController {
	private static final Logger logger = LoggerFactory.getLogger(GameOwnerController.class);

	@Autowired
	private GameService gameService;

	@RequestMapping(method = RequestMethod.POST)
	public void joinToGame() {
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void createPlayer() {
	}

	@RequestMapping(method = RequestMethod.POST)
	public void quitGame() {
	}

	@RequestMapping(method = RequestMethod.GET)
	public void availableGameList() {
	}

}
