package com.syntax.class18;

import com.syntax.class17_1.Task03FromClass18;

public class Task03 {
       /*Write a program  that will have 4 different access levels of constructors and create 3 objects of this class:
        *  1 - inside same class; 2 - from outside the class;
        *   3 - from different class inside different package  and observe result.
        */
	
	   int a;
	
	
	Task03 () {
		a=5;
	}
	
	
	public static void main(String[] args) {
		Task03 x= new Task03 ();
		System.out.println("This is my object from inside same class "+ x.a);
		
		//Task03FromClass18 y= new Task03FromClass18 ();
		//System.out.println("This is my object from different class inside different package "+ y.newVar);    
		 // it is not visible
		
		Test z= new Test ();
		System.out.println("This is my object from outside the class " + z.age);
	}

}
