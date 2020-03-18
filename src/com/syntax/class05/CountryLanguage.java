package com.syntax.class05;
import java.util.Scanner;
public class CountryLanguage {

	public static void main(String[] args) {
		
		Scanner scan;
		String country;
		String language;
		
		scan=new Scanner(System.in);
		System.out.println("Where are you from?");
		country=scan.nextLine();
		
		switch (country) {
		
		case "Turkey" :
			language="Turkish";
			break;
		case "USA" :
			language="English";
			break;
		case "Germany":
			language="German";
			break;
		case "Russia":
			language="Russian";
			break;
		default: 
			language="Unknown";
			
		
		}
		System.out.println("Your language is "+language);
		

	}

}
