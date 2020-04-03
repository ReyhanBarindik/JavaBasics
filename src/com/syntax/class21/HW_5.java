package com.syntax.class21;

public class HW_5 {

	/*create 1 class in which create a methods that will calculate the area (volume) of 
	Rectangle
	Square
	Box

	Use separate class to test your code
	*/
	
	
	static double area (double length, double height) {
		double areaRectangle=length*height;
		return areaRectangle;
	}
	
	static double area (double length) {
		double areaSquare=length*length;
		return areaSquare;
	}
	static double area (double length,double width, double height) {
		double areaBox=2*(length*width+length*height+width*height);
		return areaBox;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
