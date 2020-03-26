package com.repl.it;

public class ReplIt125 {
	
	static String mixString (String s1, String s2) {
		String sum="";
		for (int i=0; i<s1.length(); i++) {
			sum=sum+s1.charAt(i) +s2.charAt(i);
		}
	    return sum;
	
	}
		//test case below (dont change):
		public static void main(String[] args){
		    String firstValue = mixString("12345","abcde"); 
			System.out.println(firstValue); 
			String secondValue = mixString("howdy","hello");
			System.out.println(secondValue); 
		}
}
