package com.syntax.class19;

public class StudentClass {

	/*Write program as a Student class   that has instance variables name and address. 
	 * Create a constructor that will initialize those variables. 
	 * Print name & address of given  student using displayInfo method.
	 */
	
	String name;
	String address;
	
	StudentClass (String name, String address) {
		this.name= name;
		this.address= address;
	}
	
	public void displayInfo () {
	    System.out.println(name +" "+address );
	}
	
	
	public static void main(String[] args) {
		
		StudentClass s1 = new StudentClass ("Reyhan","Jacksonville");
		s1.displayInfo();
	}

}
