package com.syntax.class21;

public class HW_4 {

	
	//Create 1 class with a private method that has 3 overloaded forms. 
	//Then call each overloaded method with specific arguments and observe result.
	
	private void display (String name, String lastName) {
		System.out.println(name+" "+lastName);
	}
	private void display (String name, String lastName ,String nickName) {
		System.out.println(name+" "+lastName+" "+nickName);
	}
	private void display (String name, String lastName ,String nickName, String middleName) {
		System.out.println(name+" "+lastName+" "+nickName+" "+middleName);
	}
	
	
	
	public static void main(String[] args) {
		HW_4 p1 = new HW_4 ();
		p1.display("Reyhan", "Barindik");
        p1.display("Reyhan", "Barindik", "Maria");
        p1.display("Reyhan", "Barindik", "Maria","Tugba");
	}

}
