package com.example.demo;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerMain {
	@Autowired
	private ProductService service;
	
	@GetMapping("/c")
	public List<Product> getAll() {
		return service.getList();
	}
}
