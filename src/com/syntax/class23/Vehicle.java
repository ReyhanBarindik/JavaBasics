package com.syntax.class23;

public abstract class Vehicle {
	static int totalVehicle;
	String color;
	Vehicle (String color) {
		this.color=color;
		totalVehicle ++;
	}
	
	public static void total () {
		System.out.println("We built "+totalVehicle +" vehicles");
	}
	public void drive() {
		System.out.println("Vehicle drives");
	}
	public void stop () {
		System.out.println("Vehicle stops");
	}
	public abstract void start();
	public abstract void brake();
	
}
abstract class Carr extends Vehicle {
	String carType;
	Carr (String color, String carType ) {
		super (color);
		this.carType=carType;
	}
	public void brake () {
		System.out.println(carType +" have brakes");
	}
}
class Teslaa extends Carr {
	String make;
	Teslaa (String color, String carType, String make) {
		super(color, carType);
		this.make=make;
	}
	public void start () {
		System.out.println(make +" starts remotely");
	}
}
class Toyota extends Carr {
	String make;
	Toyota (String color, String carType, String make) {
		super (color, carType);
		this.make=make;
	}
	public void start () {
		System.out.println(make +" starts keyless");
	}
	public void drive () {
		System.out.println(make +" drives...");
	}
}
abstract class Bus extends Vehicle {
	String carType;
	Bus (String color, String carType) {
		super(color);
		this.carType=carType;
	}
	public void brake() {
		System.out.println(carType+" have air brakes");
	}
	
}
class SchoolBus extends Bus {
	String make;
	SchoolBus (String color, String carType, String make){
		super(color, carType);
		this.make=make;
	}
	public void start () {
		System.out.println(make +" starts more protected way");
	}
	public void drive () {
		System.out.println(make +" drives...");
	}
	public void stop () {
		System.out.println(make +" stops...");
	}
}