package com.squareup.connect.domain;

/**
 * Indicates a refund's current status.
 */
public enum RefundStatus {

	/**
	 * The refund is pending.
	 */
	PENDING,

	/**
	 * The refund has been approved by Square.
	 */
	APPROVED,

	/**
	 * The refund has been rejected by Square.
	 */
	REJECTED,

	/**
	 * The refund failed.
	 */
	FAILED
}
