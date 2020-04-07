package com.repl.it;

public class Animal {
	String breed;
	

	Animal(String breed) {
		this.breed = breed;
		
	}

	void eat() {
		System.out.println(breed + " eats");
	}

	void sleep() {
		System.out.println(breed + " sleeps");
	}
}
class Cat extends Animal {
	
	Cat (String breed) {
		super (breed);
	}
	@Override
	void sleep () {
		System.out.println(breed +" sleeps");
	}
}
class kitten1 extends Cat {
	 
	kitten1 (String breed) {
		super (breed);
	}
	void eat () {
		System.out.println(breed +" eats milk");
	}
}
class kitten2 extends Cat {
	 
	kitten2 (String breed) {
		super (breed);
	}
	void eat () {
		System.out.println(breed +" eats snacks");
	}
}
class kitten3 extends Cat {
	 
	kitten3 (String breed) {
		super (breed);
	}
	void eat () {
		System.out.println(breed +" eats everything");
	}
}