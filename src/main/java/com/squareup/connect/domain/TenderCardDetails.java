package com.squareup.connect.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents additional details of a tender with type CARD or SQUARE_GIFT_CARD
 */
public class TenderCardDetails {

	/**
	 * The credit card payment's current state (such as AUTHORIZED or CAPTURED).
	 * See <a href=
	 * "https://docs.connect.squareup.com/api/connect/v2/#type-tendercarddetailsstatus">
	 * TenderCardDetailsStatus</a> for possible values.
	 */
	@JsonProperty
	private TenderCardDetailsStatus status;

	/**
	 * The credit card's non-confidential details.
	 */
	@JsonProperty
	private Card card;

	/**
	 * The method used to enter the card's details for the transaction.
	 */
	@JsonProperty("entry_method")
	private TenderCardDetailsEntryMethod entryMethod;

	public TenderCardDetailsStatus getStatus() {
		return status;
	}

	public void setStatus(TenderCardDetailsStatus status) {
		this.status = status;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	public TenderCardDetailsEntryMethod getEntryMethod() {
		return entryMethod;
	}

	public void setEntryMethod(TenderCardDetailsEntryMethod entryMethod) {
		this.entryMethod = entryMethod;
	}
}
