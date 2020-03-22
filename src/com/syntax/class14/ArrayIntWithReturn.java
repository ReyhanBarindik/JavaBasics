package com.syntax.class14;

public class ArrayIntWithReturn {

	public static void main(String[] args) {
		String shouting =caps ("Why are you reading my diary mom?!");
        System.out.println(shouting);
        int [] myArray= giveMeArray (5, 10, 15);
        for (int i=0; i<myArray.length; i++) {
        	System.out.println(myArray[i]);
        }
   }

	public static String caps (String s) {
		return s.toUpperCase();
	}
	
	public static int [] giveMeArray (int a, int b, int c) {
		int [] array = new int [3];
		array[0]=a;
		array[1]=b;
		array[2]=c;
		return array;
	}
	
	
	
}
