package com.repl.it;

public class ReplIt111 {

	String word (String a) {
		return a.toUpperCase(); 
		
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		ReplIt111 x = new ReplIt111 ();
		String myWord= x.word("test");
		System.out.println(myWord);
	}

}
