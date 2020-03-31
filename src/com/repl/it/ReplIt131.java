package com.repl.it;

public class ReplIt131 {

	protected String name;
	public String city;
	String nameOfSchool;
	private int batchNumber;
	
	
	
	void displayInfo () {
		System.out.println("My name is "+name+" and I live in "+city+".I study at "+nameOfSchool+" in batch "+batchNumber);
	}
	
	
	
	
	
   public static void main(String[] args) {
	   
		ReplIt131 x =new ReplIt131 ();
		x.batchNumber=6;
		x.city="Miami";
		x.name="John";
		x.nameOfSchool="Syntax";
		x.displayInfo();

	}

}
