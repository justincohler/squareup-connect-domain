package com.squareup.connect.domain;

/**
 * Indicates a tender's type.
 */
public enum TenderType {

	/**
	 * A credit card.
	 */
	CARD,

	/**
	 * Cash.
	 */
	CASH,

	/**
	 * A credit card processed with a card processor other than Square.
	 * 
	 * This value applies only to merchants in countries where Square does not
	 * yet provide card processing.
	 */
	THIRD_PARTY_CARD,

	/**
	 * A Square gift card.
	 */
	SQUARE_GIFT_CARD,

	/**
	 * This tender represents the register being opened for a "no sale" event.
	 */
	NO_SALE,

	/**
	 * A form of tender that does not match any other value.
	 */
	OTHER
}
