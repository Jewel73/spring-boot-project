package com.example.demo;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {

	@Autowired
	private ProductService service;

// @GetMapping("/") public String show() { return "index"; }
	
	@GetMapping("/")
	public String mainpage() {
		return "index";
	}
	@GetMapping("/products")
	public String getAll(Model model, HttpServletRequest req) {
		List<Product> products=service.getList();
		model.addAttribute("products", products);
		
		return "product";
	}

	@GetMapping("/form")
	public String getForm( Model model) {
		Product product=new Product();
		model.addAttribute(product);
		return "form";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(    Date.class,
				new CustomDateEditor(new SimpleDateFormat("yyy-mm-dd"), false));
	}

	@PostMapping("/process")
	public String save(@ModelAttribute("product") Product product, BindingResult bindingResult) {
		service.save(product);
		return "redirect:/products";
	}

	@GetMapping("/edit")
	public ModelAndView edit(Integer product_id) {
		ModelAndView mv = new ModelAndView("edit-page");
		Product product = service.getOneProduct(product_id);
		mv.addObject("product", product);
		return mv;
	}

	@GetMapping("/delete")
	public String delete(Integer product_id) {
		service.delete(product_id);
		return "redirect:/products";
	}
}
