package com.syntax.class18;

public class Task1234 {

	//Write a program  that will have 4 different access levels of constructors and create 3 objects of this class: 
	//1 - inside same class; 2 - from outside the class; 3 - from different class inside different package  and observe result.
	
	
	
	 
	 public Task1234 (int a) {
		System.out.println("I am public constructor");
		 
	 }
	 private Task1234 (int a1, int a2) {
		 System.out.println("I am private cons");
	 }
	 protected Task1234 (String s,String s1) {
		 System.out.println("I am protected cons");
	 }
	 
	 
	 
	public static void main(String[] args) {
		Task1234 obj =new Task1234 (5);
		Task1234 obj1 = new Task1234 (5,10);
		Task1234 obj2 = new Task1234 ("Turker", "Gulsum");
		
		
		
	}

}
