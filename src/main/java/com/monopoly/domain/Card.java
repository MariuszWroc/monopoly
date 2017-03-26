package com.monopoly.domain;

import com.monopoly.constant.CardCategory;

public final class Card {
	private final String name;
	private final String description;
	private final CardCategory category;
	
	public Card(String name, String description, CardCategory category) {
		this.name = name;
		this.description = description;
		this.category = category;
	}
	
	public CardCategory getCategory() {
		return category;
	}

	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}

	@Override
	public String toString() {
		return "Card [name=" + name + ", description=" + description + ", category=" + category + "]";
	}
	
}
