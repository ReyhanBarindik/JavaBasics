package com.syntax.class12;

public class Task02 {

	public static void main(String[] args) {
		
		//Create a String and if the String is not empty perform the following: 
		//if the String has an odd number of characters and has 3 or more characters, print the character in the middle of the String.
		
	    
		String x="Reyhan19925555555";
		
		if (!x.isEmpty()) {
			 if( (x.length()%2==1) && (x.length()>=3) ) {
				 System.out.println(x.charAt(x.length()/2)); 
			 
			 } else {
				 System.out.println("It is even");
			 }
			
			
			
			
			 } else {
				 System.out.println("Empty");
			 }
		
		
		
		
		
		
		
		
		
		
		
		}	
		

	}

 
