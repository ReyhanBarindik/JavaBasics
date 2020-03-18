package com.syntax.class11;

public class Advancedloop {

	public static void main(String[] args) {
		
		String [][] professions= { 
				{"QA Testers","Developers","Product Owner","Scrum Master"},
				{"Math Teacher","Science Teacher","ESL Teacher"},
				{"Dentist","Surgeon"} 
				
		};
		
		
		for (String [] occupation : professions ) {
			for (String title : occupation ) {
				System.out.print(title +" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
