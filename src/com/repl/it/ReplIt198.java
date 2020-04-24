package com.repl.it;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ReplIt198 {

	public static void main(String[] args) {
		
		Map <String, String> fruit= new LinkedHashMap<>();
		fruit.put("1 item", "apple");
		fruit.put("2 item", "banana");
		fruit.put("3 item", "pear");
		fruit.put("4 item", "tomato");
		fruit.put("5 item", "mango");
		fruit.put("6 item", "kiwi");
		
		Set<Entry<String,String>> values= fruit.entrySet();
		
		Iterator <Entry<String,String>> it= values.iterator();
		
		while (it.hasNext()) {
			Entry<String,String> x= it.next();
			System.out.println("Key is "+x.getKey()+" and values is "+x.getValue());
		}
		

	}

}
