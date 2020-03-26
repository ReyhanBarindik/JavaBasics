package com.repl.it;

public class ReplIt124 {
	static String countryName;
	  static String continent;
	  
	  void print () {
	    System.out.println(countryName+" located on "+continent+" continent");
	  }
	  public static void main (String [] args) {
	    ReplIt124 x= new ReplIt124 ();
	    
	    x.countryName="Morocco";
	    x.continent="Africa";
	    
	    x.print();
	    
	  }
	  
}
