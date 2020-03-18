package com.syntax.class05;

public class LogicalOperators2 {

	public static void main(String[] args) {
		
		int day=6;
		
		if (day>=1 && day<=5) {
			System.out.println("It is a weekday");
		}else if (day==6 || day==7) {
			System.out.println("It is a weekend");
		}else {
			System.out.println("Invalid day");
		}
		
		
		
		

	}

}
