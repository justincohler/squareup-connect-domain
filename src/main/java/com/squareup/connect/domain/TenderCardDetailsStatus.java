package com.squareup.connect.domain;

/**
 * Indicates the card transaction's current status.
 */
public enum TenderCardDetailsStatus {

	/**
	 * The card transaction has been authorized but not yet captured.
	 */
	AUTHORIZED,

	/**
	 * The card transaction was authorized and subsequently captured (i.e.,
	 * completed).
	 */
	CAPTURED,

	/**
	 * The card transaction was authorized and subsequently voided (i.e.,
	 * canceled).
	 */
	VOIDED,

	/**
	 * The card transaction failed.
	 */
	FAILED
}
