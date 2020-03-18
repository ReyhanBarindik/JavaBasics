package com.syntax.class03;

public class IfCondition1 {

	public static void main(String[] args) {
		//Declare a number and compare if number is larger than 100
		//if number is larger than 100--> mu number is 100 
		
		
		System.out.println("Starting coding");
		
		int num=178;
		
		if (num>1000) {
			
			System.out.println("My number is large");
			
			}
		
		System.out.println("End of the program");
		
		System.out.println("-------------");
		
		
		int expectedHours=15;
		int actualHours=15;
		//if actual more than expected --->you will love java 
		
		if (actualHours>=expectedHours) { //if true
		    System.out.println("You will love Java");
		     }
		
		else { //otherwise (if false) --> go inside else block 
			System.out.println("You will not like Java");
			}
		
		System.out.println("--------------------");
		
		  double budget=10000;
		  double carPrice=12000;
		  //using if we are doing verification and selective execution
		  if (budget>=carPrice) {
			   
			System.out.println("I will buy this car today");
			System.out.println("I will be happy");
			
			 }
          
		  else {
			  System.out.println("I will not buy this car today, "+"I will go to learn Java");
			  System.out.println("I will be motivated");
			  
			   }
		  
		  System.out.println("I am code after if condition");
		  
		  
		  
		  
	}

}
