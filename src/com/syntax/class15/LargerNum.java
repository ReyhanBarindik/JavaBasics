package com.syntax.class15;

public class LargerNum {
     //Create a method that will take 2 parameters as a numbers and prints which number is larger
	
	 void larger (int x, int y) {
		if (x>y) {
			System.out.println("larger num : "+x);
		} else {
			System.out.println("larger num : "+y);
		}
	 }
	 //Create a method that will take a number and prints whether the number is even or odd.
		void isItEvenOrOdd (int num) {
			if (num%2==0) {
				System.out.println(num +" is an even number");
			} else {
				System.out.println(num +" is an odd number");
			}
		}
	  //Create a method that will print whether given String is palindrome or not.
	     void isPalindrome  ( String word ) {
	    	 String reverse="";
	    	 char [] array = word.toCharArray();
	    	 for (int i=word.length()-1; i>=0; i--) {
	    		 reverse = reverse+array[i];
	    	 }
	    	 if (word.equalsIgnoreCase(reverse)) {
	    		 System.out.println("It is Palindrome");
	    	 } else {
	    		 System.out.println("It is Not Palindrome");
	    	 }
	     }
	   // Create a method that will say Hello in different language based on the country that will passed when method is executed.
	      void translate (String country) {
	    	  if (country.equalsIgnoreCase("Turkey")) {
	    		  System.out.println("Merhaba");
	    	  } else if (country.equalsIgnoreCase("Korea")) {
	    		  System.out.println("Anyoung haseyo");
	    	  } else if (country.equalsIgnoreCase("Russia")) {
	    		  System.out.println("Privet");
	    	  } else if (country.equalsIgnoreCase("Japan")) {
	    		  System.out.println("Konnichiwa");
	    	  }
	      }
	      
	 public static void main(String[] args) {
		LargerNum num1 = new LargerNum ();
		num1.larger(10, 5);
        num1.isItEvenOrOdd(8);
        num1.isPalindrome("neveroddoreven");
        num1.translate("Turkey");
	}

}
