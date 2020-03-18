package com.syntax.class10;

public class ArrayTask01 {

	public static void main(String[] args) {
		// Create an array of animals and store 6 elements into it. Using 2 different loops print all elements from the array.

		String[] animals= {"Monkey", "Rabbit","Cat","Dog","Mouse","Bird"} ;
		//1
		for (String animal: animals ) {
			System.out.print(animal+" "); 
		}
		//2
		System.out.println();
		
		for (int i=0; i<animals.length; i++) {
			System.out.print(animals[i]+" ");
		}
		
		
		
		
	}

}
