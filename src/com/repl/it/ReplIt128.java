package com.repl.it;

public class ReplIt128 {

	 
	   static int countVowels (String s) {
		   int count=0;
		   char [] array = s.toCharArray();
		   for (char a: array) {
			   if (a=='a' || a=='e' || a=='i' || a=='u' || a=='o') {
				   count++;
			   }
		   }
		   return count++;
		   
		   
		   
	   }
	
	//test case below (dont change):
		public static void main(String[] args){
			System.out.println(countVowels("obama")); //3
			System.out.println(countVowels("happy friday! i love weekends")); //9
		}
	
}
