package com.squareup.connect.domain;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents one of a business's customers, which can have one or more cards on
 * file associated with it.
 */
public class Customer {

	/**
	 * The customer's unique ID.
	 */
	@JsonProperty
	private String id;

	/**
	 * A second ID you can set to associate the customer with an entity in
	 * another system.
	 */
	@JsonProperty("reference_id")
	private String reference_id;

	/**
	 * The time when the customer was created, in RFC 3339 format.
	 */
	@JsonProperty("created_at")
	private Date createdAt;

	/**
	 * The time when the customer was last updated, in RFC 3339 format.
	 */
	@JsonProperty("updated_at")
	private Date updatedAt;

	/**
	 * The non-confidential details of the customer's cards on file.
	 */
	@JsonProperty("cards")
	private List<Card> cards;

	/**
	 * The customer's given (i.e., first) name.
	 */
	@JsonProperty("given_name")
	private String givenName;

	/**
	 * The customer's family (i.e., last) name.
	 */
	@JsonProperty("family_name")
	private String familyName;

	/**
	 * The customer's nickname.
	 */
	@JsonProperty
	private Optional<String> nickname;

	/**
	 * The name of the customer's company.
	 */
	@JsonProperty("company_name")
	private Optional<String> companyName;

	/**
	 * The customer's email address.
	 */
	@JsonProperty("email_address")
	private String email;

	/**
	 * The customer's physical address.
	 */
	@JsonProperty("address")
	private Optional<Address> address;

	/**
	 * The customer's phone number.
	 */
	@JsonProperty("phone_number")
	private Optional<String> phoneNumber;

	/**
	 * A note to associate with the customer.
	 */
	@JsonProperty("note")
	private String note;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getReference_id() {
		return reference_id;
	}

	public void setReference_id(String reference_id) {
		this.reference_id = reference_id;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	public String getGivenName() {
		return givenName;
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public Optional<String> getNickname() {
		return nickname;
	}

	public void setNickname(Optional<String> nickname) {
		this.nickname = nickname;
	}

	public Optional<String> getCompanyName() {
		return companyName;
	}

	public void setCompanyName(Optional<String> companyName) {
		this.companyName = companyName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Optional<Address> getAddress() {
		return address;
	}

	public void setAddress(Optional<Address> address) {
		this.address = address;
	}

	public Optional<String> getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Optional<String> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

}
