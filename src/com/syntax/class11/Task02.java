package com.syntax.class11;

public class Task02 {

	public static void main(String[] args) {
		//Create an array of countries: north america countries, south america countries, europe countries, asian countries, african countries. 
		//Then print all values from that array using 2 different loops and calculate how many total countries been stored.
        int sum =0; 
		String [][] countries = {
				{"Canada","USA","Mexico"},
				{"Brazil","Colombia","Venezuela"},
				{"Italy","Germany","France"},
				{"China","Japon"},
				{"Kenya","Mali"} 
		};
		
		for (String [] country : countries) {
			for (String name : country) {
				System.out.print(name+" ");
				sum++;
			}
			System.out.println();
		}
		
		
		System.out.println("Total countries : "+sum);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
