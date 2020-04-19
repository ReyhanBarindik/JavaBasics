package com.repl.it;

import java.util.Iterator;
import java.util.LinkedList;

public class ReplIt183 {

	public static void main(String[] args) {
		
		
		LinkedList <Integer> nums= new LinkedList<>();
		
		for (int i=50; i<100; i++) {
			nums.add(i);
		}
		Iterator <Integer> it= nums.iterator();
		
		while (it.hasNext()) {
			if (it.next()%3!=0) {
				it.remove();
			}
		}
		System.out.println(nums);
		
		
		
	}

}
