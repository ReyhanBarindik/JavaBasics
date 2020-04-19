package com.syntax.class29;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task {

	public static void main(String[] args) {

		/*
		 * Create a map of a building. Store floor number and it is associated company
		 * name. (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate
		 * keys and values.  Check how many entries you have? Update company on a 4th
		 * floor  Remove company on the 7th floor Print your map
		 * 
		 */

		Map <Integer, String> companyName= new HashMap <>();
		
		companyName.put(1, "Google");
		companyName.put(2, "Syntax");
		companyName.put(3, "YouTube");
		companyName.put(4, "Amazon");
		companyName.put(5, "Apple");
		companyName.put(6, "Zoom");
		companyName.put(1, "Google");
		companyName.put(7, "Linkedln");
		System.out.println("My Map : "+companyName);
		System.out.println("Size of CompanyName Map : "+companyName.size());
		
		companyName.put(4, "Intel");
		System.out.println("After I updated 4th floor my Map : "+companyName );
		
		companyName.remove(7);
		System.out.println("After I remove company on the 7th floor my Map : "+companyName);
		
		Set <Integer> keys = companyName.keySet();
		for (Integer key : keys) {
			System.out.println(key);
		}
		
		Collection <String> values=companyName.values();
		for (String value : values) {
			System.out.println(value);
		}
		companyName.forEach((k,v) -> {
			System.out.println("-");
			System.out.println(k+" "+v);
		});
		
		
		
	}

}
