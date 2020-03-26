package com.syntax.class17;

public class Task02 {
    /*Create a method that will take a String as a parameter and returns reverse String. 
      Method should be available to all classes within your projects and accessible by class name.
    */
	
	  public static String reverse (String str) {
		
		  char [] array = str.toCharArray();
		  String reverse="";
		  for (int i =str.length()-1; i>=0; i--) {
			 reverse  = reverse  + array[i];
		  }
	      return reverse;
	}
	
	public static void main(String[] args) {
		
		Task02 x =new Task02();
		String myWord =x.reverse("reyhan");
        System.out.println(myWord);
        
	}

}
