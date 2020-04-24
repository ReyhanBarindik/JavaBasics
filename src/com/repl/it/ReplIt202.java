package com.repl.it;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ReplIt202 {

	public static void main(String[] args) {
		
		Map <String, String> map= new HashMap<>();
		map.put("ONE","AAA");
		map.put("TWO","BBB");
		map.put("THREE","CCC");
		map.put("FOUR","DDD");
		map.put("FIVE","EEE");

		System.out.println("HashMap Before Remove :");
		Set<Entry<String,String>> sets= map.entrySet();
		
		for (Entry<String,String> set : sets) {
			System.out.println(set.getKey()+" : "+set.getValue());
		}
		System.out.println("-----------------------");
		map.remove("ONE", "AAA");
		map.remove("FOUR", "DDD");
		
		System.out.println("HashMap After Remove :");
		for (Entry<String,String> set : sets) {
			System.out.println(set.getKey()+" : "+set.getValue());
		}
		
		
		
		
}

}
