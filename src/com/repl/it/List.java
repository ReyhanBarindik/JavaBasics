package com.repl.it;

import java.util.ArrayList;

public class List {

	public static void main (String [] args) {
	ArrayList <Integer> objects = new ArrayList <>();
	
	objects.add(111);
	objects.add(222);
	objects.add(333);
	objects.add(444);
	objects.add(555);
	objects.add(666);
	
	int a= objects.get(0);
	int b= objects.get(2);
	int c= objects.get(4);
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	
	
	
	
	}	
}
