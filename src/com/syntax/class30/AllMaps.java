package com.syntax.class30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class AllMaps {

	public static void main(String[] args) {
		
		
		Map <String,Integer> grocery = new HashMap <>();
		
		grocery.put("milk", 1);
		grocery.put("cucumber", 3);
		grocery.put("banana", 12);
		grocery.put("cheese", 2);
		grocery.put("grapes", 3);
		
		Map <String, Integer> household = new LinkedHashMap<>();
		household.put("lysol", 2);
		household.put("sanitizer", 2);
		household.put("paper towel", 3);
		household.put("toilet paper", 10);
		household.put("face mask", 50);
		
		Map <String , Integer> shopping = new TreeMap<>();
		shopping.putAll(grocery);
		shopping.putAll(household);
		//get all keys
		//Set <String> keys = shopping.keySet();
		for (String key : shopping.keySet()) {
			System.out.println("Key : "+key);
		}
		//get all keys using Iterator
		Iterator <String> it =shopping.keySet().iterator();
		while (it.hasNext()) {
			System.out.println("Key --> "+it.next());
		}
		//get all values
        for (int value: shopping.values()) {
        	System.out.println("Values : "+value);
        }
		//get all values using Iterator
        Iterator <Integer> valueit =shopping.values().iterator();
        while (valueit.hasNext()) {
        	System.out.println("Value --> "+valueit.next());
        }
        
        
        
        
        
        
        
        
        
        
		
		
		
		
		
	}

}
