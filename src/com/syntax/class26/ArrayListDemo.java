package com.syntax.class26;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
	  // create an arraylist with names
		
		ArrayList <String>arrayList=new ArrayList<>();
		
		//adding String Object into arraylist
		
		arrayList.add("John");
		arrayList.add("Gulbahar");
		
		//access element from arrayList 
		String secondElement= arrayList.get(1);
		System.out.println(secondElement);
		
		//arraylist is dynamic array
		arrayList.add("Jane");
		arrayList.add("James");
		
		//how to get number of elements inside arrayList?
		int size= arrayList.size();
		System.out.println(size);
		
		arrayList.add("Hitchem");
		System.out.println(arrayList.size());
		
		arrayList.set(1, "Ahmet");
		System.out.println(arrayList);
		
		// how to retrieve values from arraylist 1 by 1? 
		
		for (int i=0; i< arrayList.size(); i++) {
			String element=arrayList.get(i);
			System.out.println(element);
		}
		System.out.println("=========");
		
		for (String element : arrayList) {
			 System.out.println(element);
		}

	}

}
