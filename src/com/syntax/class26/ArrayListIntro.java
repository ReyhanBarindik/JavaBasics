package com.syntax.class26;

import java.util.ArrayList;

public class ArrayListIntro {

	public static void main(String[] args) {
		//create an arraylist to store numbers
		
		ArrayList <Integer> numbers = new ArrayList<>();
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		
		System.out.println(numbers.get(2));
		System.out.println(numbers.contains(30));
		
		System.out.println(" ------ ------- -----");
		
		for (int i=0; i<numbers.size(); i++) {
			int number= numbers.get(i);
			System.out.println(number);
		}
		System.out.println(" ------ ------- -----");
		
		for (int number :numbers) {          //for (Integer number :numbers ) da oluyor 
			System.out.println(number);
		}
		
		
		
		

	}

}
