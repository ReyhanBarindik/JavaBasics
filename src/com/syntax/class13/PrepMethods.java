package com.syntax.class13;

public class PrepMethods {

	public static void main(String[] args) {
		prepMethods();
		helloSyntax();
		System.out.println(" My First Method is " +f(5));
        System.out.println(" My Second Method is "+ g(6,3)) ;
        
	}

	 static void prepMethods () {
		 System.out.println("I am trying to learn Methods");
	 }
	
	static int f(int x) {
		return 10*x+5;
	}
	
	static int g(int x, int y) {
		return 2*(x + y);
	}
	
	static void helloSyntax () {
		System.out.println("Hello, I am Reyhan");
	}
	
	
	
}
