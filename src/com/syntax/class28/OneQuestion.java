package com.syntax.class28;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OneQuestion {

	//remove duplicate items
	
	
	public static void main(String[] args) {
		List <String>aList = new ArrayList<>();
		aList.add("John");
		aList.add("Jane");
		aList.add("James");
		aList.add("Jasmine");
		aList.add("Jane");
		aList.add("James");
		
		Set <String> setlist= new HashSet<>();
		setlist.addAll(aList);
		
		System.out.println(setlist);
		
		
		
		
		
		
	}
}
	
	
	
	
	
	
	
	
	

