package com.repl.it;

public class AnimalTest {

	public static void main(String[] args) {
		Cat cat = new Cat ("Cat");
        Cat k1 = new kitten1 ("kitten1");
        Cat k2 = new kitten2 ("kitten2");
        Cat k3 = new kitten3 ("kitten3");
        
        Cat [] cats = {cat ,k1, k2,k3 };
        for (Cat c : cats) {
        	c.eat();
        	//c.sleep();
        }
        
	}

}
