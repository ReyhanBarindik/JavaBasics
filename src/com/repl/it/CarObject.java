package com.repl.it;

public class CarObject {

	String model;
	double price;
	int quantity;
	
	
	CarObject (String model, double price, int quantity) {
		this.model=model;
		this.price=price;
		this.quantity=quantity;
		
	}
	
    double carStockValue () {
		double total=0;
		total= price* quantity;
		return total;
	}
    void display () {
    	System.out.println(model+" Stock Value "+carStockValue());
    }
	
	
	public static void main(String[] args) {
		CarObject x =new CarObject ("Toyota 2019",250000,10);
		CarObject y= new CarObject ("BMW 2019",65298,10);
		x.display();
        y.display();
        
	}

}
