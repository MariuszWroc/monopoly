package com.monopoly.domain;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.monopoly.constant.Colour;
import com.monopoly.constant.Dice;

public final class Game {
	private static final int NUMBER_OF_FIELDS = 40;
	private final Integer instanceId;
	private final BankResources bankResources;
	private final Map<Colour, Player> playersByColour;
	
	public Game(List<Player> players) {
		instanceId = 1; // TODO: Make unique
		bankResources = new BankResources(players.size());
		playersByColour = players.stream().collect(Collectors.toMap(Player::getPawnColour, Function.identity()));
	}
	
	public void movePlayerPawn(Colour pawnColour) {
		Player player = playersByColour.get(pawnColour);
		int newPosition = (player.getPawnPosition() + Dice.rollDice()) % NUMBER_OF_FIELDS;
		player.setPawnPosition(newPosition);
	}

	public Integer getInstanceId() {
		return instanceId;
	}

	public BankResources getBankResources() {
		return bankResources;
	}

	public Map<Colour, Player> getPlayerPositions() {
		return playersByColour;
	}
	
}
