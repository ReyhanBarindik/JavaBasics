package com.syntax.class15;

public class Methods {
     
	void sayWelcome () {
		for (int i=0; i<10; i++) {
			System.out.println("Welcome");
		}
	}
	void sayAnything (String word, int times) {
		for (int i=1; i<=times; i++) {
			System.out.println(word);
		}
	}
	// create a method isItRaining
	// that will accept boolean value as a param
	// and based on the value it will print message accordingly 
	
	void isItRaining (boolean isRain) {
		if (isRain) {
			System.out.println("It is raining stay home");
		} else {
			System.out.println("It is not raining go for a walk");
		}
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Methods say =new Methods();
       say.sayWelcome();
       say.sayAnything("Hello", 5);
       say.isItRaining(true);                 // this true or false call our methods
       say.isItRaining(false);
	}

}
