package com.luv2code.springdemo.mvc.training;

import java.util.LinkedHashMap;
import org.springframework.beans.factory.annotation.Value;
//import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/training")
public class TrainingController {
	@Value("#{engineKind}")
	private LinkedHashMap<String, String> engineKind;

	@RequestMapping("/car")
	public String getHomePage() {
		return "index";
	}
	
	@RequestMapping("/carForm")
	public String showForm(Model model) {
		model.addAttribute("car", new Car());
		model.addAttribute("engines", engineKind);
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
