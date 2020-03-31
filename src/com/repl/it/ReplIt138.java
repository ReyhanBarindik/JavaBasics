package com.repl.it;

public class ReplIt138 {

	String label;
	double price;
	String category;
	boolean hasExpiration;
	int stock;
	
	
	ReplIt138 (String label, double price, String category, boolean hasExpiration, int stock) {
		this.label=label;
		this.price=price;
		this.category=category;
		this.hasExpiration=hasExpiration;
		this.stock=stock;
		}
	ReplIt138 (String label, double price, int stock) {
		this.label=label;
		this.price=price;
		category="misc";
		hasExpiration=false;
		this.stock=stock;
	}
	ReplIt138 (String label, double price) {
		this.label=label;
		this.price=price;
	    this.stock=0;
		}
	public void display () {
		System.out.println(label+" "+price+" "+category+" "+hasExpiration+" "+stock);
	}
	
	public static void main(String[] args) {
		ReplIt138 obj = new ReplIt138 ("Eggs", 3.0, "Produce", true, 10);
		obj.display();
		ReplIt138 obj1 = new ReplIt138 ("Paper Towels", 2.0, 24);
		obj1.display();
		ReplIt138 obj2 = new ReplIt138 ("Paper Towels", 2.0);
		obj2.display();
	}

}
