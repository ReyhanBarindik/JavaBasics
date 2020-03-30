package com.syntax.class19;

public class ThisKeyword {

	int a; 
	int b;
	
	public ThisKeyword (int a, int b) {    //---> instance variables
		this.a=a;
		this.b=b;     
		
	}
	
	public ThisKeyword () {
		System.out.println("I am non argument constructor");
	}
	public void sum (int a, int b) {       //---> a,b local variables (parameters are local)
		System.out.println("Sum of local variable "+(a+b));
		System.out.println("Sum of instance variable "+(this.a+this.b));//---> instance variables
	}
    
	public static void main(String[] args) {
	
		ThisKeyword obj1 = new ThisKeyword (10, 20);  //--> instance 
		obj1.sum(100, 200); //--> local 
        
		
		
		
		
	}

}
