package com.repl.it;

public class ReplIt133 {

	 public static String alphabetical (String str) {
		 
		String newS="";
		
		char [] arr =str.toCharArray();
		newS=newS+arr[0];
		for (int i=1; i<arr.length; i++) {
			
			
			if (arr[i]> arr[i-1]) {
				newS=newS+arr[i];
			}
		}
		
		
		
		
		return newS; 
	 }
	
	
	
	
	public static void main(String[] args) {
	System.out.println(alphabetical("hello")); //"hlo"	

	}

}
