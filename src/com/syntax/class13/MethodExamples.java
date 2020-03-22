package com.syntax.class13;

public class MethodExamples {

	void greet () {
		System.out.println("Hello Reyhan");
	}
    void greet1 (String name) {
    	System.out.println("Hello "+ name);
    }
    
    public static void main (String [] args) {
    	
    	MethodExamples object1 = new MethodExamples ();
    	
    	object1.greet();
    	object1.greet1("Ayse");
    	object1.greet1("Fatma");
    	object1.greet1("Ali");
    }
    
    
    
    
    
    
    
    
    
    
}
