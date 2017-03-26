package com.monopoly.constant;

import java.util.Random;

public enum Dice {
	ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6);

	private Integer value;

	private Dice(Integer value) {
		this.value = value;
	}

	public Integer getValue() {
		return value;
	}

	public Integer rollDice() {
		Random randomGenerator = new Random();
		return randomGenerator.nextInt(6);
	}
}
