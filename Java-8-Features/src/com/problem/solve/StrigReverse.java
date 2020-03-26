package com.problem.solve;

public class StrigReverse {

	public static void main(String[] args) {
		String name= "jewel";
		
		for (int i = 0; i < name.length; i++) {
			char c=name.substring(0).charAt(0);
			c+=c;
		}
	}

}
