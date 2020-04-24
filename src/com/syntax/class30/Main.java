package com.syntax.class30;

import java.util.HashMap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {

	public static void display (Map<String,Integer> givenMap) {
		if (givenMap.isEmpty()) {
			System.out.println("map is empty");
		}else {
			
			Set<Entry<String,Integer>> values= givenMap.entrySet();
			for (Entry<String,Integer> value : values) {
				System.out.println(value.getKey()+" "+value.getValue());
			}
			
		}
	}
	
	public static void main(String[] args) {
		
		Map<String,Integer> map= new HashMap <>();
		
		map.put("mango", 10); 
		map.put("apple", 30); 
		map.put("orange", 20); 
        
	   Main obj =  new Main ();
	   
	   obj.display(map);
		
	   map.clear();
	   
	   Main obj2 =new Main ();
	   obj2.display(map);
	   
		  
		   
	   
	   
	   
	   
	   
	}

}
