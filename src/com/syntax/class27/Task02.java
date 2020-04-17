package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class Task02 {

	public static void main(String[] args) {
		
		//Create an arrayList of words. Remove every word that ends with “e”. Use iterator

		
		ArrayList <String> words = new ArrayList <>();
		
		words.add("Reyhan");
		words.add("Yunus");
		words.add("Selme");
		words.add("Gulsume");
		words.add("Senele");
		words.add("Turker");
		
		Iterator <String> it = words.iterator();
		
		while (it.hasNext()) {
			String element= it.next();
			if (element.endsWith("e")) {
				it.remove();
			}
		}
		//2.Way
		//while (it.hasNext()) {

		//if (it.next().endsWith("e")) {

			//greetings2.remove();

		//}
		
		
		System.out.println(words);
		
		
		
		
		
		
		
		
		
		
		
	}

}
