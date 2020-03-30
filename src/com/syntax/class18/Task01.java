package com.syntax.class18;

public class Task01 {

	//Write a program that will have a constructor: one with parameters and second without any parameters. 
	//Create a separate Test class where you will execute both of the constructors.
	
	//Write a java program of Class Students that takes students name and 3 subject grades. Inside your class also have a method to Calculate Average Grade. 
	//Test Student class for 5 different students with different marks. 
	//Your program should print an average mark of each students name.
	
	
	
	String studentsName;
	double gradeMath;
	double gradeBiology;
	double gradePhysics;
	
	double avarageGrade () {
			double avarage;
			avarage= (gradeMath + gradeBiology + gradePhysics) /3;
			return avarage;
		}
	private Task01 (String s, int m, int b, int p ) {
		studentsName=s;
		gradeMath=m;
		gradeBiology=b;
		gradePhysics=p;
	    }
	public static void main(String[] args) {
		Task01 s1 = new Task01 ("Reyhan", 90, 80, 70);
		double avrg=s1.avarageGrade();
		System.out.println("Reyhan : "+ avrg);
		Task01 s2 = new Task01 ("Yunus", 100, 100, 100);
		double avrg2=s2.avarageGrade();
		System.out.println("Yunus : " + avrg2);
		Task01 s3 = new Task01 ("Gulsum", 100, 100, 98);
		double avrg3=s3.avarageGrade();
		System.out.println("Gulsum : "+avrg3);
		Task01 s4 = new Task01 ("Selma", 100, 100, 97);
		double avrg4=s4.avarageGrade();
		System.out.println("Selma : "+avrg4);
		Task01 s5 = new Task01 ("Turker", 100, 100, 90);
		double avrg5=s5.avarageGrade();
		System.out.println("Turker : "+avrg5);
		
		// Task s1 = new Task ("R" ,8 ,9 ,0)
		//System.out.println(s1.avarageGrade());
	}

}
