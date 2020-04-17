package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;


public class IteratorClass {

	public static void main(String[] args) {
		
		
		ArrayList <String> values = new ArrayList<String>();
		
		values.add("Reyhan");
		values.add("Yunus");
		values.add("Selma");
		values.add("Turker");
		
		
		Iterator <String> iterate = values.iterator();
		
		while (iterate.hasNext()) {                             //hasNext()  is a method which we use to check "Do we have the next element there?"
			System.out.println(iterate.next());                 //next()  to type next one
		}
		                                                         
	    
	
			
			
			
			
		}
		
		
		
		
		
	}




