package com.repl.it;

public class ReplIt115 {

	
	String censorLetter (String a,char b) {
		String newS="";
		newS=a.replace('e', '*') ;
		return newS;
	}
	String censorLetter2 (String a,char b) {
		String newS="";
		newS=a.replace('t', '*') ;
		return newS;
	}
	
	
	
	public static void main(String[] args) {
		ReplIt115 x= new ReplIt115 ();
        String myWord=x.censorLetter("computer science", 'e');
        System.out.println(myWord);
        ReplIt115 y= new ReplIt115 ();
        String myWord1=y.censorLetter2("trick or treat", 't');
        System.out.println(myWord1);
	}

}
