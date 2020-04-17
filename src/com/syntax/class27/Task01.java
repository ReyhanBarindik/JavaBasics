package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class Task01 {

	public static void main(String[] args) {
		/*
		 * Create an arraylist of cars and retrieve all the values using 3 different
		 * ways.
		 * 
	    */
		
		ArrayList <String> cars= new ArrayList<>();
		
		cars.add("Toyota");
		cars.add("BMW");
		cars.add("Mercedes");
		
		//1. Way 
		for (String car : cars ) {
			System.out.println(car);
		}
		System.out.println("_______________");
		//2. Way 
		for (int i=0; i<cars.size(); i++) {
			System.out.println(cars.get(i));
		}
		System.out.println("_______________");
		//3.Way 
		Iterator <String>it = cars.iterator();
		
		while (it.hasNext()) {
			String str=it.next();
			System.out.println(str);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
