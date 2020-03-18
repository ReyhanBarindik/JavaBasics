package com.syntax.class05;
import java.util.Scanner ;
public class ScannerAndLogicalOperators {

	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in)	;
	System.out.println("Please enter your age");
	
	int age=scan.nextInt();
	if (age>0) {
	if (age>=0 && age<=3) {
		System.out.println("You are a baby");
	} else if (age>=4 && age<=13) {
		System.out.println("You are a kid");
	} else if (age>=14 && age<=19) {
		System.out.println("You are a teenager");
	} else if ( age>=20 && age<=60) {
		System.out.println("You are an adult");
	} else if (age>=61 && age<=100) {
		System.out.println("You are a senior");
	}else {
		System.out.println("You are enjoying your life");
	}
		
	}	else {
		System.out.println("Invalid AGE");
	}
		
		
		
        
	}

}
