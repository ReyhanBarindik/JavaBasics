package com.syntax.class33;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task2 {

	public static void main(String[] args) {

		List<Exception> list = Exceptions();
		System.out.println(list.size());
		Iterator<Exception> it = list.iterator();

		while (it.hasNext()) {
			String message = it.next().getMessage();
			System.out.println(message);
		}

		/*
		 * Create a static method that will return a List of Exceptions. Inside your
		 * method create objects of 4 exception classes using try and catch blocks and
		 * store them inside your list. Call your method inside main and print name and
		 * details of all Exception objects.
		 * 
		 */

	}

	static List<Exception> Exceptions() {

		List<Exception> list = new ArrayList();
		int x = 5;
		int y = 0;
		
		int sum=x/y;
		if (sum>0 || sum<0 || sum==0) {
			System.out.println(x/y);
		} else {
		throw new RuntimeException();
		}

		int[] array = { 12, 1, 13 };
		try {

			System.out.println(array[3]);

		} catch (Exception e2) {

			list.add(e2);
		}
		String[] array1 = null;
		try {
			System.out.println(array1.length);
		} catch (Exception e3) {

			list.add(e3);
		}
		String filePath = "";
		try {
			FileInputStream fis = new FileInputStream(filePath);

		} catch (Exception e4) {

			list.add(e4);
		}

		return list;

	}

}
