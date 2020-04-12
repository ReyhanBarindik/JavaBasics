package com.syntax.class25;

public class Student {
    
	String name;
	Student (String name) {
		this.name=name;
	}
	
	public void printName() {
		System.out.println("She is a student "+ name);
	}
	
	public static void main(String[] args) {
		
		Student s1 = new MathStudent ("Nuran", 25);
		s1.printName();
		((MathStudent) s1).computerSkills();
		int x=((MathStudent) s1).codeInJava(3,5);
		System.out.println(x);
        MathStudent s2 = new MathStudent ("Nurefsan",27);
        s2.printName();
        s2.printAge();
        s2.computerSkills();
        int y=s2.codeInJava(7, 8);
        System.out.println(y);
     }
}
class MathStudent extends Student implements ComputerSkills  {
	int age;
	MathStudent (String name, int age) {
		super(name);
		this.age=age;
	}
	public void printName() {
		System.out.println(name +" is a Math student");
	}
	public void printAge() {
		System.out.println(name +" is "+age+" years old");
	}
	public void computerSkills () {
		System.out.println(name+" has computer skills");
	}
	public int codeInJava (int a, int b) {
		return (a+b)*(a-b);
	}
	
}