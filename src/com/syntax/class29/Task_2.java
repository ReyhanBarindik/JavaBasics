package com.syntax.class29;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task_2 {

	public static void main(String[] args) {

		Map<Integer, String> companyName = new HashMap<>();

		companyName.put(1, "Google");
		companyName.put(2, "Syntax");
		companyName.put(3, "YouTube");
		companyName.put(4, "Amazon");
		companyName.put(5, "Apple");
		companyName.put(6, "Zoom");
	    companyName.put(7, "Linkedln");

	
	   Set <Map.Entry<Integer, String>> values= companyName.entrySet();
		
	   for (Map.Entry<Integer, String> value : values) {
		   
		  System.out.println(value.getKey()+ " : "+value.getValue()); 
	   }
		
		
		
		
		
	}

}
