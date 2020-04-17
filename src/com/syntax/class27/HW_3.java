package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class HW_3 {

	public static void main(String[] args) {

		ArrayList<String> drinks = new ArrayList<>();

		drinks.add("Orange Juice");
		drinks.add("Cola");
		drinks.add("Doubt seltzer");
		drinks.add("Lemonade");

		Iterator<String> it = drinks.iterator();
		while (it.hasNext()) {
			String elements = it.next();

			if (elements.contains("a") || elements.contains("e")) {
				String newElements=elements.replaceAll(elements, "Water");
				System.out.println(newElements);
			}
			

		}

	}

}
