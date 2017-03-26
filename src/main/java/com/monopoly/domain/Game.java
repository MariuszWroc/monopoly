package com.monopoly.domain;

import java.util.Map;

public final class Game {
	private Integer instanceId;
	private BankResources bankResources;
	private Map<Integer, Player> playerPosition;

	public void createGame() {
		instanceId = 1; // TODO: Make unique
	}

	
}
