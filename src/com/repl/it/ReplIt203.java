package com.repl.it;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class ReplIt203 {

	public static void main(String[] args) {
		Map <String, String> map= new HashMap<>();
		map.put("ONE","AAA");
		map.put("TWO","BBB");
		map.put("THREE","CCC");
		map.put("FOUR","DDD");
		map.put("FIVE","EEE");

		
		Set<Entry<String,String>> sets= map.entrySet();
		
		Iterator <Entry<String,String>> it= sets.iterator();
		System.out.println("HashMap Before Replace :");
		while (it.hasNext()) {
			Entry<String,String> x= it.next();
			System.out.println(x.getKey()+" : "+x.getValue());
			
		}
		map.replace("THREE", "CCC", "ASEL");
		map.replace("FIVE", "EEE", "SUMAIR");
		Iterator <Entry<String,String>> itS= sets.iterator();
		System.out.println("HashMap After Replace :");
		while (itS.hasNext()) {
			Entry<String,String> y= itS.next();
			System.out.println(y.getKey()+" : "+y.getValue());
		}
		
		
		
		
	}

}
