package com.syntax.class12;

public class Task06 {

	public static void main(String[] args) {
		// You have a String a=“Is it saturday? Is it raining? 
		//Do we have a Java Class today?” How would you find out how many sentences are in that String?
		
		String a="Is it Saturday? Is it raining? Do we have a Java Class today?";
		int count=0;
		
		String [] questions= a.split("\\?");
		
		for (String question: questions) {
		    count++;
			
			
			
		}
		System.out.print(count);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
