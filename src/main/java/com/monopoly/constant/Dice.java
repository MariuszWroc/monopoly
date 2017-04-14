package com.monopoly.constant;

import java.util.concurrent.ThreadLocalRandom;

public enum Dice {
	ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6);

	private final int value;

	private Dice(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public static int rollDice() {
		return ThreadLocalRandom.current().nextInt(values().length);
	}
}
