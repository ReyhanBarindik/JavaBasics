package com.syntax.class12;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		
		
		Scanner scan;
		String str;
		scan=new Scanner(System.in) ;
		System.out.println("Please enter your String");
		str=scan.nextLine();
		int i=0;
		int j=str.length()-1;
        
		while(i<j) {
			
			if (str.charAt(i) != str.charAt(j)) {                                           //num a verip char ina bakiyoruz biri sondan okuyor biri bastan
				System.out.println("Your String is Not Palindrome") ;
				
			} else {
			    System.out.println("Your String is Palindrome") ;
			}
			
			i++;
			j--;
			
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
