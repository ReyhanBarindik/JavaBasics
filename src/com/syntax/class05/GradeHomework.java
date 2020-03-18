package com.syntax.class05;
import java.util.Scanner;
public class GradeHomework {

	public static void main(String[] args) {
		
		Scanner scan;
		String grade;
		String explanation;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter your grade: ");
		grade=scan.nextLine();
		
		switch (grade) {
		 
		case "100" :
			explanation="A-Excellent";
			break;
		case "90" :
			explanation="B-Good";
			break;
		case "80":
			explanation="C-Average";
			break;
		case "70":
			explanation="D-Bad";
			break;
		default:
			explanation="Not acceptable";
		
		}
		
		System.out.println("Your grade is "+grade+" "+explanation);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
