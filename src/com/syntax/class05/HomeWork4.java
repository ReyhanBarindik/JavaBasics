package com.syntax.class05;
import java.util.Scanner;
public class HomeWork4 {

	public static void main(String[] args) {
		//Program to find largest number among three numbers using nested if provided by a user (numbers must be distinct
		
		Scanner scan;
		int num1;
		int num2;
		int num3;
	    scan=new Scanner (System.in);
		System.out.println("Please enter first number ");
		num1=scan.nextInt();
		System.out.println("Please enter second number ");
		num2=scan.nextInt();
		System.out.println("Please enter third number ");
		num3=scan.nextInt();
		int largest;
		
		if (num1>num2) {
			if (num1>num3) {
				largest=num1;
			} else { //num1<num3 
				largest=num3;
			}
			
			
			
		} else { //num2>num1 
			if (num2>num3) {
				largest=num2;
			}else { //num2>num1 but num3>num2 
				largest=num3;
			}
		}
		System.out.println("Largest number is "+largest) ;
		
		
		
		
		
		
		

	}

}
