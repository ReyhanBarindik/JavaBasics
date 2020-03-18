package com.syntax.class11;

public class StringComparison {

	public static void main(String[] args) {
	
		String a= new String("Hello");
		String b= new String("Hello") ;
		
		if (a==b) {
			System.out.println("They are equals");
			
		}else {
			System.out.println("They are not equals");
			
		}
		// but 
		
		String x="Hello";
		String y="Hello";
		
		if (x==y) {
			System.out.println("x equals to y");
		}else {
			System.out.println("x not equals to y ");
		}
		
		if (a==x) {
			System.out.println("a equals to x");
			
		} else {
			System.out.println("a Not equals to x");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
