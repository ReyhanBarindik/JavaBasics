package com.repl.it;

public class ShoppingStore {

	String item;
	double price;
	int quantity;
	
	ShoppingStore (String item, double price, int quantity) {
		this.item=item;
		this.price=price;
		this.quantity=quantity;
		
	}
	
	double itemTotalPrice () {
		
		double total= price*quantity;
		return total;
	}
	
	void display () {
		System.out.println(item +" Total Value "+itemTotalPrice());
	}
	
	public static void main(String[] args) {
		ShoppingStore x= new ShoppingStore ("Blanket", 0.9998, 100);
		x.display();
        double total= x.itemTotalPrice();
        ShoppingStore y= new ShoppingStore ("Mattress", 43.918, 10);
		y.display();
        double total2= y.itemTotalPrice();
        System.out.println("Your purchased "+(total+total2)+" Today");
        
        
        
        
	}

}
