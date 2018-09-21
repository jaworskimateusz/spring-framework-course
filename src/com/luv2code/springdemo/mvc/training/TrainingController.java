package com.luv2code.springdemo.mvc.training;

//import java.util.ArrayList;
//import java.util.List;

//import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/training")
public class TrainingController {

	@RequestMapping("/car")
	public String getHomePage() {
		return "index";
	}
	
	@RequestMapping("/carForm")
	public String showForm(Model model) {
		model.addAttribute("car", new Car());
		return "form";
	}
	/*
	@RequestMapping("/submitData")
	public String submitData(HttpServletRequest request,
							 Model model) {
		String brand = request.getParameter("carBrand");
		String year = request.getParameter("year");
		String email = request.getParameter("email");
		
		//just to test how to print list 
		List<String> cars = new ArrayList<String>();
		cars.add("Audi");
		cars.add("BMW");
		cars.add("Mercedes");
		
		model.addAttribute("brand", brand);
		model.addAttribute("year", year);
		model.addAttribute("email",email);
		model.addAttribute("cars",cars);
		
		return "result";
	}
	
	@RequestMapping("/submitData")
	public String submitData(@RequestParam("carBrand")
								String brand,
								Model model) {
		model.addAttribute("brand", brand);
		return "result";
	}
	*/
	
	@RequestMapping("/submitData")
	public String submitData(@ModelAttribute("car")
								Car car) {
		return "result";
	}
	
	
	
	
}
