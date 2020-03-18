package com.syntax.class12;
import java.util.Scanner;
public class Task03 {

	public static void main(String[] args) {
		
        //Write a program that reads two people’s first names and if they expecting boy or girl?
        //Based on the input suggests a name for a baby:
        //Example Output:
        //Mom’s first name? Mary
        //Dad’s first name? Daniel
        //Boy or Girl? boy
        //Suggested baby name: DANRY
		
		Scanner scan;
		String momName;
		String dadName;
		String gender;
		String girl=null;
		String boy=null;
		
	    scan=new Scanner (System.in);
		
		System.out.println("Please enter mom's name of the baby");
		momName=scan.nextLine();
		
		System.out.println("Please enter dad's name of the baby");
		dadName=scan.nextLine();
		
		System.out.println("Waht is gender of your baby");
		gender=scan.nextLine();
		
		if (gender.equals(boy)) {
			
			System.out.println(dadName.substring(0, dadName.length()/2) + momName.substring(momName.length()/2, momName.length()));
			
		} else {
			System.out.println(momName.substring(0, momName.length()/2) + dadName.substring(dadName.length()/2, dadName.length())) ;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
