package com.syntax.class19;

public class DogMain {

	public static void main(String[] args) {
		
		Dog dog1 = new Dog () ;
		
		dog1.breed = "Husky";
		dog1.color ="Grey";
		dog1.fur ="Too much";
		dog1.size ="Big";
		
		dog1.bark();
        dog1.beWild();
        dog1.eat();
        dog1.toString();   // ------> Every class in Java has a parent ---> Object Class
        
        Animals animal = new Animals () ;
        animal.color="Any";
        animal.fur ="Any";
        animal.size ="Any";
        animal.beWild();
        animal.eat();
        //animal.bark ();  ---> its for Dog features(child class) so you cannot use parent class
        // animal.breed ="Any";   ----> same 
	}

}
