package com.monopoly.domain;

import java.util.List;
import java.util.Map;

public class BankResources {
	private Map<Money, Integer> availableBanknots;
	private List<Card> availableCards;
	private List<Pawn> availableHouses;
	private List<Pawn> availableHotels;

	public BankResources(Map<Money, Integer> availableBanknots, List<Card> availableCards, List<Pawn> availableHouses,
			List<Pawn> availableHotels) {
		this.availableBanknots = availableBanknots;
		this.availableCards = availableCards;
		this.availableHouses = availableHouses;
		this.availableHotels = availableHotels;
	}

	public Map<Money, Integer> getAvailableBanknots() {
		return availableBanknots;
	}

	public void setAvailableBanknots(Map<Money, Integer> availableBanknots) {
		this.availableBanknots = availableBanknots;
	}

	public List<Card> getAvailableCards() {
		return availableCards;
	}

	public void setAvailableCards(List<Card> availableCards) {
		this.availableCards = availableCards;
	}

	public List<Pawn> getAvailableHouses() {
		return availableHouses;
	}

	public void setAvailableHouses(List<Pawn> availableHouses) {
		this.availableHouses = availableHouses;
	}

	public List<Pawn> getAvailableHotels() {
		return availableHotels;
	}

	public void setAvailableHotels(List<Pawn> availableHotels) {
		this.availableHotels = availableHotels;
	}

	@Override
	public String toString() {
		return "BankResources [availableBanknots=" + availableBanknots + ", availableCards=" + availableCards
				+ ", availableHouses=" + availableHouses + ", availableHotels=" + availableHotels + "]";
	}

}
