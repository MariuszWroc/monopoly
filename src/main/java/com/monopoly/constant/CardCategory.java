package com.monopoly.constant;


public enum CardCategory {
	TITLE_PROPERTY("Title of property"),
	SOCIAL_SECURTITY("Social security"),
	CHANCE("Szansa");
	
	private String name;
	
	private CardCategory(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
