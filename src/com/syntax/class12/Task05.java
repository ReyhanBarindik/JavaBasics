package com.syntax.class12;

public class Task05 {

	public static void main(String[] args) {
		// Create a String that should be combination of letters, numbers and special
		// characters.
		// Find out how many alpha characters are there in the String.

		String str = "Reyhan Barindi 1992 **##@@";

		str = str.replaceAll("[^A-Za-z]", "");

		int counter = 0;

		char[] arr = str.toCharArray();

		for (char a : arr) {
			counter++;
		}
		System.out.println(counter);

	}

}
