package com.squareup.connect.domain;

/**
 * Indicates account capabilities that a business's location might or might not
 * have enabled.
 */
public enum LocationCapability {

	/**
	 * The location can process credit cards with Square.
	 * 
	 * If this value is not present in a <a href=
	 * "https://docs.connect.squareup.com/api/connect/v2/#type-location">
	 * Location</a>'s' capabilities array, the location cannot process credit
	 * cards.
	 */
	CREDIT_CARD_PROCESSING
}
