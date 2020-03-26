package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Product;
import com.example.repository.ProductRepo;

@Service
public class ServiceClass {
	@Autowired
	private ProductRepo repo;
	
	
	public List<Product> lists(){
		return repo.findAll();
	}
	
}
