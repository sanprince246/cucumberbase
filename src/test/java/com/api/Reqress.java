package com.api;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Reqress {
	public static void main(String[] args) throws IOException, ParseException {
		FileReader reader = new FileReader("C:\\Users\\Elaravasan.E\\eclipse-workspace\\CucumberBase\\src\\main\\java\\com\\api\\Reqress.json");
		JSONParser jsonparser = new JSONParser();
		Object object = jsonparser.parse(reader);
		
		JSONObject j= (JSONObject)object;
		
		Object object2 = j.get("data");
		
		JSONObject jData=(JSONObject)object2;
		
		Object jId = jData.get("id");
		System.out.println(jId);
		Object jEmail = jData.get("email");
		System.out.println(jEmail);
		Object jFirstName = jData.get("first_name");
		System.out.println(jFirstName);
		Object jLastName = jData.get("last_name");
		System.out.println(jLastName);
		Object javatar = jData.get("avatar");
		System.out.println(javatar);
		Object object3 = j.get("support");
		JSONObject jsupport=(JSONObject)object3;
		Object jUrl = jsupport.get("url");
		System.out.println(jUrl);
		Object jText = jsupport.get("text");
		System.out.println(jText);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
