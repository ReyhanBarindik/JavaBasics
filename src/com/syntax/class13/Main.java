package com.syntax.class13;

public class Main {

	public static void main(String[] args) {
		
     ObjectClass student1= new ObjectClass ("Reyhan","Asel",90) ;
	 
     System.out.println(student1.studentName);
     System.out.println(student1.instructor);
     System.out.println(student1.grade);
     
     
	ObjectClass student2= new ObjectClass ("Gulsum","Sohil",100);
	   
	System.out.println(student2.studentName);
	System.out.println(student2.instructor);
	System.out.println(student2.grade);
	
	}

}
