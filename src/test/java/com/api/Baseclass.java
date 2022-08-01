package com.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Baseclass {
	RequestSpecification reqspec;
	Response response;

	public void addHeader(String key, String value) {
		reqspec = RestAssured.given().header(key, value);
		//return reqspec;
		
	}

	public void queryParam(String key, String value) {
		reqspec = reqspec.queryParam(key, value);
	}

	public void pathParam(String key, String value) {
		reqspec = reqspec.pathParam(key, value);
	}

	public void addBody(String body) {
		reqspec = reqspec.body(body);
	}

	public Response requestType(String type, String endPoint) {
		switch (type) {
		case "GET":
			response = reqspec.get(endPoint);
			break;
		case "POST":
			response = reqspec.post(endPoint);
			break;
		case "PUT":
			response = reqspec.put(endPoint);
			break;
		case "DELETE":
			response = reqspec.delete(endPoint);
			break;

		default:
			break;
		}
		return response;
	}

	public int getResponseCode(Response response) {
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		return statusCode;
	}

	public String getBodyAsString(Response response) {
		String asString = response.asString();
		return asString;
		
	}

	public String getBodyAsPrettyString(Response response) {
		String asPrettyString = response.asPrettyString();
		return asPrettyString;
		
	}
	
	public void basicAuth(String userName, String password) {
		reqspec= reqspec.auth().preemptive().basic(userName, password);
		
		
		
	}

}
