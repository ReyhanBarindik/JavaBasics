package com.syntax.class22;

public class CreditCardTest {

	public static void main(String[] args) {
		CreditCard x = new CreditCard ();
		double cc=x.calculate(10000, 0.2);
        System.out.println("After interest of balance : "+cc);
        Visa y = new Visa ();
		double visa=y.calculate(20000, 0.3);
        System.out.println("After interest of balance with Visa : "+visa);
        AX z = new AX ();
		double ax=z.calculate(50000, 0.5);
        System.out.println("After interest of balance with AX : "+ax);
	}

}
