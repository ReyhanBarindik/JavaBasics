package com.syntax.class23;

public class CarTest {

	public static void main(String[] args) {
		Car bmw = new BMW("BMW");

		bmw.display();

		bmw.start();

		// bmw.navigate();CE: undefined method in Car
		System.out.println("----------------------------");
		Car tesla = new Tesla("Tesla");

		Car merc = new Mercedes("Mercedes");

		Car honda = new Honda("Honda");

		Car[] cars = { bmw, tesla, merc, honda };

		for (Car c : cars) {
			c.display();
			c.start();
		}
		System.out.println("----------------------------");

		for (int i = 0; i < cars.length; i++) {

			cars[i].start();

			cars[i].display();
		}
	}
}
