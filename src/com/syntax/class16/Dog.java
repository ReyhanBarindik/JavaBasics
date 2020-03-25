package com.syntax.class16;

public class Dog {

	String name ,size;                //instance variables    
	int age;
	static String breed ="Husky";
	static int paws=4;
	static int tail=1;
	static int eyes=2;
	
	void displayDog () {
		System.out.println("Dog name is "+name + " and it is "+size +" and dog age is "+age);
		System.out.println("Dogs breed is "+breed + " and it has "+paws+ " paws and "+tail+ " tail");
	}
	
	public static void main (String [] args) {
		
		Dog dog1= new Dog (); 
		//how to access instance variables? --> by creating an object and using reference variable
		dog1.name="Lucy";
		dog1.size="Big";
		dog1.age=5;
		dog1.age=6;
		dog1.displayDog();
		
		//how to access static variables? --> static variables belong to the class --> accessed by className
		System.out.println(Dog.breed);    //Husky
		System.out.println(Dog.paws);     //4
		System.out.println(Dog.eyes);     //2
		System.out.println(Dog.tail);     //1
		System.out.println(dog1.breed);   //Husky        // access static variable in static way
		System.out.println(breed);        //Husky
		
		
		
		Dog dog2= new Dog ();
		dog2.name="Sharik";
		dog2.size="Small";
		dog2.age=2;
		dog2.displayDog();
	}
	
	
}
