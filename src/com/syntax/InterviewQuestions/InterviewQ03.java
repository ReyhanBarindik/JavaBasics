package com.syntax.InterviewQuestions;

public class InterviewQ03 {

	public static void main(String[] args) {
		// Write a Java Program to print first 10 numbers of Fibonacci series.

		
		int [] fib= new int [10];
		fib[0]= 1;
		fib[1]= 1;
		
		for (int i=2; i<10; i++) {
		fib[i]= fib[i-1] + fib[i-2];
			
		}
		
		for (int i=0; i<10; i++) {
		System.out.println(fib[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
