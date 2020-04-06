package com.syntax.class22;

public class Degree {

	/*
	 * Create a class ‘Degree’ having a method ‘getPrerequisite’ that prints “”To
	 * get a degree you need high school diploma”“.  Class ‘Degree’ has 2 subclasses
	 * namely ‘Bachelors’ and Masters’. In Masters class override method
	 * ‘getPrerequisite’. Call the method by creating an object of each of the three
	 * classes.
	 */

	void getPrerequisite() {
		System.out.println("To get a degree you need high school diploma");
	}
}

class Bachelors extends Degree {
	void getPrerequisite() {
		System.out.println("To get Bachelors degree you need high school diploma");
	}

}

class Masters extends Degree {
	void getPrerequisite() {
		System.out.println("To get Master degree you need collage diploma");
	}
}
