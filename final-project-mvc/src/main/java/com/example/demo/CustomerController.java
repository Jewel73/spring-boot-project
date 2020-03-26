package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {
	@RequestMapping("/")
	public String showForm(Model model) {
		Customer theCustomer=new Customer();
		model.addAttribute("customer", theCustomer);
		return "form-page";
		
	}
	@RequestMapping("processform")
	public String process(@ModelAttribute("customer") Customer theCustomer) {
		return "process-page";
	}
}







