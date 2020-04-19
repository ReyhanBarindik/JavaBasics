package com.repl.it;

import java.util.Iterator;
import java.util.LinkedList;

public class ReplIt188_2 {

	  public static LinkedList <String> removeElement (LinkedList <String> myList, String letter ){
		  
		 Iterator <String> it = myList.iterator();
		 while (it.hasNext()) {
			 if (it.next().startsWith(letter)) {
				 it.remove();
			 }
		 }
		 return myList; 
		  
		  
	  }
	
	public static void main(String[] args) {
		
		LinkedList<String> countries = new LinkedList<>();
		
		countries.add("Armenia");
		countries.add("USA");
		countries.add("Kazakhstan");
		countries.add("Australia");
		countries.add("Pakistan");
		countries.add("Russia");
		countries.add("Azerbaijan");
		
		System.out.println(removeElement(countries, "A"));

	}

}
