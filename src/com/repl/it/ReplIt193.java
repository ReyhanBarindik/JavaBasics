package com.repl.it;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class ReplIt193 {

	public static void main(String[] args) {
		
		Set <String> names= new LinkedHashSet<>();
		
		names.add(null);
		names.add("Sohil");
		names.add("Diego");
		names.add("Alijon");
		names.add("Asel");
		names.add("Sumair");
		
		for (String name : names) {
			System.out.println(name);
		}
		Iterator <String> it= names.iterator();
		while (it.hasNext()) {
			String x= it.next();
			System.out.println(x);
		}
		
		
	}

}
