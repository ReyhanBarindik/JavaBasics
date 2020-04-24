package com.repl.it;

import java.util.HashSet;
import java.util.Set;

public class ReplIt191 {

	public static void main(String[] args) {

		Set<String> color = new HashSet<>();

		color.add("Red");
		color.add("Pink");
		color.add("Yellow");
		color.add("White");
		color.add("Black");
		
		System.out.println(color);
		
		System.out.println("Size of the Hash Set: "+color.size());
		
		
	}

}
