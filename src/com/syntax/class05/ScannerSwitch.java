package com.syntax.class05;
import java.util.Scanner;
public class ScannerSwitch {

	public static void main(String[] args) {
		
		Scanner scan;
		char gender;
		String genderType;
		
		scan=new Scanner(System.in);
		System.out.println("What is your gender? M or F");
	    gender=scan.next().charAt(0);
	    
	    switch (gender) {
	    
	    case 'M':
	    	genderType="Male";
	    	break;
	    case'F':
	    	genderType="Female";
	    	break;
	    default :
	    	genderType="Unknown";
	    	
	    	 }
		System.out.println("Your gender is "+genderType);
		
		
		
		
		
		

	}

}
