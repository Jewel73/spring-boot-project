package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements ProductDao{
	
	@Autowired
	private ProductRepository repo;
	
	
	@Override
	public List<Product> getList(){
		return repo.findAll();
	}

	@Override
	public void save(Product product) {
		repo.save(product);
		
	}

	@Override
	public Product getOneProduct(Integer product_id) {
		return repo.findById(product_id).get();
	}

	@Override
	public void delete(Integer product_id) {
		repo.deleteById(product_id);
		
	}

}
