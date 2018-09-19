package com.luv2code.springdemo.mvc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sun.javafx.collections.MappingChange.Map;

@Controller
@RequestMapping("/student")
public class StudentController {
	@Value("#{countryOptions}")
	private Map<String, String> countryOptions;
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		model.addAttribute("student", new Student());
		model.addAttribute("countries", countryOptions);
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") 
								Student student) {
		System.out.println("Student: " + student.getFirstName() +
							" " + student.getLastName() );
		return "student-confirmation";
	}
	
}
