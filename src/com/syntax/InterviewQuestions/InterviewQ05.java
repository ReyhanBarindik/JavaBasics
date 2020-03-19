package com.syntax.InterviewQuestions;

public class InterviewQ05 {

	public static void main(String[] args) {
		// Write a java program to reverse String? Reverse a string word by word?

		String str= "I am a student in Syntax Technologies";
		String rts="";
		
		char [] arr= str.toCharArray();
		
		for (int i=str.length()-1; i>=0; i--) {
			
			rts= rts + arr[i] ;
		 //System.out.print(arr[i] +"");
			
		}
		
		  System.out.println(rts);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
