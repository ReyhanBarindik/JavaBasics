package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesFileReading {

	public static void main(String[] args) throws IOException {              // if I do not have file just throws it 
		// to read the File 
		// 1. have file 
		
		String filePath="C:\\Users\\reyha\\eclipse-workspace\\JavaBasics\\configs\\Examples.properties";
        
		// 2. bring object of FileInputStream
		
		FileInputStream fileInput = new FileInputStream (filePath);
		
		// 3. to handle data from .properties file we need Properties Class 
		
		Properties prop=new Properties();
		prop.load(fileInput);
		
		String name=prop.getProperty("name");
		System.out.println(name);
		String city=prop.getProperty("city");
		System.out.println(city);
		
		//getting all keys from property file 
		Set<Object>keys=prop.keySet();
		for (Object key : keys) {
			System.out.println(key);
		}
		
		
	}

}
