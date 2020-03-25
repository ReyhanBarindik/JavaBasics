package com.syntax.class16;

public class Employee {

	/*Create a Class called Employee:
    Create three  variables  eID , salary and set the CEO to “Sumair” 
    Create two objects of the class Employee 
    Set the value of eID, salary for each of the objects
    Print out the eID , salary and  CEO for each of the objects 
	 */
     
	static String CEO ="Sumair";
	
	String eID;
	double salary;
	
	
	
	public static void main(String[] args) {
	
		Employee obj1=new Employee ();
		Employee obj2=new Employee ();
		
		obj1.eID="Reyhan";
		obj1.salary=80000;
		System.out.println(obj1.eID);
		System.out.println(obj1.salary);
		System.out.println(obj1.CEO);
		
		obj2.eID="Asli";
		obj2.salary=70000;
		System.out.println(obj2.eID);
		System.out.println(obj2.salary);
		System.out.println(obj2.CEO);
		
		
		
		
		
		
		
		
		
		
		
	}

}
