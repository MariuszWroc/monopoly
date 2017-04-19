package com.monopoly.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.monopoly.service.GameService;

@RestController
public class GameOwnerController {
	private static final Logger logger = LoggerFactory.getLogger(GameOwnerController.class);
	
	@Autowired
	private GameService gameService;
	
	@RequestMapping(method=RequestMethod.POST)
	public void createGame() {
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public void destroyGame() {
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public void banPlayer() {
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public void playGame() {
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public void quitGame() {
	}
}
