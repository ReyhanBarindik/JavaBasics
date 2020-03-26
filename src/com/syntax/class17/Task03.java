package com.syntax.class17;

public class Task03 {
      /*Create a method that will accept a String as a parameter and return a new String that consist only of vowels. 
       * Method should be available inside the class where it was declared and executed by calling it is name.
       */
	
	   private static String getVowels (String str) {
		    String sum="";
	    	char [] array = str.toCharArray();
	    	for (char a : array) {
	    		if (a=='a' || a=='e' || a=='i' || a=='u' || a=='o' ) {
	    			sum=sum+a;
	    		} 
	    	}
	    	return sum;
	    }
	
	   public static void main(String[] args) {
		Task03 x= new Task03 ();
		String myStr=x.getVowels("reyhan");
		System.out.println(myStr);
		   
		   
	}

}
