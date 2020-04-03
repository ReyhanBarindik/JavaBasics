package com.syntax.InterviewQuestions;

public class IQ_08 {

	//Write a return method that check if a string is build out of the same
	//letters as another string.
	//Ex: same("abc", "cab"); -> true , same("abc", "abb"); -> false:
	
	
	public static boolean sameLetter (String str, String newS) {
		
		boolean flag=false; 
		String [] ch = str.split("");
		for (String c : ch) {
			if (newS.contains(c)) {
				flag= true;
			}else {
				flag=false;
			}
		}
		
		
		return flag;
	}
	
	public static void main(String[] args) {
		IQ_08 x= new IQ_08 ();
		boolean flag = x.sameLetter("abc", "abb");
		System.out.println(flag);

	}

}
