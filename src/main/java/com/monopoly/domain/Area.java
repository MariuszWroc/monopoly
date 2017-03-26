package com.monopoly.domain;

import com.monopoly.constant.Colour;

public final class Area {
	private final Integer number;
	private final Integer prise;
	private final Integer charge;
	private final Integer oneHouseCharge;
	private final Integer twoHouseCharge;
	private final Integer threeHouseCharge;
	private final Integer fourHouseCharge;
	private final Integer hotelCharge;
	private final Integer buildCost;
	private final Colour colour;
	private final Card card;

	public Area(Integer number, String name, String description, Integer prise, Integer charge, Integer oneHouseCharge,
			Integer twoHouseCharge, Integer threeHouseCharge, Integer fourHouseCharge, Integer hotelCharge,
			Integer buildCost, Colour colour, Card card) {
		this.number = number;
		this.prise = prise;
		this.charge = charge;
		this.oneHouseCharge = oneHouseCharge;
		this.twoHouseCharge = twoHouseCharge;
		this.threeHouseCharge = threeHouseCharge;
		this.fourHouseCharge = fourHouseCharge;
		this.hotelCharge = hotelCharge;
		this.buildCost = buildCost;
		this.colour = colour;
		this.card = card;
	}

	public Integer getNumber() {
		return number;
	}

	public Integer getPrise() {
		return prise;
	}

	public Integer getCharge() {
		return charge;
	}

	public Integer getOneHouseCharge() {
		return oneHouseCharge;
	}

	public Integer getTwoHouseCharge() {
		return twoHouseCharge;
	}

	public Integer getThreeHouseCharge() {
		return threeHouseCharge;
	}

	public Integer getFourHouseCharge() {
		return fourHouseCharge;
	}

	public Integer getHotelCharge() {
		return hotelCharge;
	}

	public Integer getBuildCost() {
		return buildCost;
	}

	public Colour getColour() {
		return colour;
	}

	public Card getCard() {
		return card;
	}

	@Override
	public String toString() {
		return "Area [number=" + number + ", prise=" + prise + ", charge=" + charge + ", oneHouseCharge="
				+ oneHouseCharge + ", twoHouseCharge=" + twoHouseCharge + ", threeHouseCharge=" + threeHouseCharge
				+ ", fourHouseCharge=" + fourHouseCharge + ", hotelCharge=" + hotelCharge + ", buildCost=" + buildCost
				+ ", colour=" + colour + ", card=" + card + "]";
	}
}
