package com.example.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	
	@Autowired
	private BookRepo repo;
	
	public Collection<Book> findAllBook(){
		List<Book> books=new ArrayList<Book>();
		
		for (Book book : repo.findAll()) {
			books.add(book);
		}
		return books;
	}
	
	public Book getOne(Integer id) {
		return repo.getOne(id);
	}
	
	public void save(Book book) {
		repo.save(book);
	}
	
	public void delete(Integer id) {
		repo.deleteById(id);
	}
	
	
}
