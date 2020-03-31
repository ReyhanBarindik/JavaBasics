package com.repl.it;

public class ReplIt136 {
 
	 String schoolName;
	 int batch;
	 String year;
	 String lastDayOfClass;
	 
	 
	 ReplIt136 () {
		 
		 System.out.println(schoolName+" "+ batch+" "+year+" "+lastDayOfClass);
	 }
	 ReplIt136 (String schoolName, int batch, String year, String lastDayOfClass) {
		this.schoolName=schoolName;
		this.batch=batch;
		this.year=year;
		this.lastDayOfClass=lastDayOfClass;
		
		 System.out.println(schoolName+" "+ batch+" "+year+" "+lastDayOfClass); 
	 }
	 
	public static void main(String[] args) {
		ReplIt136 x= new ReplIt136 ();
		ReplIt136 y=new ReplIt136("Syntax",6,"2020","07/30/202");
        
	}

}
