package com.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class GET {
	public static void main(String[] args) {
		RequestSpecification reqspec;
		
		 reqspec = RestAssured.given();
		 reqspec = reqspec.header("accept","application/json");
		 reqspec.queryParam("status", "available");
		 Response response = reqspec.get("https://petstore.swagger.io/v2/pet/findByStatus?status=available");
		 int statusCode = response.getStatusCode();
		 System.out.println(statusCode);
		ResponseBody body = response.getBody();
		
//		String asString = body.asString();
//		System.out.println(asString);
		
		String asPrettyString = body.asPrettyString();
		System.out.println(asPrettyString);
		
		
		
	}
}
