package com.syntax.class13;

public class StringMdQuestion {
	// how to print one character at one time on one line using a METHOD
    // input : rrreeeeyyhannn   output: reyhan
	
	
	 void  newOne (String str) {
		    
		System.out.println(str.charAt(0)+""+ str.charAt(3)+""+str.charAt(7)+""+str.charAt(9)+""+str.charAt(10)+""+str.charAt(11)) ;
		 
		    
		  
	  }
	
	public static void main (String [] args) {
		
		StringMdQuestion x= new StringMdQuestion ();
		x.newOne("rrreeeeyyhannn");
		
		
		
		
	}
	
	

}



