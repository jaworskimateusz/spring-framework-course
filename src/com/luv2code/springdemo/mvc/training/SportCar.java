package com.luv2code.springdemo.mvc.training;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.luv2code.springdemo.mvc.training.validation.Location;

public class SportCar {
	
	@NotNull(message="Required.")
	@Size(min=2, max=48, message="The size must be between 2 and 48 characters. ")
	private String brand;
	
	@NotNull(message="Required.")
	@Size(min=1)
	private String color;
	
	@Min(value=1, message="Must be more or equal to 1.")
	@Max(value=10000, message="Must be less or equal to 10000")
	private Integer horsepower;
	
	@NotNull(message="Required.")
	@Pattern(regexp="^[a-zA-Z0-9]{17}", message="VIN number is 17 chars/digs long.")
	private String vin;
	
	@Location
	private String location;
	
	public SportCar() {
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getHorsepower() {
		return horsepower;
	}

	public void setHorsepower(Integer horsepower) {
		this.horsepower = horsepower;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
}
