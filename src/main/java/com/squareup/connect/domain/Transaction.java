package com.squareup.connect.domain;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a transaction processed with Square, either with the Connect API
 * or with Square Register.
 * 
 * The tenders field of this object lists all methods of payment used to pay in
 * the transaction.
 */
public class Transaction {

	/**
	 * The transaction's unique ID, issued by Square payments servers.
	 */
	@JsonProperty
	private String id;

	/**
	 * The ID of the transaction's associated location.
	 */
	@JsonProperty("location_id")
	private String locationId;

	/**
	 * The time when the transaction was created, in RFC 3339 format.
	 */
	@JsonProperty("created_at")
	private Date createdAt;

	/**
	 * The tenders used to pay in the transaction.
	 */
	@JsonProperty
	private List<Tender> tenders;

	/**
	 * Refunds that have been applied to any tender in the transaction.
	 */
	@JsonProperty
	private List<Refund> refunds;

	/**
	 * If the transaction was created with the <a href=
	 * "https://docs.connect.squareup.com/api/connect/v2/#endpoint-charge">
	 * Charge</a> endpoint, this value is the same as the value provided for the
	 * reference_id parameter in the request to that endpoint. Otherwise, it is
	 * not set.
	 */
	@JsonProperty("reference_id")
	private Optional<String> referenceId;

	/**
	 * The Square product that processed the transaction.
	 */
	@JsonProperty
	private String product;

	/**
	 * The client transaction identifier, populated for transactions created by
	 * Square Register app only, including the ones created through Register
	 * API. It can be used as a unique reference to an offline or other types of
	 * asynchronously processed transaction before a server issued transaction
	 * identifier becomes available.
	 */
	@JsonProperty("client_id")
	private Optional<String> clientId;

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

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public List<Tender> getTenders() {
		return tenders;
	}

	public void setTenders(List<Tender> tenders) {
		this.tenders = tenders;
	}

	public List<Refund> getRefunds() {
		return refunds;
	}

	public void setRefunds(List<Refund> refunds) {
		this.refunds = refunds;
	}

	public Optional<String> getReferenceId() {
		return referenceId;
	}

	public void setReferenceId(Optional<String> referenceId) {
		this.referenceId = referenceId;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public Optional<String> getClientId() {
		return clientId;
	}

	public void setClientId(Optional<String> clientId) {
		this.clientId = clientId;
	}

}
