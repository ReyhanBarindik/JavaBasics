package com.repl.it;

public class ReplIt207 {

	public static void main(String[] args) {
		
		int [] array = {1,2,3,4};
		
		try {
			
		  System.out.println(array[4]);
			
		}catch (RuntimeException e) {
			e.printStackTrace();
		}
		

	}

}
