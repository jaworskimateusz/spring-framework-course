package com.luv2code.springdemo.mvc.training;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/validation")
public class CarsController {
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		StringTrimmerEditor stringTrimmerEditor =
				new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, stringTrimmerEditor);
	}

	@RequestMapping("/showForm")
	public String showForm(Model model) {
		model.addAttribute("sportCar", new SportCar());
		return "car-form";
	}
	
	@RequestMapping("/processData")
	public String processData(@Valid
							  @ModelAttribute("sportCar") 
							  SportCar sportCar, 
							  BindingResult bindingResult) {
		sportCar.setVin(sportCar.getVin().toUpperCase());
		System.out.println(bindingResult);
		if(bindingResult.hasErrors()) {
			return "car-form";
		} else {
			return "car-register";
		}
	}
}
