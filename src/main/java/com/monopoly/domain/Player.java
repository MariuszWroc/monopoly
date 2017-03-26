package com.monopoly.domain;

import java.util.List;

public class Player {
	private Integer id;
	private CashRegister cashRegister;
	private List<PlayerCard> playerCards;
	
	public Player(Integer id, CashRegister cashRegister, List<PlayerCard> playerCards) {
		this.id = id;
		this.cashRegister = cashRegister;
		this.playerCards = playerCards;
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

	@Override
	public String toString() {
		return "Player [id=" + id + ", cashRegister=" + cashRegister + ", playerCards=" + playerCards + "]";
	}
}
