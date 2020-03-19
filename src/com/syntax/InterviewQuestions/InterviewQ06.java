package com.syntax.InterviewQuestions;

import java.util.Scanner;

public class InterviewQ06 {

	public static void main(String[] args) {
		// Write a Java Program to find whether a String is palindrome or not?
		
		Scanner scan;
		String str;
		
		scan=new Scanner (System.in);
		System.out.println("Please enter your String");
		str=scan.nextLine();
		int i=0;
		int j=str.length()-1;
		
		while (i<j) {
			
			if (str.charAt(i) != str.charAt(j)) {
				System.out.println("Your String is Not Palindrome");
				
				
			} else {
				System.out.println("Your String is Palindrome");
			}
			i++;
			j--;
			
			break;
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
