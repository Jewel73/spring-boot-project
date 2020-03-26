package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployeService {
	private List<Employe> list= new ArrayList<Employe>(
			Arrays.asList(new Employe(101, "jewel", "Male", "Dhaka"), 
						  new Employe(102, "Rohim", "Male", "Barishal"),
						  new Employe(103, "Himu", "Female", "Khulna")
						  )
			);
	
	public List<Employe> show(){
		return list;
	}
}
