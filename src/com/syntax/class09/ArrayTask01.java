package com.syntax.class09;

public class ArrayTask01 {

	public static void main(String[] args) {
		// Create an array of chars and store grades into it: A,B,C,D,E,F. Then print a grade B (use 2 different ways of creating an array).
        //1. Way
		char [] grades= new char [5];
		
		grades[0]='A';
		grades[1]='B';
		grades[2]='C';
		grades[3]='D';
		grades[4]='E';

		System.out.println(grades[1]);
		//2.Ways
		
		char [] grades1= {'A', 'B', 'C', 'D', 'E'};
		
		System.out.println(grades1[1]);
		
		
		
		
		
		
		
	}

}
