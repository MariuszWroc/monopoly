package com.monopoly.domain;

import java.util.List;

import com.monopoly.constant.Colour;

public class Player {
	private Integer id;
	private CashRegister cashRegister;
	private List<PlayerCard> playerCards;
	private final Colour pawnColour;
	private int pawnPosition;
	
	public Player(Integer id, CashRegister cashRegister, List<PlayerCard> playerCards, Colour pawnColour,
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

	public CashRegister getCashRegister() {
		return cashRegister;
	}

	public void setCashRegister(CashRegister cashRegister) {
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
