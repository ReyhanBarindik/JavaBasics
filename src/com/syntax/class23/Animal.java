package com.syntax.class23;

public class Animal {

	public static void whoIAm () {
		System.out.println("I am an animal");
	}
	public void sleep () {
		System.out.println("All animal sleep");
	}
	private void eat () {
		System.out.println("All animal eat");
	}
	
}
class Bird extends Animal {
	
	// we are not overriding, this process calls method hiding 
	public static void whoIAm () {
		System.out.println("I am a bird");
	}
	public void sleep () {
		System.out.println("All birds sleep");
	}
	private void eat () {
		System.out.println("All birds eat");
	}
	
	
}