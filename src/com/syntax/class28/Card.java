package com.syntax.class28;

public abstract class Card {
	/*
	 * Create a Card class that will have implemented  and unimplemented methods and
	 * a constructor that will initializes credit card type.  Create 3 subclasses of
	 * a Card card. Create 3 objects of different card and store them into
	 * LinkedList. Using for loop/advanced for loop/ iterator access all methods of
	 * the class.
	 */
	String creditCardType;
	
	Card (String creditCardType){
		this.creditCardType=creditCardType;
	}
	
	public void balance() {
		System.out.println(creditCardType+" has balance.");
	}
	public abstract double getScores (double credit);
}
class AE extends Card {

	AE(String creditCardType) {
		super(creditCardType);
		
	}

	@Override
	public double getScores(double credit) {
		if (credit >1000) {
			return credit*0.2;	
		}
	    return 0;
	}
}
class Visa extends Card {

	Visa(String creditCardType) {
		super(creditCardType);
		
	}

	@Override
	public double getScores(double credit) {
		if (credit >1000) {
			return credit*0.3;
		}
		return 0;
	}
}
class Discover extends Card {

	Discover(String creditCardType) {
		super(creditCardType);
	}

	@Override
	public double getScores(double credit) {
		if (credit >1000) {
			return credit*0.1;
		}
		return 0;
	}
	
	
}




