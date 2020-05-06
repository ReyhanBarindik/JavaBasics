package com.syntax.class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExample {

	public static void main(String[] args) {
       multipleSleep();
       try {
		read("");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println(e);
	}
       System.out.println("________End of the Code______");
	}

	public static void read (String filePath) throws FileNotFoundException {
		FileInputStream fis = new FileInputStream(filePath);
	}
	
	
	
	public static void multipleSleep() {
		try {
			sleep();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}

	}

	public static void sleep() throws InterruptedException {
		Thread.sleep(2000);
	}

}
