package com.repl.it;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReplIt208 {

	public static void main(String[] args) throws FileNotFoundException {
		
		String filePath="";
		
		try {
		FileInputStream fis = new FileInputStream(filePath);
		
		} catch (RuntimeException e) {
			System.out.println(e);
		}
		
		
		
		
	}

}
