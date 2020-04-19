package com.syntax.class29;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Task01 {

	public static void main(String[] args) {

		/*
		 * Create a Set collection in which you need to add names of the countries. In
		 * this set we want all objects to be sorted in alphabetical order. Using 2
		 * different ways retrieve all elements from set.
		 */

		Set <String> countries= new TreeSet <>();
		
		countries.add("Turkey");
		countries.add("Japon");
		countries.add("South Korea");
		countries.add("Kazakhstan");
		System.out.println("__________Advanced For Loop_______");
		for (String country : countries) {
			System.out.println(country);
		}
		Iterator <String> it= countries.iterator();
		System.out.println("__________Iterator_______");
		while (it.hasNext()) {
			String element= it.next();
			System.out.println(element);
		}
		
		
		
		
		
		
		
		
		
	}

}
