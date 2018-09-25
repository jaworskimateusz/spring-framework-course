package com.luv2code.springdemo.mvc.training;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class SportCar {
	
	@NotNull(message="Required.")
	@Size(min=2, max=48, message="The size must be between 2 and 48 characters. ")
	private String brand;
	
	@NotNull(message="Required")
	@Size(min=1)
	private String color;
	
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
}
