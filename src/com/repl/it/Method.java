package com.repl.it;

public class Method {

	static int sum (int [][] array) {
		
		int sum=0;
		
		for (int i=0; i<array.length; i++) {
			for (int j=0; j<array.length; j++) {
				sum= sum +array[i][j];
			}
		}
		
		return sum;
	}
	
	
	
	
	
	
	
}
