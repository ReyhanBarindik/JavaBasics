package com.syntax.class04;

public class MoreNestedIf {

	public static void main(String[] args) {
	
		boolean isFriday=false;
		int date=13;
		
		if (isFriday) {
			System.out.println("I am going to a movies");
			
			if (date==13) {
				System.out.println("scary movie");
			}else {
				System.out.println("comedy");
			}
			
			
		}else {
			System.out.println("I'm staying home");
		}
		

	}

}
