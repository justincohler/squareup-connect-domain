package com.squareup.connect.domain;

/**
 * Indicates the method used to enter the card's details.
 */
public enum TenderCardDetailsEntryMethod {

	/**
	 * The card was swiped through a Square reader or Square stand.
	 */
	SWIPED,

	/**
	 * The card information was keyed manually into Square Register or a
	 * Square-hosted web form.
	 */
	KEYED,

	/**
	 * The card was processed via EMV with a Square reader.
	 */
	EMV,

	/**
	 * The buyer's card details were already on file with Square.
	 */
	ON_FILE,

	/**
	 * The card was processed via a contactless (i.e., NFC) transaction with a
	 * Square reader.
	 */
	CONTACTLESS
}
