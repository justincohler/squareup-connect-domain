package com.squareup.connect.domain;

import java.util.Date;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a tender (i.e., a method of payment) used in a Square transaction.
 */
public class Tender {

	/**
	 * The tender's unique ID.
	 */
	@JsonProperty
	private String id;

	/**
	 * The ID of the transaction's associated location.
	 */
	@JsonProperty("location_id")
	private String locationId;

	/**
	 * The ID of the tender's associated transaction.
	 */
	@JsonProperty("transaction_id")
	private String transactionId;

	/**
	 * The time when the tender was created, in RFC 3339 format.
	 */
	@JsonProperty("created_at")
	private Date createdAt;

	/**
	 * An optional note associated with the tender at the time of payment.
	 */
	@JsonProperty
	private String note;

	/**
	 * The amount of the tender.
	 */
	@JsonProperty("amount_money")
	private Money money;

	/**
	 * The amount of any Square processing fees applied to the tender.
	 */
	@JsonProperty("processing_fee_money")
	private Money processingFee;

	/**
	 * If the tender represents a customer's card on file, this is the ID of the
	 * associated customer.
	 */
	@JsonProperty("customer_id")
	private String customerId;

	/**
	 * The type of tender, such as CARD or CASH.
	 */
	@JsonProperty
	private TenderType type;

	/**
	 * The details of the card tender.
	 * 
	 * This value is present only if the value of type is CARD.
	 */
	@JsonProperty("card_details")
	private Optional<TenderCardDetails> cardDetails;

	/**
	 * The details of the cash tender.
	 *
	 * This value is present only if the value of type is CASH.
	 */
	@JsonProperty("cash_details")
	private Optional<TenderCashDetails> cashDetails;

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

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Money getMoney() {
		return money;
	}

	public void setMoney(Money money) {
		this.money = money;
	}

	public Money getProcessingFee() {
		return processingFee;
	}

	public void setProcessingFee(Money processingFee) {
		this.processingFee = processingFee;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public TenderType getType() {
		return type;
	}

	public void setType(TenderType type) {
		this.type = type;
	}

	public Optional<TenderCardDetails> getCardDetails() {
		return cardDetails;
	}

	public void setCardDetails(Optional<TenderCardDetails> cardDetails) {
		this.cardDetails = cardDetails;
	}

	public Optional<TenderCashDetails> getCashDetails() {
		return cashDetails;
	}

	public void setCashDetails(Optional<TenderCashDetails> cashDetails) {
		this.cashDetails = cashDetails;
	}

}
