package com.squareup.connect.domain;

/**
 * Indicates the Square product used to process a transaction.
 */
public enum TransactionProduct {

	/**
	 * Square Register.
	 */
	SQUARE_REGISTER,

	/**
	 * The Square Connect API.
	 */
	EXTERNAL_API,

	/**
	 * A Square subscription for one of multiple products.
	 */
	BILLING,

	/**
	 * Square Appointments.
	 */
	APPOINTMENTS,

	/**
	 * Square Invoices.
	 */
	INVOICES,

	/**
	 * Square Online Store.
	 */
	ONLINE_STORE,

	/**
	 * Square Payroll.
	 */
	PAYROLL,

	/**
	 * A Square product that does not match any other value.
	 */
	OTHER
}
