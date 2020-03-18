package com.syntax.class05;
import java.util.Scanner;
public class Homework3 {

	public static void main(String[] args) {
		
		/*Write a program to find largest of three double values using if-else..if and logical operators provided by a user (numbers must be distinct)
         */
		
	    Scanner scan;
		double num1;
		double num2;
		double num3;
		
		scan=new Scanner (System.in);
		
		System.out.println("Please enter first number: ");
		num1=scan.nextDouble();
		System.out.println("Please enter second number: ");
		num2=scan.nextDouble();
		System.out.println("Please enter third number: ");
		num3=scan.nextDouble();
		
		if (num1>0 && num2>0 && num3>0) {
			
			if (num1>num2 && num1>num3) {
			 System.out.println("First number is largest");
			 
			}else if (num2>num1 && num2>num3) {
				System.out.println("Second number is largest");
				
			}else if (num3>num1 && num3>num2) {
				System.out.println("Third number is largest");
				
			} 
			
			}
		
		
		
		
		
		
		
		
		

	}

}
