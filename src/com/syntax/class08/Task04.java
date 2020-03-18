package com.syntax.class08;
import java.util.Scanner;
public class Task04 {

	public static void main(String[] args) {
		Scanner scan;
		String item;
		double price;
		double amount=0;
		double change;
		double money;
		double remanningBalance;
		
		scan=new Scanner(System.in);
		System.out.println("What do you want to buy today?");
		item=scan.nextLine();
		System.out.println("What is the price of "+item);
		price=scan.nextDouble();
		
		do {
			System.out.println("Please, give payment");
			money=scan.nextDouble();
			amount=amount+money;
			if (price>amount) {
				remanningBalance=price-amount;
		   	    System.out.println("Please give more "+remanningBalance);
		    } else if (amount>price) {
		    	change=amount-price;
		    	System.out.println("Here is your change "+change);
		    	break;
		    }
		    
		    } while (amount!=price); 
		      System.out.println("Thank you for shopping");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
