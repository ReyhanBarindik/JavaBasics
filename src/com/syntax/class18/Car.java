package com.syntax.class18;

public class Car {

	String make, model, color ;
	int year;
	
	
	
	public Car (String carMake, String carColor, String carModel, int carYear) {
		this.make=carMake;
		this.model=carModel;
		this.color=carColor;
		year=carYear;
	}
	
	public void printDetails() {
		System.out.println("I have "+year+" "+make+" "+model+" in "+color+ " color.");
	}
	//Car (String a) {
		//System.out.println("I am a constructor with 1 String value= "+a);
	//}
	
	
	 public static void main(String[] args) {
		Car car1 =new Car("Toyota", "White", "Camry", 2017 );
		car1.printDetails();
        //System.out.println(car1.make);
        
      
        
	}

}
