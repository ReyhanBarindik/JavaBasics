package com.repl.it;

public class ReplIt118 {

	
	String nameOfCountry;
	  String capital;
	  int populationSize;
	  
	  void printThem () {
	    System.out.println("The capital of "+nameOfCountry+" is "+capital+" and population is "+populationSize);
	  }
	
	
	
	public static void main(String[] args) {
		ReplIt118 x= new ReplIt118();
		ReplIt118 y= new ReplIt118 ();
	    
	    x.nameOfCountry="USA";
	    x.capital="Washington DC";
	    x.populationSize=330000000;
	    
	    y.nameOfCountry="Kazakhstan";
	    y.capital="Astana";
	    y.populationSize=18500000;
	    
	    
	    x.printThem();
	    y.printThem();
	    

		
		
	}

}
