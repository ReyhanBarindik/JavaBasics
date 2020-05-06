package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionIntro {

	static String str;
	
	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		
		int a=10;
		int b=0;
		
		//System.out.println(a/b);    --->ArithmeticExcepsion 
		
		System.out.println("End of the program");
		
		int [] array = {12, 1 ,13};
		
	   // System.out.println(array[3]); ---> ArrayIndexOutOfBoundsException
	   // System.out.println(array.length); ----> NullPointerException

		NullPointerException npe=new NullPointerException();

//		throw(npe);

		

		Thread.sleep(2000);

		

		String filePath="";

		

		FileInputStream fis=new FileInputStream(filePath);
	
		
		
		
		

	}

}
