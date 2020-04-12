package GroupHW;

public interface Shape {
     //Create an Interface ‘Shape’ with undefined methods as calculateArea and calculatePerimeter. 
	 //Create 2 classes Circle & Square that implements functionality defined in the Shape Interface. Test your code.
	
	
	public double calculateArea ();
	public double calculatePerimeter();
	
}
class Circle implements Shape {
    double pi;
    int r;
    Circle (double pi, int r) {
    	this.pi=pi;
    	this.r=r;
    }
	@Override
	public double calculateArea() {
		double A=pi*r*r;
		return A;
		
	}

	@Override
	public double calculatePerimeter() {
		double C=2*pi*r;
		return C;
		
	}
	
}
class Square implements Shape {
    int side;
    Square (int side) {
    	this.side=side;
    }
	@Override
	public double calculateArea() {
		int A=side*side;
		return A;
	}

	@Override
	public double calculatePerimeter() {
		int P=4*side;
		return P;
	}
	
}