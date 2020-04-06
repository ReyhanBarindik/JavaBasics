package com.syntax.class23;

public class Computer {
    
	String make;
	public Computer (String make) {
		this.make=make;
	}
	public void display () {
		System.out.println("I have "+make);
	}
	public void download () {
		System.out.println(make +" can download. ");
	}
}

class Apple extends Computer{
	public Apple (String make) {
		super (make);
	}
	public void download () {
		System.out.println(make +" can download. ");
	}
	public void hasOwnFeatures () {
		System.out.println(make +" has own features");
	}
}
class Lenovo extends Computer {
	 public Lenovo (String make)  {
		 super (make);
	}
	 public void download () {
			System.out.println(make +" can download. ");
		}
}
class HP extends Computer {
	public HP (String make) {
		super (make);
	}
	public void download () {
		System.out.println(make +" can download. ");
	}
}
class Dell extends Computer {
	public Dell (String make) {
		super (make);
	}
	public void download () {
		System.out.println(make +" can download. ");
	}
}