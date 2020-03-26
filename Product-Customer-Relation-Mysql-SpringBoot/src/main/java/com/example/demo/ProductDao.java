package com.example.demo;

import java.util.List;

public interface ProductDao {
	public List<Product> getList();
	public void save(Product product);
	public Product getOneProduct(Integer product_id);
	public void delete(Integer product_id);
}
