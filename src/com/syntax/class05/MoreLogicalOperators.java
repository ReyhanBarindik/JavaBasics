package com.syntax.class05;

public class MoreLogicalOperators {

	public static void main(String[] args) {
		// 
		int day=6;
		
		if (day==2 || day==3) {
			System.out.println("SDLC class");
		} 
		else if (day==6 || day==7) {
			System.out.println("Java class");
		} else if (day==1 || day==5) {
			System.out.println("Today is no class");
		}else if (day==4) {
			System.out.println("Review class");
		}else {
			System.out.println("Invalid day");
		}
		System.out.println("-------------------------------");
		
		String day1="Saturday";
		if (day1.equals("Tuesday") || day1.equals("Wednesday")) {
			System.out.println("Today is SDLC Class");
		} else if (day1.equals("Saturday") || day1.equals("Sunday")) {
			System.out.println("Today is Java class");
			
		} else if (day1.equals("Thursday")) {
			System.out.println("Today is review class");
		}else {
			System.out.println("Invalid day");
		}
		
		
		
		
		

	}

}
