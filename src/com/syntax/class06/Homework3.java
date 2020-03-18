package com.syntax.class06;
import java.util.Scanner;
public class Homework3 {

	public static void main(String[] args) {
		// Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/). Based on operator provide the result to user.

		Scanner scan;
		int num1;
		int num2;
		char operator;
		int result;
		scan=new Scanner(System.in);
		System.out.println("Enter a number");
		num1=scan.nextInt();
		System.out.println("Enter another number");
		num2=scan.nextInt();
		System.out.println("Enter a operator(+,-,*,/)");
		operator=scan.next().charAt(0);
		
		switch (operator) {
		  
		case '+' :
			result=num1+num2;
			break;
		case '-' :
			result=num1-num2;
			break;
		case '*' :
			result=num1*num2;
			break;
		case '/' :
			result=num1/num2;
		    break;
		default :
			result=0;
			}
		
		  System.out.println(num1+" "+operator+" "+num2+" ="+result);
		  
		  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
