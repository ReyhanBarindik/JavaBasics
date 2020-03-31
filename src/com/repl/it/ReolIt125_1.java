package com.repl.it;

public class ReolIt125_1 {

	static String mixString(String s1, String s2) {

		String mixString="";
		
		for (int i=0; i<s1.length(); i++) {
		mixString=mixString+s1.charAt(i)+s2.charAt(i);
		 
		
		}
		
		return mixString;
	}

	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		String firstValue = mixString("12345", "abcde"); //"1a2b3c4d5e"
		System.out.println(firstValue);
		String secondValue = mixString("howdy", "hello");
		System.out.println(secondValue);
	}
	
	
	
	

}
