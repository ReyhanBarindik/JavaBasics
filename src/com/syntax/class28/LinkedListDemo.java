package com.syntax.class28;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		
		LinkedList <String> llist = new LinkedList<>();
		
		llist.add("Yunus");
		llist.add(0, "Reyhan");
		llist.add("Pavel");
		llist.add("Farid");
		llist.add("Farid");
		llist.add("Farid");
		
		
		System.out.println("_____Advanced For Loop____");
		for (String l : llist) {
			System.out.println(l);
			
		}
		System.out.println("________For Loop_______");
		for (int i=0; i<llist.size(); i++) {
			System.out.println(llist.get(i));
		}
		System.out.println("_________Iterator________");
		Iterator <String> it = llist.iterator();
		while (it.hasNext()) {
			String element= it.next();
			System.out.println(element);
		}
		
		
		
		
	}

}
