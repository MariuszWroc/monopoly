package com.monopoly.domain;

import java.util.List;

import com.monopoly.constant.Money;

public class CashRegister {
	private List<Money> oneCreditBanknotes;
	private List<Money> fiveCreditsBanknotes;
	private List<Money> tenCreditsBanknotes;
	private List<Money> twentyCreditsBanknotes;
	private List<Money> fiftyCreditsBanknotes;
	private List<Money> oneHundretCreditsBanknotes;
	private List<Money> fiveHundretsCreditBanknotes;
	
	public CashRegister(List<Money> oneCreditBanknotes, List<Money> fiveCreditsBanknotes,
			List<Money> tenCreditsBanknotes, List<Money> twentyCreditsBanknotes, List<Money> fiftyCreditsBanknotes,
			List<Money> oneHundretCreditsBanknotes, List<Money> fiveHundretsCreditBanknotes) {
		this.oneCreditBanknotes = oneCreditBanknotes;
		this.fiveCreditsBanknotes = fiveCreditsBanknotes;
		this.tenCreditsBanknotes = tenCreditsBanknotes;
		this.twentyCreditsBanknotes = twentyCreditsBanknotes;
		this.fiftyCreditsBanknotes = fiftyCreditsBanknotes;
		this.oneHundretCreditsBanknotes = oneHundretCreditsBanknotes;
		this.fiveHundretsCreditBanknotes = fiveHundretsCreditBanknotes;
	}

	public List<Money> getOneCreditBanknotes() {
		return oneCreditBanknotes;
	}

	public void setOneCreditBanknotes(List<Money> oneCreditBanknotes) {
		this.oneCreditBanknotes = oneCreditBanknotes;
	}

	public List<Money> getFiveCreditsBanknotes() {
		return fiveCreditsBanknotes;
	}

	public void setFiveCreditsBanknotes(List<Money> fiveCreditsBanknotes) {
		this.fiveCreditsBanknotes = fiveCreditsBanknotes;
	}

	public List<Money> getTenCreditsBanknotes() {
		return tenCreditsBanknotes;
	}

	public void setTenCreditsBanknotes(List<Money> tenCreditsBanknotes) {
		this.tenCreditsBanknotes = tenCreditsBanknotes;
	}

	public List<Money> getTwentyCreditsBanknotes() {
		return twentyCreditsBanknotes;
	}

	public void setTwentyCreditsBanknotes(List<Money> twentyCreditsBanknotes) {
		this.twentyCreditsBanknotes = twentyCreditsBanknotes;
	}

	public List<Money> getFiftyCreditsBanknotes() {
		return fiftyCreditsBanknotes;
	}

	public void setFiftyCreditsBanknotes(List<Money> fiftyCreditsBanknotes) {
		this.fiftyCreditsBanknotes = fiftyCreditsBanknotes;
	}

	public List<Money> getOneHundretCreditsBanknotes() {
		return oneHundretCreditsBanknotes;
	}

	public void setOneHundretCreditsBanknotes(List<Money> oneHundretCreditsBanknotes) {
		this.oneHundretCreditsBanknotes = oneHundretCreditsBanknotes;
	}

	public List<Money> getFiveHundretsCreditBanknotes() {
		return fiveHundretsCreditBanknotes;
	}

	public void setFiveHundretsCreditBanknotes(List<Money> fiveHundretsCreditBanknotes) {
		this.fiveHundretsCreditBanknotes = fiveHundretsCreditBanknotes;
	}

	@Override
	public String toString() {
		return "CashRegister [oneCreditBanknotes=" + oneCreditBanknotes + ", fiveCreditsBanknotes="
				+ fiveCreditsBanknotes + ", tenCreditsBanknotes=" + tenCreditsBanknotes + ", twentyCreditsBanknotes="
				+ twentyCreditsBanknotes + ", fiftyCreditsBanknotes=" + fiftyCreditsBanknotes
				+ ", oneHundretCreditsBanknotes=" + oneHundretCreditsBanknotes + ", fiveHundretsCreditBanknotes="
				+ fiveHundretsCreditBanknotes + "]";
	}
	
}
