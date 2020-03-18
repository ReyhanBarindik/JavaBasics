package com.syntax.class10;

public class ArrayTask03 {

	public static void main(String[] args) {
		// Create an array of countries. While retrieving all values from an array print capital for each country. (use 2 different loops).

		String [] countries= {"Italy","Canada","Turkey","Russia"};
		String capital; 
		for (String country: countries) {
			if (country.equals("Italy")) {
				capital="Rome";
				
			} else if (country.equals("Canada")) {
				capital="Ottowa";
			}else if (country.equals("Turkey")) {
				capital="Ankara";
			} else if (country.equals("Russia")) {
				capital="Moskow";
			} else {
				capital="unknown";
			}
			
			System.out.println(country+ " "+ capital );
		}
		
		
		
		
		
		
		
		
		
	}

}
