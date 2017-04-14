package com.monopoly.domain;

import static com.monopoly.constant.Money.FIFTY;
import static com.monopoly.constant.Money.FIVE;
import static com.monopoly.constant.Money.FIVE_HUNDRETS;
import static com.monopoly.constant.Money.ONE;
import static com.monopoly.constant.Money.ONE_HUNDRET;
import static com.monopoly.constant.Money.TEN;
import static com.monopoly.constant.Money.TWENTY;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import com.monopoly.constant.Money;

public class BankResources {
	private static final Logger logger = LoggerFactory.getLogger(BankResources.class.getName());
	private Map<Money, Integer> availableBanknots;
	private List<Card> availableCards;
	private AtomicInteger availableHouses;
	private AtomicInteger availableHotels;

	public BankResources() {
		availableBanknots = populateBanknots();
		availableCards = populateCards();
		availableHouses = new AtomicInteger(20);
		availableHotels = new AtomicInteger(20);
	}

	public Integer removeHouse() {
		if (availableHouses.get() == 0) {
			logger.info("House pool is empty");
		} else {
			availableHouses.decrementAndGet();
		}
		
		return availableHouses.get();
	}
	
	public Integer addHouse() {
		if (availableHouses.get() == 20) {
			logger.info("Every house is in pool");
		} else {
			availableHouses.incrementAndGet();
		}
		
		return availableHouses.get();
	}
	
	public Integer removeHotel() {
		
		if (availableHotels.get() == 0) {
			logger.info("Hotel pool is empty");
		} else {
			availableHotels.decrementAndGet();
		}
		
		return availableHotels.get();
	}
	
	public Integer addHotel() {

		if (availableHotels.get() == 20) {
			logger.info("Every hotel is in pool");
		} else {
			availableHotels.incrementAndGet();
		}
		
		return availableHotels.get();
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

	@Override
	public String toString() {
		return "BankResources [availableBanknots=" + availableBanknots + ", availableCards=" + availableCards
				+ ", availableHouses=" + availableHouses + ", availableHotels=" + availableHotels + "]";
	}

}
