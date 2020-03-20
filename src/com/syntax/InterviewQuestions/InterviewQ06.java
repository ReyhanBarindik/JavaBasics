package com.syntax.InterviewQuestions;

import java.util.Scanner;

public class InterviewQ06 {

	public static void main(String[] args) {
		// Write a Java Program to find whether a String is palindrome or not?
		
		Scanner scan;
		String str;
		String reverse="";
		boolean trueF=false;
		scan=new Scanner (System.in);
		System.out.println("Please enter your String");
		str=scan.nextLine();
		
		String newOne=str.replaceAll("[^A-Za-z]", "");
		
		for (int i=newOne.length()-1; i>=0; i--) {
			reverse=reverse+newOne.charAt(i);
		}
		
		if (newOne.equalsIgnoreCase(reverse)) {
			trueF=true;
		} else {
			trueF=false;
		}
		
		System.out.println(trueF);
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
