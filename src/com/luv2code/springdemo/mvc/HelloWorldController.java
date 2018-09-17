package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("/processFormTwo")
	public String takeItToUpper(HttpServletRequest request, 
								Model model) {
		String name = request.getParameter("studentName")
							 .toUpperCase();
		model.addAttribute("textUpper", "Yo " + name + "!");
		
		return "helloworld";
	}
	
	@RequestMapping("/processFormThree")
	public String processFormThree(@RequestParam("studentName")
									String name, 
									Model model) {
		model.addAttribute("message", name.toLowerCase());
		return "helloworld";
	}
}
