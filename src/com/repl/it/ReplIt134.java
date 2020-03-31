package com.repl.it;

public class ReplIt134 {

	 public static String maxLength (String [] words) {
		 String maxLength =words [0];
		 for (int i=0; i<words.length; i++) {
			 if (words[i].length() > words[0].length()) {
				 maxLength=words[i];
			 }
			}
		 return maxLength;
		}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		String[] arr = {"hey","yolo","hi","this is long"};
		System.out.println(maxLength(arr));
		//should print "this is long"

	}

}
