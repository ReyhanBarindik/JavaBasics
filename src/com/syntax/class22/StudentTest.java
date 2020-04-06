package com.syntax.class22;

public class StudentTest {

	public static void main(String[] args) {
		
		Student s1 = new Student ();
		s1.study();
        Student s2 = new SyntaxStudent ();
        s2.study();
        SyntaxStudent s3 = new SyntaxStudent ();
        s3.onlineStudy();
        Student s4 = new SchoolStudent ();
        s4.study();
        
	}

}
