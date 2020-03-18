package com.syntax.class12;
import java.util.Scanner;
public class Interview04 {

	public static void main(String[] args) {
		// Find out how many alpha characters are present in a String?  Find number of words in string?

		Scanner scan;
		String str;
		int counter=0;
		scan=new Scanner(System.in);
		
		System.out.println("Please enter your String");
		str=scan.nextLine();
		
	    char [] characters= str.toCharArray();
		
		for (char character : characters) {
			counter++;
		}
		System.out.println(counter); 
		String s="";                                              //an String with empty initialization
		
		for (int i=0; i<str.length(); i++) {
			if ( str.length()>i && characters[i]!=' ') {
				s=s+ characters[i];                               // topla if deki tum ifadeleri 
			}
			
			    if (s.length()>0) {
				System.out.println(s+":"+s.length()) ;              // yukaridaki if kosunu saglayan sayilarla size i bir araya getiriyorum
				
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
