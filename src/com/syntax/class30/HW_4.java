package com.syntax.class30;


import java.util.LinkedHashSet;
import java.util.Set;

public class HW_4 {

	public static void main(String[] args) {
	
		//Create the collection that will store single uniques Objects of a String type in which order is preserved.
		//Write a logic to concatenate all string from the collection.
		
		
		Set <String> mySet= new LinkedHashSet <>();
		
		mySet.add("I");
		mySet.add("love");
		mySet.add("my");
		mySet.add("dad");
		mySet.add("so");
		mySet.add("much.");
		mySet.add("much.");
		
		for (String x : mySet) {
			System.out.print(x+" ");
		}
		
		
		
		
		
		
		
		

	}

}
