package com.syntax.class04;
import java.util.Scanner ;
public class WorkedYears {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter your worked years:");
		int years=scan.nextInt();
		
		System.out.println("Enter your annual salary:");
		long salary=scan.nextLong();
		
		if (years>=5) {
			System.out.println("You are eligible for the bonus");
			 
			if (salary>50000) {
				System.out.println("Bonus=5000");
				
			}else {
				System.out.println("Bonus=3000");
			}
			
			
			}else {
			System.out.println("You are not eligible for the bonus");
		}
		

	}

}
