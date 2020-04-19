package com.repl.it;

import java.util.HashSet;
import java.util.Set;

public class ReplIt190 {

	public static void main(String[] args) {

		Set<String> x = new HashSet<>();
		x.add("third");
		x.add("first");
		x.add("second");

		System.out.println(x);
		x.clear();
		System.out.println(x);

	}

}
