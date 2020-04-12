package com.syntax.class25;

public interface Drivable {
    //compiler by default adds public static final
	boolean MOVE_FAST = true ;
	//compiler by default adds public abstract 
	void drive ();
	
}
class Cars implements Drivable {
	
	public void drive () {
		System.out.println("Car drives");
		
	}
}