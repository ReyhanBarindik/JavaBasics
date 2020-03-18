package com.syntax.class12;

public class StringMethods {

	public static void main(String[] args) {
		
		 String s = "Strings are immutable";
		 char result = s.charAt(8); 
		 System.out.println(result); 
          
		
		 String Str = new String("Welcome on Board");
		 String SubStr1 = new String("Tutorials"); 
		 String SubStr2 = new String("Sutorials"); 
		 
		 System.out.print("Found Index :" ); 
		 System.out.println(Str.indexOf( 'o' ));
		 System.out.print("Found Index :" ); 
		 System.out.println( Str.indexOf( SubStr1 )); 
		 System.out.print("Found Index :" ); 
		 System.out.println(Str.indexOf( SubStr2 ));  
		
		
		
		
		
		
		
		
		
		
		
	}

}
