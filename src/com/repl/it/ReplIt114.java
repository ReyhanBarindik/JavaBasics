package com.repl.it;

public class ReplIt114 {

	String spaceOut (String s) {
		String sum="";
		char [] array= s.toCharArray();
		   
		for (char a : array) {
			sum= sum+(a+" ");
			
	}
	 return sum;
	}
	
	public static void main(String[] args) {
		ReplIt114 x= new ReplIt114 ();
        String myWord =x.spaceOut("hello");
		System.out.println(myWord);
		ReplIt114 y= new ReplIt114 ();
        String myWord1 =y.spaceOut("technology");
		System.out.println(myWord1);
	}

}
