package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeController {
	@Autowired
	private EmployeService service;
	
	
	
	@RequestMapping(method=RequestMethod.GET, value="Employe")
	public List<Employe> show(){
		return service.show();
	}
}
