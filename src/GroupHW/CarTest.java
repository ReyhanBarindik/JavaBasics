package GroupHW;

public class CarTest {

	public static void main(String[] args) {
		Car sedan= new Sedan(80000,"Blue",25);
		Car truck= new Truck(99000,"Red",2400);
		
		double sedanPrice=sedan.calculateSalePrice();
		System.out.println("Price of Sedan : "+sedanPrice+" $");
		double truckPrice=truck.calculateSalePrice();
		System.out.println("Price of Truck : "+truckPrice+" $");
		

	}

}
