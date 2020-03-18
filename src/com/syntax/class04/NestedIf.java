package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		
	  boolean flag=false;
	  boolean classToday=true;
	  
	  
	  if (flag) {
		  System.out.println("Hello");
		  if (classToday) {
			  System.out.println("Hello Friends");
			  
		  } else {
			  System.out.println("Hello Family");
		  }
		  
		  
	  }else {
		  System.out.println("Bye");
	  }

        System.out.println("I am outside of if condition");
	}

}
