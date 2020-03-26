package com.repl.it;

public class ReplIt126 {
	static String thirdLetter (String s) {
		String sum="";
		char [] array =s.toCharArray();
		for (int i=0; i<s.length(); i++) {
			if (i%3==0) {
				sum=sum+array[i];
			}
			
		}
		return sum;	
		
	}

	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(thirdLetter("hello there")); //"hltr"
		System.out.println(thirdLetter("technology")); //"thly"
	}
}
