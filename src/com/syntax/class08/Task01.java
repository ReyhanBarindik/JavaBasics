package com.syntax.class08;

public class Task01 {

	public static void main(String[] args) {
		//Print numbers from 1 to 20 except those that are divisible by 3 
		
		int i=1;
		
		while (i<20) {
			i++;
			if (i%3==0) {
				continue;
			}
			System.out.println(i);
			
			
			
		}
			
		
	}

}
