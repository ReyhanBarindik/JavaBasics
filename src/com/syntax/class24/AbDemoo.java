package com.syntax.class24;

public class AbDemoo {

	public static void main(String[] args) {
		MaheshPhone obj = new SureshPhone ();
		obj.call();
		obj.move();
		obj.dance();
        obj.cook();
	}

}
abstract class MaheshPhone {
	public void call () {
		System.out.println("calling ...");            // Definition 
	}
	
	public abstract void move ();
	public abstract void dance();                    // Declaration 
	public abstract void cook ();
	
}
abstract class RameshPhone extends MaheshPhone {
	@Override 
	public void move () {
		System.out.println("moving ...");
	}
}
class SureshPhone extends RameshPhone { // if you definition all features you do not need to change class to abstract class!!!!!
	public void dance () {
		System.out.println("dancing ...");
	}
	public void cook () {
		System.out.println("cooking ...");
	}
}