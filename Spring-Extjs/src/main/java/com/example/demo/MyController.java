package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(value = "*")
public class MyController {
	
	@Autowired
	 private ServiceClass service;
	
	@RequestMapping(value="/welcome")
	public static String welcome() {
		return "Welcome to Spring Boot";
	}
	
	@RequestMapping(method=RequestMethod.POST, value="api")
	public Response work(@RequestBody User user) {
		return service.post(user);
	}
}
