package com.syntax.class33;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		/*
		 * How would handle InputMismatchException? Input Mismatch Exception when user
		 * enters mismatch value then programmer expected.
		 */
		
		Scanner scan = new Scanner (System.in);
		
		int a; 
		int b;
		System.out.println("Please enter fisrt number : ");
		a= scan.nextInt();
		System.out.println("Please enter second number, (it should be smaller than first number) : ");
		b= scan.nextInt();
		
		
		int sub=0;
		if (sub>0) {
			
			try {
		     sub = a-b ;
			} catch (InputMismatchException ime) {
				System.out.println(ime.getMessage());
			}
			
			
		}
		
		System.out.println("___________end of the program__________");
		
		
		
		
		
	}

}
