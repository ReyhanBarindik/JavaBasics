package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteToPropertiesFile {

	public static void main(String[] args) throws IOException {
		// to write into existing file and add values
		
		String filePath="C:\\Users\\reyha\\eclipse-workspace\\JavaBasics\\configs\\Examples.properties";

		FileInputStream fis = new FileInputStream (filePath);   // 1. First to load Data 
		
		Properties prop = new Properties ();
		prop.load(fis);
		
		prop.setProperty("phoneNumber", "123456789");            //2. Make changes 
		
		FileOutputStream fos = new FileOutputStream (filePath);    // push the data        //3. Write to the File 
		prop.store(fos, "Added additional key");
		
		
		
	}

}
