package com.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pojo.Data;
import com.pojo.Employee;
import com.pojo.Support;

public class Sample {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		File file = new File(
				"C:\\Users\\Elaravasan.E\\eclipse-workspace\\CucumberBase\\src\\test\\java\\com\\api\\ReqressListUser.json");

		ObjectMapper mapper = new ObjectMapper();

		Employee employee = mapper.readValue(file, Employee.class);

		int page = employee.getPage();
		System.out.println(page);
		int perpage = employee.getPer_page();
		System.out.println(perpage);
		int total = employee.getTotal();
		System.out.println(total);
		int totalpages = employee.getTotal_pages();
		System.out.println(totalpages);

		ArrayList<Data> data = employee.getData();
		for (Data data2 : data) {
			int id = data2.getId();
			System.out.println(id);
			String email = data2.getEmail();
			System.out.println(email);
			String firstname = data2.getFirst_name();
			System.out.println(firstname);
			String firstname2 = data2.getFirst_name();
			System.out.println(firstname2);
			String avatar = data2.getAvatar();
			System.out.println(avatar);
		}

		Support support = employee.getSupport();
		String url = support.getUrl();
		System.out.println(url);
		String text = support.getText();
		System.out.println(text);

	}

}
