package com.syntax.class29;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Task02 {

	public static void main(String[] args) {
		//Create a Set of cities in which you want to make sure that insertion order is maintained.
		//Using Iterator remove any city that starts with “A”;

		Set <String> cities= new LinkedHashSet<>();
		
		cities.add("Izmir");
		cities.add("Istanbul");
		cities.add("Ankara");
		cities.add("Adana");
		cities.add("Antep");
		
		Iterator <String> it= cities.iterator();
		while (it.hasNext()) {
			String element= it.next();
			if (element.startsWith("A")) {
				it.remove();
			}
		}
		System.out.println(cities);
		
		
		
	}

}
