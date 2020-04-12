package GroupHW;

public class ShapeTest {

	public static void main(String[] args) {
		Shape circle= new Circle (3.14, 5);
		double area= circle.calculateArea();
		System.out.println("Area of the Circle : "+area);
		double perim=circle.calculatePerimeter();
		System.out.println("Perimeter of the Circle : "+perim);
		
		Shape square= new Square (10);
		int area2= (int)square.calculateArea();
		System.out.println("Area of the Square : "+area2);
		int perim2=(int)square.calculatePerimeter();
		System.out.println("Perimeter of the Square : "+perim2);
		
		
        
	}

}
