package com.LamdaExpression;

public class Lamda {

	public static void main(String[] args) {
		
		Hello  len = s-> s.length();
		
		System.out.println(len.getLength("hy Bro"));
		

	}
	
	interface Hello {
		public void getLength(String s);
	}

}
