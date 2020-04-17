package com.repl.it;

import java.util.ArrayList;

public class ReplIt181 {

	public static void main(String[] args) {
		/*
		 * Create an array list to type String. Add these values below to your arraylist
		 * hi yo sup yolo boop
		 * 
		 * Remove 1, 3, 5 element from an array
		 * 
		 * print remained values one by one in one line
		 */
		
		ArrayList<String>values= new ArrayList<>();
		
		values.add("hi");
		values.add("yo");
		values.add("sup");
		values.add("yolo");
		values.add("boop");
		
		values.remove("hi");
		values.remove("sup");
		values.remove("boop");
	
		for (String v :values) {
			System.out.println(v+" ");
		}
		
		
		
		
		
		
		
		
	}

}
