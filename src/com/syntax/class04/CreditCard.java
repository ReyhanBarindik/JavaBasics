package com.syntax.class04;
import java.util.Scanner ;
public class CreditCard {

	public static void main(String[] args) {
		
      Scanner input=new Scanner(System.in);
      
      System.out.println("Do you have a criditcart?");
      
      
      boolean creditCard=input.nextBoolean();
      
      
       if (creditCard) {
    	  System.out.println("What is balance on the card?");
    	  
    	  int balance=input.nextInt();
    	  
    		   if (balance>1000) {
    			   System.out.println("Pay off immediately");
    			   
    		   } else {
    			   System.out.println("You can spend more");
    		   }
    	  
    	  
    	  
    	   } else {
    	  System.out.println("Would you like to get a card?");
      }
      
		
		
		
		
		
		
		
	}

}
