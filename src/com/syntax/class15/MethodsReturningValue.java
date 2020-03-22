package com.syntax.class15;

public class MethodsReturningValue {
    
	int largest (int a, int b) {
		int largest ;
		if (a>b) {
			largest=a;
		} else {
			largest=b;
		}
		return largest;
	}
	  
	boolean isEven (int x)  {
		boolean isEven;
		if (x%2==0) {
			isEven=true;
		} else {
			isEven=false;
		}
		return isEven;        // return variable return you value 
	}
	
	
	 public static void main(String[] args) {
	
		MethodsReturningValue object= new MethodsReturningValue ();
		int num= object.largest(10, 5);
		boolean flag =object.isEven(10) ;
		System.out.println("Largest num "+ num + " is even number : "+ flag );
	}

}
