package com.repl.it;

public class CarObject {

	String model;
    String quantity;
	double price;
	
	CarObject (String model, String quantity,  double price) {
		this.model=model;
		this.quantity=quantity;
		this.price=price;
		
	}
	
	public int carStockValue  () {
		
		int totalValue=0;
	    for (int i=0; i<carStock.length(); i++) {
	    	totalValue= totalValue+i;
	    }
		return totalValue;
	}
	
	
	public static void main(String[] args) {
		CarObject obj= new CarObject("Toyota 2019","Stock Value" ,2500000.0);
		
       
        
	}

}
