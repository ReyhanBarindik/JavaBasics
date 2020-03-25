package com.syntax.class16;

public class Students {

	/*Create a Class called Students
      Create three  variables  studentName , studentID  and  numberOfStudents
      Create three objects of the Students Class 
      Set the value for  studentName , studentID and increment  the numberOfStudents for each object
      Print out  total number of students
	*/
	String studentName;
	String studentID;
	int numberOfStudents;
	int sum;
	
	public static void main(String[] args) {
		Students s1=new Students();
		Students s2=new Students();
        Students s3=new Students();
        
        s1.numberOfStudents=1;
        s1.studentName="Reyhan";
        s1.studentID="12345";
        s2.numberOfStudents=2;
        s2.studentName="Gulsum";
        s2.studentID="123456";
        s3.numberOfStudents=3;
        s3.studentName="Selma";
        s3.studentID="1234567";
        
        int sum=s1.numberOfStudents+s2.numberOfStudents+s3.numberOfStudents;
        System.out.println(sum);
        
        
        
        
        
        
	}

}
