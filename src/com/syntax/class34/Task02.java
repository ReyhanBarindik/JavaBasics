package com.syntax.class34;

public class Task02 {

	public static void main(String[] args) {
		// Create a method checkUserName that will throw a runtime exception.
		// Method should throw an exception when entered username is less than 5
		// characters.

		checkUserName("Rey");

	}

	public static void checkUserName(String userName) {
		if (userName.length() < 5) {
			throw new RuntimeException("You entered less than 5 characters.");
		} else {
			System.out.println("Eligible user name.");
		}
	}

}
