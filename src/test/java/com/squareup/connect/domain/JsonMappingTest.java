package com.squareup.connect.domain;

import static org.junit.Assert.fail;

import java.util.Optional;
import java.util.UUID;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonMappingTest {

	@Test
	public void testChargeToJson() {

		ChargeRequest request = new ChargeRequest();
		request.setIdempotencyKey(UUID.randomUUID());
		request.setShippingAddress(mockAddress());
		request.setBillingAddress(mockAddress());
		request.setBuyerEmail("foo@bar.com");
		request.setCustomerCardId("4444444444444444");
		ObjectMapper om = new ObjectMapper();
		String jsonString = "";
		try {
			jsonString = om.writeValueAsString(request);
		} catch (JsonProcessingException e) {
			fail("Failed to convert ChargeRequest to JSON with error: " + e.getMessage());
		}
		assert (!jsonString.isEmpty());
		System.out.println(jsonString);
	}

	public Address mockAddress() {
		Address a = new Address();
		a.setAddressLine1("123 Main St");
		a.setAddressLine2(Optional.of("Apt. 2"));
		a.setLocality("Brooklyn");
		a.setAdministrativeDistrictLevel1("New York");
		a.setAdministrativeDistrictLevel2(Optional.of("Kings County"));
		a.setPostalCode("11217");
		a.setCountry("US");
		return a;
	}

}
