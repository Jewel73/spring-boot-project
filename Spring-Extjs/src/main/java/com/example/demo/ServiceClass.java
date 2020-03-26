package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class ServiceClass {
	
	public Response post(User user) {
		if(user.getUsername().equalsIgnoreCase("jewel") && user.getPassword().equalsIgnoreCase("jewel")) {
			return new Response("Successfully", 202);
		}else {
			return new Response("Not work", 404);
		}
	}
		
	}
