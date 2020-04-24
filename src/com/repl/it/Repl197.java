package com.repl.it;

import java.util.Collection;

import java.util.LinkedHashMap;
import java.util.Map;


public class Repl197 {

	public static void main(String[] args) {
		
		Map <String,String> myMap= new LinkedHashMap<>();
		myMap.put("Street", "Patrick ST");
		myMap.put("Suite", "265");
		myMap.put("City", "Vienna");
		myMap.put("Zip", "22180");
		myMap.put("Country", "United State");

		
		Collection <String> cols= myMap.values();
		for (String col : cols) {
			System.out.println(col);
		}
		
		
		
		
      
	}

}
