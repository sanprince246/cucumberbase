package com.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Delete {
	public static void main(String[] args) {

		RequestSpecification reqspec;

		reqspec = RestAssured.given().header("Content-Type", "application/json");
		Response response = reqspec.delete("https://petstore.swagger.io/v2/pet/123");
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		String asPrettyString = response.asPrettyString();
		System.out.println(asPrettyString);

	}

}
