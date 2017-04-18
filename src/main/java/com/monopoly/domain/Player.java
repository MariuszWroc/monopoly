package com.monopoly.domain;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

import com.monopoly.constant.Colour;
import com.monopoly.constant.Money;
import com.monopoly.model.Account;

public class Player {
	private final Account user;
	private Map<Money, Integer> cashRegister;
	private List<PlayerCard> playerCards;
	private final Colour pawnColour;
	private int pawnPosition;
	
	public Player(Account user, Colour pawnColour) {
		this.user = user;
		this.cashRegister = populateCashRegister();
		this.playerCards = new ArrayList<>();
		this.pawnColour = pawnColour;
		this.pawnPosition = 1;
	}

	private Map<Money, Integer> populateCashRegister() {
		cashRegister = new EnumMap<>(Money.class);
		cashRegister.put(Money.ONE, 1);
		cashRegister.put(Money.FIVE, 1);
		cashRegister.put(Money.TEN, 1);
		cashRegister.put(Money.TWENTY, 1);
		cashRegister.put(Money.FIFTY, 1);
		cashRegister.put(Money.ONE_HUNDRET, 1);
		cashRegister.put(Money.FIVE_HUNDRETS, 1);
		return cashRegister;
	}

	public Account getUser() {
		return user;
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
		return "Player [user=" + user + ", cashRegister=" + cashRegister + ", playerCards=" + playerCards + ", pawnColour="
				+ pawnColour + ", pawnPosition=" + pawnPosition + "]";
	}

}
