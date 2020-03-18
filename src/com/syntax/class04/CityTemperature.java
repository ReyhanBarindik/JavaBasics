package com.syntax.class04;
import java.util.Scanner ;
public class CityTemperature {

	public static void main(String[] args) {
		
		Scanner input=new Scanner (System.in);
		System.out.println("Input city");
		String city=input.nextLine();
		
		System.out.println("Input Temperature");
		
		int temp=input.nextInt();
		
		double fahrenheit= 75 ;
		double celsius= (fahrenheit-32)*5/9 ;
		
		System.out.println("The temperature is the city "+city+" is "+celsius);
		
		
		
		
		
		

	}

}
