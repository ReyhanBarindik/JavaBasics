package com.syntax.class08;
import java.util.Scanner;
public class Task02 {

	public static void main(String[] args) {
		//Create a program that will be asking user to apply for a credit card 10 times. As soon you get an “yes” from a user program should stop asking.
		Scanner scan;
		String userAnswer;
		
		scan=new Scanner (System.in);
		for(int i=1; i<=10; i++) {
			System.out.println("Apply for a credit card(yes or no)");
			userAnswer=scan.nextLine();
			
		   if (userAnswer.equals("yes")) {
		    break;
		  }
		  }
		 System.out.println("Thank you"); 
		
		
		
		
	}

}
