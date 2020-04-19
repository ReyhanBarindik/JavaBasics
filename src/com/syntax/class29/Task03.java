package com.syntax.class29;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Task03 {

	private String name;
	private int studentID;

	Task03(String name, int studentID) {
		this.name = name;
		this.studentID = studentID;

	}

	public String getName() {
		return name;
	}

	public int getStudentID() {
		return studentID;
	}

	public static void main(String[] args) {
		/*
		 * Create a Set collection that will hold Objects of Student Type. In this set
		 * we do not care about the insertion order. Each student object should have
		 * name and studentID. Display name of each student.
		 */

		Set <Task03> student= new HashSet<>();
		
		student.add(new Task03("Reyhan",5));
		student.add(new Task03("Gulsum",7));
		student.add(new Task03("Selma",9));
		student.add(new Task03("Yunus",10));
		
		Iterator <Task03> it= student.iterator();
		
		while (it.hasNext()) {
			String x= it.next().getName();
			System.out.println(x);
		}
		
		
		
		
	}
}