package com.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pojo.Data;
import com.pojo.PojoForWrite;
import com.pojo.Support;

public class JsonWrite {
		public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
			File file = new File("C:\\Users\\Elaravasan.E\\eclipse-workspace\\CucumberBase\\target\\Hello.json");
			ObjectMapper mapper = new ObjectMapper();

			ArrayList<Data> data = new ArrayList<Data>();
			Data e1 = new Data(7, "michael.lawson@reqres.in", "Michael", "Lawson", "https://reqres.in/img/faces/7-image.jpg");
			Data e2 = new Data(8, "lindsay.ferguson@reqres.in", "Lindsay", "Ferguson", "https://reqres.in/img/faces/8-image.jpg");
			Data e3 = new Data(9, "tobias.funke@reqres.in", "Tobias", "Funke", "https://reqres.in/img/faces/9-image.jpg");
			Data e4 = new Data(10, "byron.fields@reqres.in", "Byron", "Fields", "https://reqres.in/img/faces/10-image.jpg");
			Data e5 = new Data(11, "george.edwards@reqres.in", "George", "Edwards", "https://reqres.in/img/faces/11-image.jpg");
			Data e6 = new Data(12, "rachel.howell@reqres.in", "Rachel", "Howell", "https://reqres.in/img/faces/12-image.jpg");
			data.add(e1);
			data.add(e2);
			data.add(e3);
			data.add(e4);
			data.add(e5);
			data.add(e6);
			
			Support a = new Support("https://reqres.in/#support-heading", "To keep ReqRes free, contributions towards server costs are appreciated!");
			
			PojoForWrite e = new PojoForWrite(1, 23, 342, 31, data, a);
			
		}
	    
	}


