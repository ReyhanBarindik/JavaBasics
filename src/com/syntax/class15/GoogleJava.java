package com.syntax.class15;

public class GoogleJava {
 
	int empId;
	double salary;
    String name, lastName, title ;
    
	void working ()          //method header 
   {	 // method body
		System.out.println(title +" is working");
	}
	void getPaid () {
		System.out.println(name + " is getting paid "+salary);
	}
	void attendMeetings () {
		System.out.println(name +" attending meetings");
	}  
	
	public static void main (String args[] ) {
		
	GoogleJava emp1 =new GoogleJava ();
	emp1.empId =123;
	emp1.name="Reyhan";
	emp1.attendMeetings();
	emp1.title="Google Java";
	emp1.salary=80000;	
	emp1.getPaid();	
	}
}
