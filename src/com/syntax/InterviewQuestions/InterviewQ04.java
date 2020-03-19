package com.syntax.InterviewQuestions;
import java.util.Scanner;
public class InterviewQ04 {

	public static void main(String[] args) {
		// Find out how many alpha characters are present in a String?  Find number of words in string?
		
		Scanner scan;
		String str;
		String str2;
		int counter=0;
		String s="";
		scan=new Scanner (System.in);
		System.out.println("Please enter your String");
		str=scan.nextLine();
		
		str=str.replaceAll("[^A-Za-z]", "");
		System.out.println("Alpha characters : "+str.length());
		
		System.out.println("Enter your second String");
		str2=scan.nextLine();
		
		String [] words =str2.split(" ");
		for (String word : words) {
			counter++;
			
		}
		System.out.println(counter);
		
		
		
		
		
		
		
		
		
		
		

	}

}
