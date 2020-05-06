package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Task01 {

	public static void main(String[] args) throws IOException {
		
		String filePath= "C:\\Users\\reyha\\eclipse-workspace\\JavaBasics\\configs\\Task01";
        System.out.println(filePath);
        
        String userDirectory= System.getProperty("user.dir");
		System.out.println(userDirectory);
		String filePath1= System.getProperty("user.dir")+"\\configs\\Task01";
		System.out.println(filePath1);
		
		String username1= System.getProperty("user.name");
		System.out.println(username1);
		
		String os = System.getProperty("os.name");
		System.out.println(os);
		
		FileInputStream finput = new FileInputStream (filePath);
		
		Properties prop = new Properties();
		
		prop.load(finput);
		
		String browser= prop.getProperty("browser");
		System.out.println(browser);
		String url = prop.getProperty("url");
		System.out.println(url);
		
		
	}

}
