package com.luv2code.springdemo.mvc;


public class Student {
	private String firstName;
	private String lastName;
	private String country;
	//private LinkedHashMap<String, String> countryOptions;
	
	public Student() {
		//fillCountryOptions();
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
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	/*
	private void fillCountryOptions() {
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("Brazil", "Brazil");
		countryOptions.put("France", "France");
		countryOptions.put("Germany", "Germany");
		countryOptions.put("India", "India");
		countryOptions.put("USA", "United States of America");
	}
	
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	*/

	
}
