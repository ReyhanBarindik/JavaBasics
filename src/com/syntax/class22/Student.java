package com.syntax.class22;

public class Student {

	/*
	 * Create a Class Student that will have 3 subclasses as SyntaxStudent,
	 * CollegeStudent, SchoolStudent.  Define common behavior within parent class
	 * and override some of the methods in child classes Define some methods
	 * specific to child classes Write example of achieving run time polymorphism
	 */

	  void study () {
		  System.out.println("All students study.");
	  }

}

class SyntaxStudent extends Student {
	  @Override
      void study () {
    	  System.out.println("Syntax students study 6 hours.");
      }
	
      void onlineStudy () {
    	  System.out.println("Syntax students study online.");
      }
}

class CollegeStudent extends Student {
	  @Override
	  void study () {
		  System.out.println("College students need to study 5 hours");
	  }
	 void play () {
		 System.out.println("College students play for scholarship.");
	 }
}

class SchoolStudent extends Student {
	@Override
    void study () {
    	System.out.println("School studnts study 2 hours.");
    }
}