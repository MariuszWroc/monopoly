package com.monopoly.domain;

import java.util.List;
import java.util.Map;

import com.monopoly.constant.Colour;
import com.monopoly.constant.Money;

public class Player {
	private Integer id;
	private Map<Money, Integer> cashRegister;
	private List<PlayerCard> playerCards;
	private final Colour pawnColour;
	private int pawnPosition;
	
	public Player(Integer id, Map<Money, Integer> cashRegister, List<PlayerCard> playerCards, Colour pawnColour,
			Integer pawnPosition) {
		this.id = id;
		this.cashRegister = cashRegister;
		this.playerCards = playerCards;
		this.pawnColour = pawnColour;
		this.pawnPosition = pawnPosition;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Map<Money, Integer> getCashRegister() {
		return cashRegister;
	}

	public void setCashRegister(Map<Money, Integer> cashRegister) {
		this.cashRegister = cashRegister;
	}

	public List<PlayerCard> getPlayerCards() {
		return playerCards;
	}

	public void setPlayerCards(List<PlayerCard> playerCards) {
		this.playerCards = playerCards;
	}
	
	public Colour getPawnColour() {
		return pawnColour;
	}
	
	public Integer getPawnPosition() {
		return pawnPosition;
	}

	public void setPawnPosition(Integer pawnPosition) {
		this.pawnPosition = pawnPosition;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", cashRegister=" + cashRegister + ", playerCards=" + playerCards + ", pawnColour="
				+ pawnColour + ", pawnPosition=" + pawnPosition + "]";
	}

}
