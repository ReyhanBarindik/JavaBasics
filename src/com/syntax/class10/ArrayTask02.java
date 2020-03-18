package com.syntax.class10;

public class ArrayTask02 {

	public static void main(String[] args) {
		// Create an array on integers and calculate the sum of all integer elements in an array.

		int [] elements= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10} ;
		
		int sum =0; 
		
		for( int i : elements) {
			sum=sum+i;
		}
		System.out.println(sum);
		//2
		
		int sum1=0; 
		for (int i=0;  i<elements.length; i++ ) {
			sum1=sum1+elements[i]; 
		}
		
		System.out.println(sum1);
		
		
		
		
	}

}
