package com.syntax.class10;

public class SmallestNumber {

	public static void main(String[] args) {
		// fing smallest number {50,200,5,90} 
		
		int [] nums= {50,200,5,90};
		
		int smallest=0;
		
		for (int i=0; i<nums.length; i++) {
			if (nums[i]<smallest) {
				smallest=nums[i];
			}
			
		}
		System.out.println(smallest);
		
		
		
		
		
		
		
		
		
		
		

	}

}
