package com.syntax.class33;

public class TubaException {
	public static void main(String[] args) {
		// try varsa -->either catch(you can have multiple catches) or finally(sadece
		// bir tane finally yazabilirsin)
		int age = 5;
		if (age < 5) {
			try {
				throw new ArithmeticException("age to play more");// kendimiz olustrmusz
			} catch (Exception e) {
				System.out.println("this is a home made exception ");
			} finally {
				System.out.println("this block is executed either-way");
			}
		} else {
			System.out.println("welcome to school");
		}
	}
}
