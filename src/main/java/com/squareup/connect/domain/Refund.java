package com.squareup.connect.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a refund processed for a Square transaction.
 */
public class Refund {

	/**
	 * The refund's unique ID.
	 */
	@JsonProperty
	private String id;

	/**
	 * The ID of the refund's associated location.
	 */
	@JsonProperty("location_id")
	private String locationId;

	/**
	 * The ID of the transaction that the refunded tender is part of.
	 */
	@JsonProperty("transaction_id")
	private String transactionId;

	/**
	 * The ID of the refunded tender.
	 */
	@JsonProperty("tender_id")
	private String tenderId;

	/**
	 * The time when the refund was created, in RFC 3339 format.
	 */
	@JsonProperty("created_at")
	private Date createdAt;

	/**
	 * The reason for the refund being issued.
	 */
	@JsonProperty
	private String reason;

	/**
	 * The amount of money refunded to the buyer.
	 */
	@JsonProperty("amount_money")
	private Money amount;

	/**
	 * The current status of the refund (PENDING, APPROVED, REJECTED, or
	 * FAILED).
	 */
	@JsonProperty
	private RefundStatus status;

	/**
	 * The amount of Square processing fee money refunded to the merchant.
	 */
	@JsonProperty("processing_fee_money")
	private Money processingFee;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLocationId() {
		return locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getTenderId() {
		return tenderId;
	}

	public void setTenderId(String tenderId) {
		this.tenderId = tenderId;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Money getAmount() {
		return amount;
	}

	public void setAmount(Money amount) {
		this.amount = amount;
	}

	public RefundStatus getStatus() {
		return status;
	}

	public void setStatus(RefundStatus status) {
		this.status = status;
	}

	public Money getProcessingFee() {
		return processingFee;
	}

	public void setProcessingFee(Money processingFee) {
		this.processingFee = processingFee;
	}
}
