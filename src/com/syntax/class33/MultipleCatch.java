package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class MultipleCatch {

	public static void main(String[] args) {
		
		String file=System.getProperty("user.dir") + "\\configs\\Examples.properties";
		try {
		FileInputStream fis = new FileInputStream(file); // new FileNotFoundException();
		fis.close();
		Properties prop = new Properties();
		prop.load(fis);    // new IOException();
		
		
		
		
		} catch (FileNotFoundException e) {     // (Exception e) yazarsan sadece onu okur !
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			System.out.println("I am the finally block");
		}
       System.out.println("__________end of the Program_______");
       
	}

}
