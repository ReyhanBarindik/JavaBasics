package com.syntax.class14;

public class ReturnStatements {

	public static void main(String[] args) {
		int sum=add (10, 5);
		System.out.println(sum);
	}
	
	public static void printAMessage() {                         // we used void so it means do nothing just print, it means we cannot use return with void
		System.out.println("This is our first method!");
	}
	
	
	
	
    public static int add (int a, int b)  {                     // return means make this operation 
    	return a+b; 
    }
	
	
	
}
