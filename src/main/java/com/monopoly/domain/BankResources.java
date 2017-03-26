package com.monopoly.domain;

import static com.monopoly.constant.Pawn.HOTEL;
import static com.monopoly.constant.Pawn.HOUSE;
import static com.monopoly.constant.Money.ONE;
import static com.monopoly.constant.Money.FIVE;
import static com.monopoly.constant.Money.TEN;
import static com.monopoly.constant.Money.TWENTY;
import static com.monopoly.constant.Money.FIFTY;
import static com.monopoly.constant.Money.ONE_HUNDRET;
import static com.monopoly.constant.Money.FIVE_HUNDRETS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.monopoly.constant.Money;
import com.monopoly.constant.Pawn;

public class BankResources {
	private Map<Money, Integer> availableBanknots;
	private List<Card> availableCards;
	private List<Pawn> availableHouses;
	private List<Pawn> availableHotels;

	public BankResources() {
		this.availableBanknots = populateBanknots();
		this.availableCards = populateCards();
		this.availableHouses = populateHouses();
		this.availableHotels = populateHotels();
	}

	private List<Pawn> populateHotels() {
		int hotelCounts = 20;
		List<Pawn> hotels = new ArrayList<>();
		for (int i = 0; i <= hotelCounts; i++) {
			hotels.add(HOTEL);
		}
		return hotels;
	}

	private List<Pawn> populateHouses() {
		int houseCounts = 20;
		List<Pawn> houses = new ArrayList<>();
		for (int i = 0; i <= houseCounts; i++) {
			houses.add(HOUSE);
		}
		return houses;
	}

	private List<Card> populateCards() {
		// TODO Auto-generated method stub
		return null;
	}

	private Map<Money, Integer> populateBanknots() {
		int oneCreditCounts = 100;
		int fiveCreditsCounts = 100;
		int tenCreditsCounts = 100;
		int twentyCreditsCounts = 100;
		int fiftyCreditsCounts = 100;
		int oneHundretCreditsCounts = 100;
		int fiveHundretCreditsCounts = 100;
		
		Map<Money, Integer> credits = new HashMap<>();
		credits.put(ONE, oneCreditCounts);
		credits.put(FIVE, fiveCreditsCounts);
		credits.put(TEN, tenCreditsCounts);
		credits.put(TWENTY, twentyCreditsCounts);
		credits.put(FIFTY, fiftyCreditsCounts);
		credits.put(ONE_HUNDRET, oneHundretCreditsCounts);
		credits.put(FIVE_HUNDRETS, fiveHundretCreditsCounts);
		
		return credits;
	}

	public Map<Money, Integer> getAvailableBanknots() {
		return availableBanknots;
	}

	public List<Card> getAvailableCards() {
		return availableCards;
	}

	public List<Pawn> getAvailableHouses() {
		return availableHouses;
	}

	public List<Pawn> getAvailableHotels() {
		return availableHotels;
	}

	@Override
	public String toString() {
		return "BankResources [availableBanknots=" + availableBanknots + ", availableCards=" + availableCards
				+ ", availableHouses=" + availableHouses + ", availableHotels=" + availableHotels + "]";
	}

}
