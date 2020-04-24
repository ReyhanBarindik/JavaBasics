package com.repl.it;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ReplIt199 {

	public static void main(String[] args) {
		
		Map <String, Integer> map= new HashMap<>();
		
		map.put("mango", 10); 
		map.put("apple", 30); 
		map.put("orange", 20); 
		map.put("mango", 40); 
	    map.put("mango", 40); 
		
	    Set<Entry<String,Integer>> values= map.entrySet();
	    Iterator<Entry<String,Integer>> it= values.iterator();
		while (it.hasNext()) {
			Entry<String,Integer> x= it.next();
			System.out.println("Key = "+x.getKey()+" and value = "+x.getValue());
		}
		
		
		
		
		
		

	}

}
