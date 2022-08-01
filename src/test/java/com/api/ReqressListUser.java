package com.api;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReqressListUser {
	public static void main(String[] args) throws IOException, ParseException {
		FileReader reader = new FileReader(
				"C:\\Users\\Elaravasan.E\\eclipse-workspace\\CucumberBase\\src\\main\\java\\com\\api\\ReqressListUser.json");
		JSONParser jsonparser = new JSONParser();
		Object object = jsonparser.parse(reader);
		JSONObject j = (JSONObject) object;
		Object jPage = j.get("page");
		System.out.println(jPage);

		Object jPerPage = j.get("per_page");
		System.out.println(jPerPage);

		Object jTotal = j.get("total");
		System.out.println(jTotal);

		Object jTotalPages = j.get("total_pages");
		System.out.println(jTotalPages);

		Object jdata = j.get("data");
		JSONArray a = (JSONArray) jdata;
		for (int i = 0; i < a.size(); i++) {
			Object object2 = a.get(i);

			JSONObject a1 = (JSONObject) object2;

			Object jId = a1.get("id");
			System.out.println(jId);
			Object jEmail = a1.get("email");
			System.out.println(jEmail);
			Object jFirstName = a1.get("first_name");
			System.out.println(jFirstName);
			Object jLastName = a1.get("last_name");
			System.out.println(jLastName);
			Object javatar = a1.get("avatar");
			System.out.println(javatar);

		}
		Object object3 = j.get("support");
		JSONObject jsupport = (JSONObject) object3;
		Object jUrl = jsupport.get("url");
		System.out.println(jUrl);
		Object jText = jsupport.get("text");
		System.out.println(jText);

	}

}
