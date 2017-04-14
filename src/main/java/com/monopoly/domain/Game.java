package com.monopoly.domain;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.monopoly.constant.Colour;
import com.monopoly.constant.Dice;

public final class Game {
	private final Integer instanceId;
	private final BankResources bankResources;
	private final Map<Colour, Player> playerPositions;
	
	public Game(List<Player> players) {
		instanceId = 1; // TODO: Make unique
		bankResources = new BankResources();
		playerPositions = players.stream().collect(Collectors.toMap(Player::getPawnColour, Function.identity()));
	}

	public void movePlayerPawn(Colour pawnColour) {
		Player player = playerPositions.get(pawnColour);
		int newPosition = (player.getPawnPosition() + Dice.rollDice()) % 40;
		player.setPawnPosition(newPosition);
	}

	public Integer getInstanceId() {
		return instanceId;
	}

	public BankResources getBankResources() {
		return bankResources;
	}

	public Map<Colour, Player> getPlayerPositions() {
		return playerPositions;
	}
	
}
