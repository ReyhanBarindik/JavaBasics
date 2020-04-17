package com.syntax.class26;

import java.util.ArrayList;
public class Task_02 {

	public static void main(String[] args) {
		/*Create a generic ArrayList that will store 5 names into it. 
		Find out whether the given ArrayList is empty or not? 
		Check whether the specific name is present in an ArrayList or not?
		Find the size of your arrayList and print all values from that
		*/
		ArrayList<Integer>nums=new ArrayList<>(); 
		
		ArrayList <String> names = new ArrayList<>();
		
		names.add("Gulsum");
		names.add("Selma");
		names.add("Senel");
		names.add("Turker");
		names.add("Reyhan");
			
		
		boolean flag= names.isEmpty();
		System.out.println("My ArrayList is empty : "+flag);
		System.out.println("Is Yunus in my array list "+names.contains("Yunus"));
		
		int size= names.size();
		System.out.println("Size of My Array List : "+size);
		
		for (String name : names) {
			System.out.println(name);
		}
		
		
	}

}
