package com.repl.it;

import java.util.LinkedHashSet;
import java.util.Set;

class Student {
	
	int studentId ;
	String name;
	String lastName;
	
	Student (int studentId, String name, String lastName){
		this.studentId=studentId;
		this.name=name;
		this.lastName=lastName;
	}
	public void display () {
		System.out.println("Student details: "+name+" "+lastName+" with id: "+studentId);
	}
}

public class ReplIt194 {

	public static void main(String[] args) {
		
		Set <Student> student= new LinkedHashSet<>();
		student.add(new Student(101, "Samir","Jawaid"));
		student.add(new Student(102, "Asel","Umurzakova"));
		student.add(new Student(103, "Diego","Juarez"));
		student.add(new Student(104, "Sohil","Aryan"));
		student.add(new Student(105, "Alijon","Nazarov"));
		
		for (Student s : student) {
			s.display();
		}
		
		
		
	}

}
