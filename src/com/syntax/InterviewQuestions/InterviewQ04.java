package com.syntax.InterviewQuestions;
import java.util.Scanner;
public class InterviewQ04 {

	public static void main(String[] args) {
		// Find out how many alpha characters are present in a String?  Find number of words in string?
		
		Scanner scan;
		String str;
		int counter=0;
		String s="";
		scan=new Scanner (System.in);
		System.out.println("Please enter your String");
		str=scan.nextLine();
		
		str=str.replaceAll("[^A-Za-z]", "");
		System.out.println("Alpha characters : "+str.length());
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
