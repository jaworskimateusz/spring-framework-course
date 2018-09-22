package com.luv2code.springdemo.mvc.training;

import java.time.Year;
import java.util.LinkedHashMap;

public class Car {
	private String brand;
	private LinkedHashMap<String, String> years;
	private String year;
	private LinkedHashMap<String, String> engine;
	private String gearbox;
	
	public Car() {
		fillYears();
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	private void fillYears() {
		years = new LinkedHashMap<>();
		for(Integer i = 1975; i < Year.now().getValue(); i++) {
			years.put(i.toString(),i.toString());
		}
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public LinkedHashMap<String, String> getYears() {
		return years;
	}

	public void setYears(LinkedHashMap<String, String> years) {
		this.years = years;
	}

	public String getGearbox() {
		return gearbox;
	}

	public void setGearbox(String gearbox) {
		this.gearbox = gearbox;
	}

	public LinkedHashMap<String, String> getEngine() {
		return engine;
	}

	public void setEngine(LinkedHashMap<String, String> engine) {
		this.engine = engine;
	}

}