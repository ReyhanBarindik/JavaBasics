package com.syntax.class30;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Task {

	public static void main(String[] args) {
		/*
		 * Create a map of countries with its capital that will store countries in
		 * alphabetical order. Print all keys and values from a country map using for
		 * each loop and iterator. Print all values from a country map using for each
		 * loop and iterator.
		 */
		
		Map <String , String> countries = new TreeMap<>();
		
		countries.put("Turkey", "Ankara");
		countries.put("Italy", "Rome");
		countries.put("India", "New Delhi");
		countries.put("Greece", "Athens");
		countries.put("Korea", "Seoul");
		countries.put("Japan", "Tokyo");
		
		for (String key : countries.keySet()) {
			System.out.println("Key --> "+key);
		}
		
		Iterator <String>it = countries.keySet().iterator();
		while (it.hasNext()) {
			System.out.println("Keys using iterator --> "+it.next());
		}
		for (String value : countries.values()) {
			System.out.println("Value --> "+value);
		}
		Iterator <String> iter= countries.values().iterator();
		while (iter.hasNext()) {
			System.out.println("Value using iterator --> "+iter.next());
		}
		
		
		
		
		
		
	}

}
