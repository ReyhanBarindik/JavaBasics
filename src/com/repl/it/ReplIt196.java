package com.repl.it;

import java.util.HashMap;
import java.util.Map;

public class ReplIt196 {

	public static void main(String[] args) {
		
		Map <String,String> myMap= new HashMap<>();
		myMap.put("Street", "Patrick ST");
		myMap.put("Suite", "265");
		myMap.put("City", "Vienna");
		myMap.put("Zip", "22180");
		myMap.put("Country", "United State");

		
		System.out.println(myMap.size());
		
		myMap.clear();
		System.out.println(myMap.size());
		
		
		
		
		
		
		
	}

}
