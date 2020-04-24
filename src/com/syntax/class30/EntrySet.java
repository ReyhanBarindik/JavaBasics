package com.syntax.class30;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class EntrySet {

	public static void main(String[] args) {

		Map <String , String> countries = new TreeMap<>();
		
		countries.put("Turkey", "Ankara");
		countries.put("Italy", "Rome");
		countries.put("India", "New Delhi");
		countries.put("Greece", "Athens");
		countries.put("Korea", "Seoul");
		countries.put("Japan", "Tokyo");

		Set <Entry<String, String>> allEntries= countries.entrySet();
		
		for (Entry<String, String> entry : allEntries) {
			System.out.println(entry.getKey()+ " "+entry.getValue());
		}
		
		System.out.println("________Iterator_______");
		// iterate through all entry objects 
		Iterator <Entry<String, String>> it=allEntries.iterator();  //--> use Set variable name 
		while (it.hasNext()) {
			Entry<String, String> e = it.next();
			String keyvalue = e.getKey()+" ::: "+e.getValue();
		}
		
		
		
		
		
	}

}
