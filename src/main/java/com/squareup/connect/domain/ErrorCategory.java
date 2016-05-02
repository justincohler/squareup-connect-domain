package com.squareup.connect.domain;

/**
 * Indicates which high-level category of error has occurred during a request to
 * the Connect API.
 */
public enum ErrorCategory {

	/**
	 * An error occurred with the Connect API itself.
	 */
	API_ERROR,

	/**
	 * An authentication error occurred. Most commonly, the request had a
	 * missing, malformed, or otherwise invalid Authorization header.
	 */
	AUTHENTICATION_ERROR,

	/**
	 * The request was invalid. Most commonly, a required parameter was missing,
	 * or a provided parameter had an invalid value.
	 */
	INVALID_REQUEST_ERROR,

	/**
	 * Your application reached the Connect API rate limit. Retry your request
	 * after a while.
	 */
	RATE_LIMIT_ERROR,

	/**
	 * An error occurred while processing a payment method. Most commonly, the
	 * details of the payment method were invalid (such as a card's CVV or
	 * expiration date).
	 */
	PAYMENT_METHOD_ERROR,

	/**
	 * An error occurred while attempting to process a refund.
	 */
	REFUND_ERROR
}
