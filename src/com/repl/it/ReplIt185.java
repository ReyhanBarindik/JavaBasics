package com.repl.it;

import java.util.ArrayList;
import java.util.Iterator;

public class ReplIt185 {

	public static void main(String[] args) {
		
		ArrayList <Boolean>listA= new ArrayList<>();
		
		listA.add(true);
		listA.add(false);
		listA.add(false);
		
		ArrayList <Boolean> listB= new ArrayList<>();
		
		listB.addAll(listA);
		
		Iterator <Boolean> it= listB.iterator();
		
		while (it.hasNext()) {
			boolean flag= it.next();
			System.out.println(flag);
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
