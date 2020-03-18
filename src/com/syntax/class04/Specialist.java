package com.syntax.class04;
import java.util.Scanner;
public class Specialist {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner (System.in);
		
		System.out.println("What is the amount of loan is needed");
		int loan=scan.nextInt();
		
		if (loan<=200000) {
			System.out.println("You would lend the money");
			
			} else {
				System.out.println("You would refect the cilent");
				
			}
		
	}

}
