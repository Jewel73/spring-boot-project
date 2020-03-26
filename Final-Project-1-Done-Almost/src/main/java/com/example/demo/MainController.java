package com.example.demo;

import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	@Autowired
	public BookService service;
	
	
	@GetMapping(value="/")
	public String show(HttpServletRequest req) {
		req.setAttribute("books", service.findAllBook());
		req.setAttribute("mode", "BOOK_VIEW");
		return "main-page";
	}
	
	@GetMapping(value="/editpage")
	public String editform(@RequestParam Integer id, HttpServletRequest req) {
		req.setAttribute("book", service.getOne(id));
		req.setAttribute("mode", "EDIT_VIEW");
		return "main-page";
	}
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(    Date.class,
				new CustomDateEditor(new SimpleDateFormat("yyy-mm-dd"), false));
	}
	
	
	@PostMapping("/save")
	public void save(@ModelAttribute Book book, BindingResult bindingResult, HttpServletRequest req, HttpServletResponse res) throws IOException {
		service.save(book);
		
		req.setAttribute("mode", "BOOK_VIEW");
		res.sendRedirect("/");
		
	}
	
	@GetMapping("/addData")
	public String adddata(HttpServletRequest req) {
		req.setAttribute("mode", "ADD_DATA");
		return "main-page";
	}
}
