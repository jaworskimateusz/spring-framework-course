package com.luv2code.springdemo.mvc.training.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class LocationConstraintValidatior
	implements ConstraintValidator<Location, String>{
	
	private String location;

	@Override
	public void initialize(Location location) {
		this.location = location.value();
	}
	
	@Override
	public boolean isValid(String code, 
			ConstraintValidatorContext constraintValidatorContext) {
		return (code != null)?code.contains(location):true;
	}

}
