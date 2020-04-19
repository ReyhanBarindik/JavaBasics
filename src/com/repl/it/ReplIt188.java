package com.repl.it;


import java.util.Iterator;
import java.util.LinkedList;

public class ReplIt188 {

	public static void main(String[] args) {
		LinkedList<String> countries = new LinkedList<>();
		countries.add("Armenia");
		countries.add("USA");
		countries.add("Kazakhstan");
		countries.add("Australia");
		countries.add("Pakistan");
		countries.add("Russia");
		countries.add("Azerbaijan");
       
		Iterator <String>it= countries.iterator();
		while (it.hasNext()) {
			String element= it.next();
			if (element.startsWith("A")) {
				it.remove();
			}
		}
		System.out.println(countries);
		
		
		
		
	}

}
