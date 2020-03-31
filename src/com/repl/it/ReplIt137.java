package com.repl.it;

public class ReplIt137 {

	String make;
	String model;
	int numberOfDoors;
	int topSpeed;
	double price;
	
	ReplIt137 (String make,String model, int numberOfDoors, int topSpeed, double price) {
		this.make=make;
		this.model=model;
		this.numberOfDoors=numberOfDoors;
		this.topSpeed=topSpeed;
		this.price=price;
	}
	
	ReplIt137 (String make, String model, int topSpeed, double price) {
		this.make=make;
		this.model=model;
		this.topSpeed=topSpeed;
		this.price=price;
		numberOfDoors=4;
	}
	ReplIt137 (int numberOfDoors, int topSpeed, double price ) {
		
		make="unknown";
		model="unknown";
		this.numberOfDoors=numberOfDoors;
		this.topSpeed=topSpeed;
		this.price=price;
		
	}
	ReplIt137 (String make, String model, int numberOfDoors ) {
		topSpeed=90;
		price=0;
		this.make=make;
		this.model=model;
		this.numberOfDoors=numberOfDoors;
	}
	
	public void  carsDisplay  () {
		System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
	}
	
	
	public static void main(String[] args) {
		ReplIt137 car1= new ReplIt137 ("Toyota", "Prius", 4, 120, 30000.0);
		car1.carsDisplay();
        ReplIt137 car2 =new ReplIt137 ("Toyota", "Prius", 120, 30000.0);
        car2.carsDisplay();
        ReplIt137 car3 =new ReplIt137 (4, 120, 30000.0);
        car3.carsDisplay();
        ReplIt137 car4= new ReplIt137 ("Toyota", "Prius", 4);
        car4.carsDisplay();
	}

}
