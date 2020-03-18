package com.syntax.class04;

public class MortgageRate {

	public static void main(String[] args) {
		
		
		double rate=3.5;
		long price=300000l;
		
		if (rate>4.5) {
			System.out.println("User will not buy a house");
			
			
			
			
			
			} else {
			System.out.println("User will consider buying");
			if (price>200000) {
				System.out.println("User will take a loan");
			}else {
				System.out.println("User will pay cash");
			}
		} 

	}

}
