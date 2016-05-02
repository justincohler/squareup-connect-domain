package com.squareup.connect.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents an error encountered during a request to the Connect API.
 * 
 * See
 * <a href="https://docs.connect.squareup.com/api/connect/v2/#handlingerrors">
 * Handling errors</a> for more information.
 */
public class Error {

	/**
	 * The error's high-level category. See <a href=
	 * "https://docs.connect.squareup.com/api/connect/v2/#type-errorcategory">
	 * ErrorCategory</a> for possible values.
	 */
	@JsonProperty
	private ErrorCategory category;

	/**
	 * The error's specific code. See <a href=
	 * "https://docs.connect.squareup.com/api/connect/v2/#type-errorcode">
	 * ErrorCode</a> for possible values
	 */
	@JsonProperty
	private String code;

	/**
	 * A human-readable description of the error for debugging purposes.
	 */
	@JsonProperty
	private String detail;

	/**
	 * The name of the field provided in the original request that the error
	 * pertains to, if any.
	 */
	@JsonProperty
	private String field;

	public ErrorCategory getCategory() {
		return category;
	}

	public void setCategory(ErrorCategory category) {
		this.category = category;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}
}
