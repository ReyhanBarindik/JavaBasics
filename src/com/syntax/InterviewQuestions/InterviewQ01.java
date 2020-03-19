package com.syntax.InterviewQuestions;

public class InterviewQ01 {

	public static void main(String[] args) {
		// Write a program to swap 2 numbers without a temporary variable? 
		
		int a=10; 
		int b=20; 
		
		a=a+b;  //30
		b=a-b;  //30-20=10;
		a=a-b;  //30-10=20;
		
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		
		// Swap  2 strings without a temporary variable?
		
		String str1= "Day";
		String str2= "Night";
		
		str1= str1 + str2; // DayNight
		str2= str1.substring(0, str1.length()-str2.length());   //DayNight - Night = Day ;
		str1= str1.substring(str2.length());             //DayNight - Day = Night;
		
		System.out.println("New str1 : "+ str1);
		System.out.println("New str2 : "+ str2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
