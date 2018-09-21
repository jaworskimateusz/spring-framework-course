package com.luv2code.springdemo.mvc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;


public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private String favouriteLanguage;
	private HashMap<String,String> languageOptions;
	private String[] operatingSystems;
	
	public Student() {
		setlanguageOptions();
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

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

	public String getFavouriteLanguage() {
		return favouriteLanguage;
	}

	public void setFavouriteLanguage(String favouriteLanguage) {
		this.favouriteLanguage = favouriteLanguage;
	}
	
	private void setlanguageOptions() {
		languageOptions = new LinkedHashMap<String, String>();
		readFromFile(languageOptions);
	}
	private void readFromFile(HashMap<String,String> languageOptions) {
		String filePath = "C:\\Users\\jawor\\Desktop\\Programming\\Java\\Spring Framework\\12_spring-mvc-demo\\WebContent\\WEB-INF\\programming.txt";
		String line;
		try {
			BufferedReader reader =
					new BufferedReader(new FileReader(filePath));
			while((line = reader.readLine()) != null) {
				splitLines(line);
			}
			reader.close();
		} catch(IOException e) {
			e.getMessage();
		}	
	}
	
	private void splitLines(String line) {
		String[] parts = line.split(":", 2);
		if(parts.length >= 2) {
			String key = parts[0];
			String value = parts[1];
			languageOptions.put(key, value);
		} 
	}

	public HashMap<String, String> getLanguageOptions() {
		return languageOptions;
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
