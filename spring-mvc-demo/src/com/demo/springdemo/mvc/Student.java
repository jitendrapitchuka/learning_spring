package com.demo.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private String favoriteLanguage;
	
	

	private LinkedHashMap<String,String>countryOptions;
	private String operatingSystem[];


public Student() {
	
	countryOptions =new LinkedHashMap<>();
	
	countryOptions.put("ind", "India");
	countryOptions.put("pak", "pakistan");
	countryOptions.put("chi", "china");
		
	}

public String[] getOperatingSystem() {
	return operatingSystem;
}
public void setOperatingSystem(String[] operatingSystem) {
	this.operatingSystem = operatingSystem;
}
public String getFavoriteLanguage() {
	return favoriteLanguage;
}

public void setFavoriteLanguage(String favouriteLanguage) {
	this.favoriteLanguage = favouriteLanguage;
}
	
	public LinkedHashMap<String, String> getCountryOptions() {
	return countryOptions;
}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
}
