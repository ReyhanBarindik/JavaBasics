package com.repl.it;

import java.util.Iterator;
import java.util.LinkedList;

public class ReplIt187 {

	public static void main(String[] args) {
		
		LinkedList <Integer> nums= new LinkedList<>();
		
		nums.add(111);
		nums.add(222);
		nums.add(333);
		nums.add(444);
		nums.add(555);
		nums.add(666);
		
		Iterator <Integer> it= nums.iterator();
		int sum=0;
		while (it.hasNext()) {
			sum= sum+it.next();
			
			
		}
		System.out.println("Result of sum is "+sum);
		
		
		
		
		
		
		
		
		
	}
}
