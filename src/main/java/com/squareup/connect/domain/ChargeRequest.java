package com.squareup.connect.domain;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Charges a card represented by a card nonce or a customer's card on file.
 */
public class ChargeRequest {

	/**
	 * A value you specify that uniquely identifies this transaction among
	 * transactions you've created.
	 * 
	 * If you're unsure whether a particular transaction succeeded, you can
	 * reattempt it with the same idempotency key without worrying about
	 * double-charging the buyer.
	 * 
	 * See <a href=
	 * "https://docs.connect.squareup.com/api/connect/v2/#idempotencykeys">
	 * Idempotency keys</a> for more information.
	 */
	@JsonProperty("idempotency_key")
	private UUID idempotencyKey;

	/**
	 * The buyer's shipping address, if available. This value is optional, but
	 * this transaction is ineligible for chargeback protection if neither this
	 * parameter nor billing_address is provided.
	 */
	@JsonProperty("shipping_address")
	private Address shippingAddress;

	/**
	 * The buyer's billing address. This value is optional, but this transaction
	 * is ineligible for chargeback protection if neither this parameter nor
	 * shipping_address is provided.
	 */
	@JsonProperty("billing_address")
	private Address billingAddress;

	/**
	 * The amount of money to charge.
	 * 
	 * The value of currency must match the currency associated with the
	 * business that is charging the card.
	 */
	@JsonProperty("amount_money")
	private Money amount;

	/**
	 * A nonce generated from the SqPaymentForm that represents the card to
	 * charge.
	 * 
	 * The application that provides a nonce to this endpoint must be the same
	 * application that generated the nonce with the SqPaymentForm. Otherwise,
	 * the nonce is invalid.
	 * 
	 * Do not provide a value for this field if you provide a value for
	 * customer_card_id.
	 */
	@JsonProperty("cardnonce")
	private String cardNonce;

	/**
	 * The ID of the customer card on file to charge. Do not provide a value for
	 * this field if you provide a value for card_nonce.
	 * 
	 * If you provide this value, you must also provide a value for customer_id.
	 */
	@JsonProperty("customer_card_id")
	private String customerCardId;

	/**
	 * The ID of the customer to associate this transaction with. This field is
	 * required if you provide a value for customer_card_id, and optional
	 * otherwise.
	 */
	@JsonProperty("customer_id")
	private String customerId;

	/**
	 * The buyer's email address, if available. This value is optional, but this
	 * transaction is ineligible for chargeback protection if it is not
	 * provided.
	 */
	@JsonProperty("buyer_email_address")
	private String buyerEmail;

	/**
	 * An optional ID you can associate with the transaction for your own
	 * purposes (such as to associate the transaction with an entity ID in your
	 * own database).
	 * 
	 * This value cannot exceed 40 characters.
	 */
	@JsonProperty("reference_id")
	private String reference_id;

	/**
	 * An optional note to associate with the transaction.
	 * 
	 * This value cannot exceed 60 characters.
	 */
	@JsonProperty
	private String note;

	/**
	 * If true, the request will only perform an Auth on the provided card. You
	 * can then later perform either a Capture (with the CaptureTransaction
	 * endpoint) or a Void (with the VoidTransation endpoint).
	 * 
	 * Default value: false
	 */
	@JsonProperty("delay_capture")
	private Boolean delayCapture = false;

	public UUID getIdempotencyKey() {
		return idempotencyKey;
	}

	public void setIdempotencyKey(UUID idempotencyKey) {
		this.idempotencyKey = idempotencyKey;
	}

	public Address getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public Address getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}

	public Money getAmount() {
		return amount;
	}

	public void setAmount(Money amount) {
		this.amount = amount;
	}

	public String getCardNonce() {
		return cardNonce;
	}

	public void setCardNonce(String cardNonce) {
		this.cardNonce = cardNonce;
	}

	public String getCustomerCardId() {
		return customerCardId;
	}

	public void setCustomerCardId(String customerCardId) {
		this.customerCardId = customerCardId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getBuyerEmail() {
		return buyerEmail;
	}

	public void setBuyerEmail(String buyerEmail) {
		this.buyerEmail = buyerEmail;
	}

	public String getReference_id() {
		return reference_id;
	}

	public void setReference_id(String reference_id) {
		this.reference_id = reference_id;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Boolean getDelayCapture() {
		return delayCapture;
	}

	public void setDelayCapture(Boolean delayCapture) {
		this.delayCapture = delayCapture;
	}

}
