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
	static int numberOfStudents=0;
	
	
	public static void main(String[] args) {
		Students s1=new Students();
		Students s2=new Students();
        Students s3=new Students();
        
        
        s1.studentName="Reyhan";
        s1.studentID="12345";
        s1.numberOfStudents++;
        
        s2.studentName="Gulsum";
        s2.studentID="123456";
        s2.numberOfStudents++;
        
       
        s3.studentName="Selma";
        s3.studentID="1234567";
        s3.numberOfStudents++;
        
       
        System.out.println("Total number of Students : " + numberOfStudents );
        
        
        
        
        
        
	}

}
