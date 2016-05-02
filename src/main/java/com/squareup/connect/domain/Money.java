package com.squareup.connect.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents an amount of money.
 * 
 * Important: Unlike version 1 of the Connect API, all monetary amounts returned
 * by v2 endpoints are positive. (In v1, monetary amounts are negative if they
 * represent money being paid by a merchant, instead of money being paid to a
 * merchant.)
 */
public class Money {

	/**
	 * The amount of money, in the lowest in the smallest denomination of the
	 * currency indicated by currency. For example, when currency_code is USD,
	 * amount is in cents.
	 */
	@JsonProperty
	private Integer amount;

	/**
	 * The type of currency, in ISO 4217 format. For example, the currency code
	 * for US dollars is USD.
	 *
	 * See <a href=
	 * "https://docs.connect.squareup.com/api/connect/v2/#type-currency">
	 * Currency</a> for possible values.
	 */
	@JsonProperty
	private String currency;

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
}
