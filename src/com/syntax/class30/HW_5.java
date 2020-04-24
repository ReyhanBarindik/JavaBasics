package com.syntax.class30;

import java.util.ArrayList;

public class HW_5 {

	public static void main(String[] args) {
		// Create a collection of integers in which you can keep duplicates. 
		//Write a logic to find sum of all integers

		
	   ArrayList <Integer> myList= new ArrayList<>();
	   
	   myList.add(67);
	   myList.add(87);
	   myList.add(97);
	   myList.add(57);
	   myList.add(37);
	   myList.add(37);
	   int sum=0;
	   for (int x :myList) {
		   sum= sum +x;
	   }
	   System.out.println("Sum of myList : "+sum);
	
		
		
		
		
		
		
	}

}
