package com.syntax.class30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Create a map of Best Buy store. Place item id and item name into it. Example
		 * (7664847 = Printer, 7879885= TV etc ) Retrieve all keys and values from a
		 * Best Buy map using EntrySet.
		 */

		Map <String , String> bestbuy = new HashMap <>();
		
		bestbuy.put("123456", "Printer");
		bestbuy.put("123478", "TV");
		bestbuy.put("123499", "Camera");
		bestbuy.put("123333", "Headphone");
		bestbuy.put("123411", "Phone");
		
		
		Set <Entry<String, String>> entries= bestbuy.entrySet();
		for (Entry <String , String> entry : entries) {
			System.out.println("Key "+entry.getKey()+ "  :  "+"Value "+entry.getValue());
		}
		System.out.println("_________Iterator________");
		Iterator <Entry<String, String>> it= entries.iterator();
		while (it.hasNext()) {
			Entry<String, String> e= it.next();
			System.out.println(e.getKey()+ "  =  "+e.getValue());
		}
		
		
		
		
	}

}
