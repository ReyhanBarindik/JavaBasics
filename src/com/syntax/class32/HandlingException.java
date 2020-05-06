package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class HandlingException {

	public static void main(String[] args) {
		
	try {
		Thread.sleep(2000);            
	} catch (InterruptedException e) {          //--> new InterruptedException ();
		
		e.printStackTrace();
	}	
	
	System.out.println("Continue to next try block");
	
	String fpath ="";
	
    try {
    	FileInputStream fis = new FileInputStream (fpath);
    } catch(FileNotFoundException fne) {                      // ---> new FileNotFoundException();
    	System.out.println("Cathed FileNotFoundException");
    }

    System.out.println("End of the program");	
		
		
		
		
		
		
	}

}
