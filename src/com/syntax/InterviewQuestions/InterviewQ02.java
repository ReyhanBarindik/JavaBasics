package com.syntax.InterviewQuestions;

public class InterviewQ02 {

	public static void main(String[] args) {
		// Write a java program to check whether a given number is prime or not?
        
		int given = 10 ;
		
		boolean trueF = true;
		
		if (given>1 ) {
		
		for (int i =2; i<given; i++) {   // i starts from 2 because every number can division 1 and i ends with given number because every number can division by itself. 
		
			if (given%i==0) {
				trueF= false ;
			}
			
		
		}
		
		} else {
			trueF= false;
		}
		
		System.out.println("Given number "+ given + " is prime : "+ trueF) ;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
