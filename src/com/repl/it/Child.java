package com.repl.it;

public class Child extends Parent {

	void m1 (){
		System.out.println("m1 method in child class");
	}
	
	
	void m2 () {
		this.m1();
		super.m1();
	}
	
	
}
