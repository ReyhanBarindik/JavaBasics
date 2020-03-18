package com.syntax.class05;
import java.util.Scanner;
public class AllInOne {

	public static void main(String[] args) {
    
		Scanner scan;
		String sale;
		double price;
		double discount;
		double finalPrice;
		
		scan=new Scanner(System.in);
		System.out.println("Is there sale? Please answer : Yes or No");
		sale=scan.nextLine();
		
		if (sale.equalsIgnoreCase("Yes")) {
			System.out.println("Please enter price");
			price=scan.nextDouble();
			
			if (price<20) {
				discount=price*0.1;
				finalPrice=price-discount; 
				
		  } else if (price>=20 && price<100) {
			  discount=price*0.2;
			  finalPrice=price-discount; 
			  
		  } else if (price>=100 && price<500) {
			  discount=price*0.3;
			  finalPrice=price-discount; 
		  } else  {
			  discount=price*0.5;
			  finalPrice=price-discount; 
		  } 
			 
			System.out.println("After "+discount+" discount the price of the item reduced from "+price+" to "+finalPrice);	
			
			
			} else {
			System.out.println("Not going shopping");
		
			
		}
		
		
		 
		
		

	}

}
