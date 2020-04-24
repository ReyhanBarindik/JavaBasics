package com.syntax.class30;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEntry {

	public static void main(String[] args) {
		// create a map that will store month and days in a month
		
		Map <String , Integer> month= new LinkedHashMap<>();
		month.put("January", 31);
		month.put("Februaray", 28);
		month.put("March", 31);
		month.put("April", 30);

		// get all entries from a map
		
		Set<Entry<String, Integer>>entries=month.entrySet();
		for (Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey()+ " :  "+entry.getValue());
		}
		
		// iterate through all entry objects 
		
		Iterator <Entry<String, Integer>>it =entries.iterator();
		while (it.hasNext()) {
			//System.out.println("Key= "+it.next().getKey()+"; Value= "+it.next().getValue());  --> boyle olmaz cunku her seferinde next yapar key i alir sonra next yaptigi icin alttakinin value sunu alir !!! 
			Entry<String, Integer>entry= it.next();;
			System.out.println("Key "+entry.getKey()+"  ==  Value "+entry.getValue());
		}
		
		
		
		
		
		
		
		
		
		
	}

}
