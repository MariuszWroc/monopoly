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
	private final Map<Colour, Player> playersByColour;
	
	public Game(List<Player> players) {
		instanceId = 1; // TODO: Make unique
		bankResources = new BankResources();
		playersByColour = players.stream().collect(Collectors.toMap(Player::getPawnColour, Function.identity()));
	}
	
	public void redistributeMoney(List<Player> players) {
		
	}

	public void movePlayerPawn(Colour pawnColour) {
		Player player = playersByColour.get(pawnColour);
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
		return playersByColour;
	}
	
}
