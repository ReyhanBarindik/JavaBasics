package com.syntax.class12;
import java.util.Scanner;
public class Interview0402 {

	public static void main(String[] args) {
		
        //Find out how many alpha characters are present in a String?  Find number of words in string?
		
		Scanner scan;
		String str;
		int counter=0;
		scan=new Scanner(System.in);
		
		System.out.println("Please enter your String");
		str=scan.nextLine();
		
		str=str.replace("[^A-Za-z]","");
	    
		char [] characters= str.toCharArray();
		
		for (char character : characters) {
			counter++;
		
		}
		 System.out.println(counter); 
		
		/*for (int i=0; i<str.length(); i++) {
			if( (!str.isEmpty()) && (!str.contains(" ")))  {
				
			}
		}
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
