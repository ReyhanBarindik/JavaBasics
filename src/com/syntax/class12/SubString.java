package com.syntax.class12;

public class SubString {

	public static void main(String[] args) {
	
		String str= "Today is a rainy day";
		
		String partialString=str.substring(6);
		
		System.out.println(partialString);
		
		partialString=str.substring(10);
		
		System.out.println(partialString);
		
		
		partialString=str.substring( 11, 16 );
		
		System.out.println(partialString);
		
		
		
		

	}

}
