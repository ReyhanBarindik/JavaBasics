package com.syntax.class23;

public class ComputerTest {

	public static void main(String[] args) {
		 
		
		Computer [] computers = {new Apple("Apple"), new Lenovo("Lenovo"), new HP("HP"),new Dell("Dell")};
		for (Computer ec : computers) {
			ec.display();
			ec.download();
		}
		Apple ec = new Apple ("Apple");
		ec.hasOwnFeatures();
		
	}

}
