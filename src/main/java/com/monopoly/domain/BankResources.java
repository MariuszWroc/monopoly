package com.monopoly.domain;

import static com.monopoly.constant.Money.FIFTY;
import static com.monopoly.constant.Money.FIVE;
import static com.monopoly.constant.Money.FIVE_HUNDRETS;
import static com.monopoly.constant.Money.ONE;
import static com.monopoly.constant.Money.ONE_HUNDRET;
import static com.monopoly.constant.Money.TEN;
import static com.monopoly.constant.Money.TWENTY;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import com.monopoly.constant.Money;

public class BankResources {
	private static final int HOUSE_COUNT = 20;
	private static final int HOTEL_COUNT = 20;
	private static final Logger logger = LoggerFactory.getLogger(BankResources.class.getName());
	private static final int MAX_VALUE = 31;
	private Map<Money, Integer> availableBanknots;
	private List<Card> availableCards;
	private AtomicInteger availableHouses;
	private AtomicInteger availableHotels;

	public BankResources(int playersCount) {
		availableBanknots = populateBanknots(playersCount);
		availableCards = populateCards();
		availableHouses = new AtomicInteger(HOUSE_COUNT);
		availableHotels = new AtomicInteger(HOTEL_COUNT);
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
		if (availableHouses.get() == HOUSE_COUNT) {
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

		if (availableHotels.get() == HOTEL_COUNT) {
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

	private Map<Money, Integer> populateBanknots(int playersCount) {
		int oneCreditCounts = MAX_VALUE  - 5  * playersCount;
		int fiveCreditsCounts = MAX_VALUE  - 1  * playersCount;
		int tenCreditsCounts = MAX_VALUE  - 2  * playersCount;
		int twentyCreditsCounts = MAX_VALUE  - 1  * playersCount;
		int fiftyCreditsCounts = MAX_VALUE  - 1  * playersCount;
		int oneHundretCreditsCounts = MAX_VALUE  - 4  * playersCount;
		int fiveHundretCreditsCounts = MAX_VALUE  - 2  * playersCount;
		
		Map<Money, Integer> credits = new EnumMap<>(Money.class);
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
