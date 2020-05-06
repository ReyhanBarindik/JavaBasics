package com.repl.it;

public class ReplIt209 {

	public static void main(String[] args) {

		try {
			temperatureCheck(30);
		} catch (RuntimeException e) {
			System.out.println(e);

		}

	}

	public static void temperatureCheck(int temp) throws RuntimeException {

		if (temp < 32) {
			throw new RuntimeException("It is freezing");

		}

	}

}
