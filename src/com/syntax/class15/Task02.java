package com.syntax.class15;

public class Task02 {

	public static void main(String[] args) {
		//Write a method to return whether given number is prime or not?
       
		Task02 givenNum1= new Task02 ();
		boolean trueF= givenNum1.isPrime(7);
		System.out.println("Given number is prime : "+trueF);
		
		
	}

	
	 boolean isPrime ( int x) {
		 boolean isPrime=false;
		 if (x>1) {
			 for (int i=2; i<x; i++) {
				 if (x%i==0) {
					isPrime=false;
				 } else {
					 isPrime=true;
				 }
				 
			 }
		 }
		 return isPrime;
	 }
	
	
	
}
