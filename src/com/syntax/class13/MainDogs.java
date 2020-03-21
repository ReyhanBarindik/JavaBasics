package com.syntax.class13;

public class MainDogs {

	public static void main(String[] args) {
		
		Dog dog1=new Dog ();
		
		dog1.breed="Shih tzu";
		dog1.name="Lucy";
		dog1.color="yellow";
		dog1.age=2;
		
		System.out.println(dog1.breed);
		
		dog1.eat();
		dog1.bark();
		dog1.run();
		
		}
	
	}
