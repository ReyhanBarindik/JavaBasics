package com.repl.it;

public class Mainn implements Functions{
      
	double firstNumber = 100.00; 
	double secondNumber = 20.00;
	
	public static void main(String[] args) {
         Mainn x = new Mainn ();
         double A=x.adding(100, 20);
         x.display(A);
         double B=x.subtracting(100, 20);
         x.display(B);
         double C=x.multiply(100, 20);
         x.display(C);
         double D=x.dividing(100, 20);
         x.display(D);
	}

	@Override
	public void display(double result) {
		System.out.println("Result is ::: "+result);
		
	}

	@Override
	public double adding(double firstNumber, double secondNumber) {
		double result=firstNumber+secondNumber;
		return result;
	}

	@Override
	public double subtracting(double firstNumber, double secondNumber) {
		double result=firstNumber-secondNumber;
		return result;
	}

	@Override
	public double multiply(double firstNumber, double secondNumber) {
		double result=firstNumber*secondNumber;
		return result;
	}

	@Override
	public double dividing(double firstNumber, double secondNumber) {
		double result=firstNumber/secondNumber;
		return result;
	}

}

interface Outputs {
	public void display(double result);
}

interface Functions extends Outputs {
	double adding(double firstNumber, double secondNumber);
    double subtracting(double firstNumber, double secondNumber);
    double multiply(double firstNumber, double secondNumber);
    double dividing(double firstNumber, double secondNumber);
}