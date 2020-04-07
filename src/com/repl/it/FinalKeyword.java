package com.repl.it;

public class FinalKeyword {
    boolean flag;
	final void hello (boolean flag) {
		System.out.println("Final method with boolean parameter");
	}
	String a;
	final void hello (String a) {
		System.out.println("Final method with String parameter");
	}
	
	public static void main(String[] args) {
		FinalKeyword x = new FinalKeyword ();
        x.hello(true);
        x.hello("reyhan");
	}

}
