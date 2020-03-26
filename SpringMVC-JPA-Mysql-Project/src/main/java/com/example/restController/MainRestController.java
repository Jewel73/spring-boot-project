package com.example.restController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {
	@RequestMapping("/hello")
	public String hello(){
		return "hello World";
	}
}
