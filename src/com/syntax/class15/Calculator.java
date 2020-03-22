package com.syntax.class15;

public class Calculator {
    // define methods to calculate add, sub, div . mult 
	
	void add (int a, int b) {
		
		System.out.println(a+b);
	}
	void sub (int a, int b) {
		
		System.out.println(a-b);
	}
	void mult (int a, int b) {
		System.out.println(a*b);
	}
	void div (double a, double b) {
		System.out.println(a/b);
	}
	
	public static void main (String args [] ) {
		
		Calculator calc = new Calculator ();
		calc.add(100, 200);
		calc.sub(1000, 300);
		calc.add(10, 20);
		calc.sub(100, 50);
		calc.mult(3, 4);
		calc.div(20, 10);
	}
}
