package com.squareup.connect.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents one of a business's locations.
 */
public class Location {

	/**
	 * The location's unique ID.
	 */
	@JsonProperty
	private String id;

	/**
	 * The location's name.
	 */
	@JsonProperty
	private String name;

	/**
	 * The location's physical address.
	 */
	@JsonProperty
	private Address address;

	/**
	 * The <a href="https://www.iana.org/time-zones">IANA Timezone Database</a>
	 * identifier for the location's timezone.
	 */
	@JsonProperty
	private String timezone;

	/**
	 * Indicates which Square features are enabled for the location.
	 *
	 * See <a href=
	 * "https://docs.connect.squareup.com/api/connect/v2/#type-locationcapability">
	 * LocationCapability</a> for possible values.
	 */
	@JsonProperty
	private List<LocationCapability> capabilities;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public List<LocationCapability> getCapabilities() {
		return capabilities;
	}

	public void setCapabilities(List<LocationCapability> capabilities) {
		this.capabilities = capabilities;
	}
}
