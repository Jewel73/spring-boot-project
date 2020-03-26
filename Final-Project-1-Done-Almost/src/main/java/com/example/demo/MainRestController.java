package com.example.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {
	@Autowired
	private BookService service;
	
	
	
	@GetMapping(value="/get")
	public Collection<Book> findAllBook(){
		return service.findAllBook();
	}
	
	@GetMapping(value="/delete")
	public void delete(@RequestParam Integer id) {
		service.delete(id);
	}
	
	
}
