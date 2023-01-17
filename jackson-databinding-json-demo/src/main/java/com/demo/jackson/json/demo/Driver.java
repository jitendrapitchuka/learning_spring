package com.demo.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {
		
		try {
			
			ObjectMapper mapper=new ObjectMapper();
			
			Student theStudent=mapper.readValue(new File("data/sample-full.json"), Student.class);
			
			System.out.println(theStudent.getFirstName());
			System.out.println(theStudent.getLastName());
			System.out.println(theStudent.getAddress().getStreet());
			
			for(String x:theStudent.getLanguages())
				System.out.println(x);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
