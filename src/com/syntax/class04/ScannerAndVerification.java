package com.syntax.class04;
import java.util.Scanner ;
public class ScannerAndVerification {

	public static void main(String[] args) {
		
		Scanner input=new Scanner (System.in);
		System.out.println("Please enter the first number");
		
		int num1=input.nextInt();
		
		
		System.out.println("Please eneter the second number");
		
		int num2=input.nextInt();
		
		if (num1>num2) {
			System.out.println(num1+" is larger than "+num2);
			
			}else if (num2>num1) {
				System.out.println(num1+" is larger than "+num2);
				
				} else {
					System.out.println(num1+" is equal to "+num2);
					
				}
		
		
		
		
		
		
		
		
		
		
		

	}

}
