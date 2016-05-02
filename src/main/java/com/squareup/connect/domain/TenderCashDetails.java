package com.squareup.connect.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents the details of a tender with type CASH.
 */
public class TenderCashDetails {

	/**
	 * The total amount of cash provided by the buyer, before change is given.
	 */
	@JsonProperty("buyer_tendered_money")
	private Money buyerTendered;

	/**
	 * The amount of change returned to the buyer.
	 */
	@JsonProperty("change_back_money")
	private Money changeBack;

	public Money getBuyerTendered() {
		return buyerTendered;
	}

	public void setBuyerTendered(Money buyerTendered) {
		this.buyerTendered = buyerTendered;
	}

	public Money getChangeBack() {
		return changeBack;
	}

	public void setChangeBack(Money changeBack) {
		this.changeBack = changeBack;
	}
}
