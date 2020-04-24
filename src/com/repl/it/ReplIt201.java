package com.repl.it;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ReplIt201 {

	public static void main(String[] args) {

		Map<String, String> myMap = new HashMap<>();
		myMap.put("Street", "Patrick ST");
		myMap.put("Suite", "265");
		myMap.put("City", "Vienna");
		myMap.put("Zip", "22180");
		myMap.put("Country", "United State");

		Set<Entry<String,String>> values= myMap.entrySet();

		Iterator <Entry<String,String>>it = values.iterator();
		
		while (it.hasNext()) {
			Entry<String, String> x= it.next();
			String value=x.getValue().toUpperCase();
			System.out.println(value);
		}
		
		
		
		
		
	}

}
