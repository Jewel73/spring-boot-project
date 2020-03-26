package com.example.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Product;
import com.example.service.ServiceClass;

@RestController
public class RestControllerClass {
	@Autowired
	private ServiceClass service;
	
	@GetMapping("/")
	public List<Product> show(){
		return service.lists();
	}
	
	
}
