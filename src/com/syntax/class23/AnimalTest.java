package com.syntax.class23;

public class AnimalTest {

	public static void main(String[] args) {
		Animal animal = new Bird ();
		animal.sleep();
		animal.whoIAm();
		
		Animal.whoIAm();  
		Bird.whoIAm();   // if you want to overriding with static you should call
	                     // method with object otherwise it prints parent features
		
		
		// animal.eat(); --> CE: it is not visible 
	}

}
