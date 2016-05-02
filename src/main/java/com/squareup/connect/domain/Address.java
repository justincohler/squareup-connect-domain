package com.squareup.connect.domain;

import java.io.Serializable;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a physical address.
 */
public class Address implements Serializable {

	/**
	 * The first line of the address.
	 */
	@JsonProperty("address_line_1")
	private String addressLine1;

	/**
	 * The second line of the address, if any.
	 */
	@JsonProperty("address_line_2")
	private Optional<String> addressLine2;

	/**
	 * The third line of the address, if any.
	 */
	@JsonProperty("address_line_3")
	private Optional<String> addressLine3;

	/**
	 * The city or town of the address.
	 */
	@JsonProperty
	private String locality;

	/**
	 * A civil region within the address's locality, if any.
	 */
	@JsonProperty
	private Optional<String> sublocality;

	/**
	 * A civil region within the address's sublocality, if any.
	 */
	@JsonProperty("sublocality_2")
	private Optional<String> sublocality2;

	/**
	 * A civil region within the address's sublocality_2, if any.
	 */
	@JsonProperty("sublocality_3")
	private Optional<String> sublocality3;

	/**
	 * A civil entity within the address's country. In the US, this is the
	 * state.
	 */
	@JsonProperty("administrative_district_level_1")
	private String administrativeDistrictLevel1;

	/**
	 * A civil entity within the address's administrative_district_level_1. In
	 * the US, this is the county.
	 */
	@JsonProperty("administrative_district_level_2")
	private Optional<String> administrativeDistrictLevel2;

	/**
	 * A civil entity within the address's administrative_district_level_2, if
	 * any.
	 */
	@JsonProperty("administrative_district_level_3")
	private Optional<String> administrativeDistrictLevel3;

	/**
	 * The address's postal code.
	 */
	@JsonProperty("postal_code")
	private String postalCode;

	/**
	 * The address's country, in ISO 3166-1-alpha-2 format.
	 */
	@JsonProperty("country")
	private String country;

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public Optional<String> getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(Optional<String> addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public Optional<String> getAddressLine3() {
		return addressLine3;
	}

	public void setAddressLine3(Optional<String> addressLine3) {
		this.addressLine3 = addressLine3;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public Optional<String> getSublocality() {
		return sublocality;
	}

	public void setSublocality(Optional<String> sublocality) {
		this.sublocality = sublocality;
	}

	public Optional<String> getSublocality2() {
		return sublocality2;
	}

	public void setSublocality2(Optional<String> sublocality2) {
		this.sublocality2 = sublocality2;
	}

	public Optional<String> getSublocality3() {
		return sublocality3;
	}

	public void setSublocality3(Optional<String> sublocality3) {
		this.sublocality3 = sublocality3;
	}

	public String getAdministrativeDistrictLevel1() {
		return administrativeDistrictLevel1;
	}

	public void setAdministrativeDistrictLevel1(String administrativeDistrictLevel1) {
		this.administrativeDistrictLevel1 = administrativeDistrictLevel1;
	}

	public Optional<String> getAdministrativeDistrictLevel2() {
		return administrativeDistrictLevel2;
	}

	public void setAdministrativeDistrictLevel2(Optional<String> administrativeDistrictLevel2) {
		this.administrativeDistrictLevel2 = administrativeDistrictLevel2;
	}

	public Optional<String> getAdministrativeDistrictLevel3() {
		return administrativeDistrictLevel3;
	}

	public void setAdministrativeDistrictLevel3(Optional<String> administrativeDistrictLevel3) {
		this.administrativeDistrictLevel3 = administrativeDistrictLevel3;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
