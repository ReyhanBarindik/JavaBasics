package com.repl.it;

public class EncapsulationDemoTest {

	public static void main(String[] args) {
		EncapsulationDemo x = new EncapsulationDemo ();
		x.setEmpName("Mario");
		x.setEmpAge(32);
		String name = x.getEmpName();
		System.out.println("Employee Name: "+name);
		int age = x.getEmpAge();
		System.out.println("Employee Age: "+age);
		
		
		
	}

}
