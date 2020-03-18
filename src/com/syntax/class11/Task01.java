package com.syntax.class11;

public class Task01 {

	public static void main(String[] args) {
		//Create an array of cars : american, german, korean, italian. Then retrieve all values from that array using 2 different loops
		
		String [][] cars = {
				{"a1","a2","a3"},
				{"g1","g2","g3"},
				{"k1","k2","k3"},
				{"i1","i2","i3"}
				
				
		};
		
		for (String [] car: cars) {
			for (String nameCar : car) {
				System.out.print(nameCar +" ");
			}
			System.out.println();
		}
		
		// 2.Way
		
		 for (int i=0; i<cars.length; i++) {
			 for (int j=0; j<cars[i].length; j++) {
				 System.out.print(cars[i][j]+ " ");
			 }
				 
			System.out.println();	 
		 }
		
		

	}

}
