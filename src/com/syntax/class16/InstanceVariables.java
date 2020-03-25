package com.syntax.class16;

public class InstanceVariables {

	String name="John"; //instance variable
	
	
	
	public static void main(String[] args) {
		
		
		String name="Yunus";
		System.out.println(name);  //Yunus
		
		InstanceVariables object =new InstanceVariables ();
		System.out.println(object.name);    //John
		
		object.name="Ali";
		System.out.println(name);  //Yunus 
		System.out.println(object.name);   //Ali
		
		//change value of local variable 
		name="Farid";
		System.out.println(name);   //Farid
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
