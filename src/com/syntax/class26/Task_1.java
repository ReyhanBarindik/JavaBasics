package com.syntax.class26;

import java.util.ArrayList;

public class Task_1 {

	public static void main(String[] args) {
		/*Create a generic ArrayList that will store 5 names into it. 
	Find out whether the given ArrayList is empty or not? 
	Check whether the specific name is present in an ArrayList or not?
	Find the size of your arrayList and print all values from that
        */
		
		ArrayList <String> names= new ArrayList<>();
		
		names.add("Gulsum");
		names.add("Yunus");
		names.add("Selma");
		names.add("Senel");
		names.add("Turker");
		
		boolean empty = names.isEmpty();
		System.out.println("ArrayList is empty : "+empty);
		
		boolean given = names.contains("Yunus");
		System.out.println("Yunus is present in ArrayList : "+given);
		
		int size= names.size();
		System.out.println("Size of ArrayList is : "+size);
		
		for (String name : names) {
			System.out.println(name);
		}
		System.out.println("============");
		
		for (int i=0; i<names.size(); i++) {
			String name= names.get(i);
			System.out.println(name);
		}
		
		
		
		
		
		
		
		
		
	}

}
