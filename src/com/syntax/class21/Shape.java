package com.syntax.class21;

public class Shape {
    //Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class. 
	//In circle class create a method to calculate the area of circle. Test your code
	
	 int radius;
	
	Shape (int radius) {
		this.radius=radius;
	}
	
	public static void main(String[] args) {
		Circle x= new Circle(10,3.14);
       System.out.println(x.areaCircle());
	}
}

 class Circle extends Shape {
	 
	 double pi;
	
	Circle (int radius, double pi) {
		super(radius);
		this.pi=pi;
	}
	
	 double areaCircle () {
		 double area=pi*(radius*radius);
		 return area;
	 }
	
	 
 }