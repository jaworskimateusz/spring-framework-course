package com.luv2code.springdemo.mvc.training.validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = LocationConstraintValidatior.class)
@Target({ FIELD, METHOD })
@Retention(RUNTIME)
public @interface Location {

	public String value() default "and";
	
	public String message() default "The location must have %and";
	
	public Class<?>[] groups() default {};
	
	public Class<? extends Payload>[] payload() default {};
}
