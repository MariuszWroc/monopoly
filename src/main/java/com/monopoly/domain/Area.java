package com.monopoly.domain;


public final class Area {
	private final Integer id;
	private final Integer number;
	private final String name;
	private final String description;
	private final Integer prise;
	private final Integer charge;
	private final Integer oneHouseCharge;
	private final Integer twoHouseCharge;
	private final Integer threeHouseCharge;
	private final Integer fourHouseCharge;
	private final Integer hotelCharge;
	private final Integer buildCost;
	private final Colour colour;
	
	public Area(Integer id, Integer number, String name, String description, Integer prise, Integer charge,
			Integer oneHouseCharge, Integer twoHouseCharge, Integer threeHouseCharge, Integer fourHouseCharge,
			Integer hotelCharge, Integer buildCost, Colour colour) {
		super();
		this.id = id;
		this.number = number;
		this.name = name;
		this.description = description;
		this.prise = prise;
		this.charge = charge;
		this.oneHouseCharge = oneHouseCharge;
		this.twoHouseCharge = twoHouseCharge;
		this.threeHouseCharge = threeHouseCharge;
		this.fourHouseCharge = fourHouseCharge;
		this.hotelCharge = hotelCharge;
		this.buildCost = buildCost;
		this.colour = colour;
	}

	public Integer getId() {
		return id;
	}

	public Integer getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
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

	@Override
	public String toString() {
		return "Area [id=" + id + ", number=" + number + ", name=" + name + ", description=" + description + ", prise="
				+ prise + ", charge=" + charge + ", oneHouseCharge=" + oneHouseCharge + ", twoHouseCharge="
				+ twoHouseCharge + ", threeHouseCharge=" + threeHouseCharge + ", fourHouseCharge=" + fourHouseCharge
				+ ", hotelCharge=" + hotelCharge + ", buildCost=" + buildCost + ", colour=" + colour + "]";
	}
	
}
