package com.syntax.class21;

public class Class1 {

	//Create 1 class with a static method that has 3 overloaded forms.
	//Then call each overloaded method with specific arguments and observe result.
	
	static int method (int a, int b) {
		
		int sum= a+(a*b);
		return sum;
		}
	
    static double method (double a, double b) {
		
		double sum= a+(a*b);
		return sum;
		}
	
    static double method (int a, double b) {
		
		double sum= a+(a*b);
		return sum;
		}
    static double method (double a, int b) {
		
		double sum= a+(a*b);
		return sum;
		}
	
	public static void main(String[] args) {
		Class1 x = new Class1();
        System.out.println(x.method(5, 10));
        System.out.println(x.method(5, 10));
        System.out.println(x.method(5, 10));
        System.out.println(x.method(5, 10));
	}

}
