package com.syntax.class15;

public class CreatingMethods {

	   char marks (int grade) {
		   
		  char value;
		  if (grade>=90) {
			  value='A';
			  
		  }else if (grade<90 && grade>=80) {
			  value='B';
					  
		  }else if (grade<80 && grade>=70) {
			  value='C';
		  }else {
			  value='F';
		  }
		  return value;
	  }
	
	
	   public static void main(String[] args) {
		CreatingMethods num1 = new CreatingMethods ();
        char myValue=num1.marks(90);
        
        System.out.println(num1.marks(90));
        
        // if grade is A or B --> good job , otherwise --> study more 
        
        if (myValue == 'A' || myValue == 'B')  {                // you stored value you can use now 
        	System.out.println("Good Job!");
        } else {
        	System.out.println("Studey more!");
        }
        
	}

}
