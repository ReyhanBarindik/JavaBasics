package com.syntax.class30;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HW_2 {

	public static void main(String[] args) {
		/*
		 * Create a Map from array of cities that will sort keys in alphabetical order.
		 * As a key store the name of the city and as a value store the length of the
		 * city (Example: Paris=5, Moscow =6, Washington DC=13 etc..).  If any city name
		 * is more than 7 characters remove that city . 
		 */
		
		Map <String, Integer> cities= new TreeMap<>();
		
		cities.put("Paris", 5);
		cities.put("Moscow", 6);
		cities.put("Washington DC", 13);
		cities.put("Jacksonville", 12);
		cities.put("Atlanta", 7);
		cities.put("Istanbul", 8);
		cities.put("Izmir", 5);
		
		System.out.println("Map of cities " +cities);
		
		Set<Entry<String, Integer>> entries= cities.entrySet();
		Iterator <Entry<String, Integer>> it= entries.iterator();
		while (it.hasNext()) {
		   String city=it.next().getKey();
		   if (city.length()>7) {
			   it.remove();
		   }
		   
		}
		
		
	System.out.println("After I removed cities which have more than 7 charackters "+cities);
		
		
		
		
		
	}

}
