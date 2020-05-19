package com.syntax.class34;

class BalanceException extends RuntimeException {
	public BalanceException(String message) {
		super(message);
	}
}

public class ThrowKeyword {

	public static void main(String[] args) {

		NullPointerException npe = new NullPointerException();

		throw npe;
		// throwException();
		//withThrow(2000, 2500);

	}

	// create a withdraw method for balance and amount

	public static void withThrow(int balance, int amount) {
		if (amount > balance) {
			throw new BalanceException("Your balance is too low"); // --> we create class
		} // costomized exception
	}

	public static void throwException() {
		throw new ArithmeticException();
	}

	
	
}
