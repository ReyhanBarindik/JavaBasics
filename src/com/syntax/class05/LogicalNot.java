package com.syntax.class05;

public class LogicalNot {

	public static void main(String[] args) {
		//
		
		boolean b=! true;
		boolean val=! false;
		
		System.out.println(b);
		System.out.println(val);
		
		
		boolean isCold=false;
		if (!isCold) {
			System.out.println ("Hello");
		} else {
			System.out.println("Bye");
			
		}
		
		System.out.println("-------------------------------------------------");
		
		String day1="Tuesday";
		
		if ( ! (day1.equals("Monday") && day1.equals("Friday") ) ) {
			System.out.println("Find me at Syntax");
		}
		 
		
		

	}

}
