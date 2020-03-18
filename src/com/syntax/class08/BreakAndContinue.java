package com.syntax.class08;

public class BreakAndContinue {

	public static void main(String[] args) {
		for (int i=1; i<10; i++) {
			if (i==4) {
				System.out.println("I am stopping loop");
				break;
			}
			System.out.println("I am inside the loops");
			}
		    System.out.println("I am outside the loops");

	}

}
