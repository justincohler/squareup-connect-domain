package com.squareup.connect.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ChargeResponse {

	/**
	 * Any errors that occurred during the request.
	 */
	@JsonProperty
	private List<Error> errors;

	/**
	 * The created transaction.
	 */
	@JsonProperty
	private Transaction transaction;

	public List<Error> getErrors() {
		return errors;
	}

	public void setErrors(List<Error> errors) {
		this.errors = errors;
	}

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}
}
