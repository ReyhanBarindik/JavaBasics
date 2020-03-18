package com.syntax.class05;
import java.util.Scanner;
public class SwitchWithStrings {

	public static void main(String[] args) {
		
		Scanner scan;
		String country;
		String favFood;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter your country");
		country=scan.nextLine();
		
		switch (country) {
		
		case "Morocco":
			favFood="couscous";
			break;
		case "Belarus":
			favFood="Potato";
		    break;
		case "Tajikistan":
			favFood="Osh";
			break;
		case "Turkey":
			favFood="Baklava";
			break;
		default :
			favFood="Invalid";
			
			}
		
		
		System.out.println("Your favorite food is "+favFood);
		
		
		
		
		
		
		
		

	}

}
