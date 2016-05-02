package com.squareup.connect.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents the non-confidential details of a credit card.
 */
public class Card {

	/**
	 * The card's unique ID, if any.
	 */
	@JsonProperty
	private String id;

	/**
	 * The card's brand (such as VISA). See <a href=
	 * "https://docs.connect.squareup.com/api/connect/v2/#type-cardbrand">
	 * CardBrand</a> for all possible values.
	 */
	@JsonProperty("card_brand")
	private CardBrand brand;

	/**
	 * The last 4 digits of the card's number.
	 */
	@JsonProperty("last_4")
	private String last4;

	/**
	 * The month of the card's expiration date. This value is always between 1
	 * and 12, inclusive.
	 */
	@JsonProperty("exp_month")
	private Integer expireMonth;

	/**
	 * The four-digit year of the card's expiration date.
	 */
	@JsonProperty("exp_year")
	private Integer expireYear;

	/**
	 * The cardholder name. This value is present only if this object represents
	 * a customer's card on file.
	 */
	@JsonProperty("cardholder_name")
	private String cardholderName;

	/**
	 * The card's billing address. This value is present only if this object
	 * represents a customer's card on file.
	 */
	@JsonProperty("billing_address")
	private Address billingAddress;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public CardBrand getBrand() {
		return brand;
	}

	public void setBrand(CardBrand brand) {
		this.brand = brand;
	}

	public String getLast4() {
		return last4;
	}

	public void setLast4(String last4) {
		this.last4 = last4;
	}

	public Integer getExpireMonth() {
		return expireMonth;
	}

	public void setExpireMonth(Integer expireMonth) {
		this.expireMonth = expireMonth;
	}

	public Integer getExpireYear() {
		return expireYear;
	}

	public void setExpireYear(Integer expireYear) {
		this.expireYear = expireYear;
	}

	public String getCardholderName() {
		return cardholderName;
	}

	public void setCardholderName(String cardholderName) {
		this.cardholderName = cardholderName;
	}

	public Address getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}

}
