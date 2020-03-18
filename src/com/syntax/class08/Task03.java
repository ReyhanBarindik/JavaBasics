package com.syntax.class08;
import java.util.Scanner;
public class Task03 {

	public static void main(String[] args) {
		//Write a program that reads a range of integers (start and end point), provided by a user and then from that range prints the sum of the even and odd integers.
		Scanner scan;
		double num1;
		double num2;
		double sumEven=0;
		double sumOdd=0;
		
		scan=new Scanner (System.in);
		System.out.println("Please enter enter two differnt numbers");
		num1=scan.nextInt();
		num2=scan.nextInt();
		
		for(double i=num1; i<num2; i++)  {
			if(i%2==0) {
				sumEven=sumEven+i;
			} else {
				sumOdd=sumOdd+i;
			}
			
			}  
			 
		 System.out.println("The total of even numbers between "+num1+" to "+num2+" = "+sumEven);
		 System.out.println("The total of even numbers between "+num1+" to "+num2+" = "+sumOdd);
		 
			 
		
	
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
