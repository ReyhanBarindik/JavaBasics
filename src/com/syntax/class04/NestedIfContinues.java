package com.syntax.class04;

public class NestedIfContinues {

	public static void main(String[] args) {
		// check if patient has any allergies 
		//if no allergies --> you are healthy 
		//otherwise check if patient has :
		//orange allergy--> do not eat oranges
		// apple allergy--> do not eat apples 
		// kiwi allergy--> do not eat kiwis
		
		boolean allergy=true;
		boolean appleAllergy=false;
		boolean orangeAllergy=true;
		boolean kiwiAllergy=true;
		
		if (allergy) {
			System.out.println("Please answer below");
			 
			if (orangeAllergy) {
				System.out.println("Do not eat Oranges");
			}
			
			if (appleAllergy) {
				System.out.println("Do not eat Apples");
			
			}
					
			if (kiwiAllergy) {
				System.out.println("Do not eat Kiwi");
			}
			
			
			}else {
				System.out.println("You are healthy");
			}
		
		

	}

}
