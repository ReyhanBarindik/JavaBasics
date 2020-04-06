package com.syntax.class22;

public class CreditCard {
	/*
	 * Create a class CreditCard and define variable balance and interest. Create an
	 * instance method that will calculate interest based on the given balance. 
	 * Create 2 subclasses: Visa and AX. In AX class override method calculate
	 * interest.  Call the method by creating an object of each of the three
	 * classes.
	 */

	

	double calculate(double balance, double interest) {
		balance *= (1 + interest);
		return balance;
	}
}

class Visa extends CreditCard {

	double calculate(double balance, double interest) {
		balance *= (1 + interest);
		return balance;
	}
}
class AX extends CreditCard {
	double calculate(double balance, double interest) {
		balance *= (1 + interest);
		return balance;
	}
	
}