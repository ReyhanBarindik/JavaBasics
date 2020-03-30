package com.syntax.class17;

public class Task01 {
     /*Create a method that will accept an array as parameters and will return a sum of all elements from that array. 
      * Method should be visibly only within same package and accessible by the creating an instance of the class.
      */

       protected int sumElements (int [] arr) {
    	  int sum=0;
    	  for (int i=0; i<arr.length; i++) {
    		  sum= sum+arr[i];
    	  }
    	return sum;  
      }
   
        
      
      public static void main(String[] args) {
		 Task01 num = new Task01 ();
		 int [] arr = {10, 20, 30, 40};
		 int sum=  num.sumElements(arr);
    	 System.out.println(sum);
          
	}

}
