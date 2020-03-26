package com.LamdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface
interface AsyourWish{
	public String show(String name, int i);
}



public class LamdaExpression {

	public static void main(String[] args) {
//		AsyourWish obj = new AsyourWish() {
//
//			@Override
//			public String show(String name, int i) {
//				return "Name:"+name+ " "+"Age:"+i;
//				
//			}
//			
//		};
//		obj.show("Hridoy", 30);
//		
//		AsyourWish obj2 = (name, i) ->  "Name:"+name+ " "+"Age:"+i;
//		
//		person((name, i) ->  "Name:"+name+ " "+"Age:"+i);
		
		
		List<String> arrList = new ArrayList<>(Arrays.asList("Hridoy","Juwel","Misbaha"));
		List<String>arrList1= new ArrayList<>();
		
//		arrList.forEach(e -> System.out.println(e));
		
//		for (String string : arrList) {
//			if (string.equals("Misbaha")) {
//				continue;
//			} else {
//				arrList1.add(string);
//			}
//		}
//		System.out.println(arrList1);
		
		List arr3 = arrList.stream().filter(e-> !e.equals("Juwel")).collect(Collectors.toList());
		
		System.out.println(arr3);
			
	}
	
	
	public static void person(AsyourWish p) {
		System.out.println(p.show("juel", 20));
	}

}


/*
 * class Jewel implements AsyourWish{
 * 
 * @Override public void show(String name, int i) {
 * System.out.println("Name:"+name+ " "+"Age:"+i);
 * 
 * }
 * 
 * public void hello() { System.out.println("Hello "); }
 * 
 * 
 * }
 */

