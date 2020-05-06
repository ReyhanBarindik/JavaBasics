package com.syntax.class33;

public class Bayramgul {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3 };

		int a = 10;

		int b = 0;

		try {

			System.out.println(array[4]);

			Object ob = new Double(50);

			Integer i = (Integer) ob;

			System.out.println(a / b);

		} catch (ArrayIndexOutOfBoundsException aob) {
			System.out.println(aob.getMessage());
		} catch (ClassCastException ce) {
			System.out.println(ce.getMessage());
		} catch (ArithmeticException ae) {
			System.out.println(ae.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("__________end of the Program_______");
	}

}
