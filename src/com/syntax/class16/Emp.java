package com.syntax.class16;

public class Emp {

	int eID;
	double salary;
	static String CEO;
	
	
	public void show () {
		System.out.println("eID : "+eID+" salary "+salary+" CEO : "+CEO);
	}
	
	
	public static void main(String[] args) {
		
		Emp e1= new Emp();
		e1.eID=12345;
		e1.salary=80000;
		Emp.CEO="Alijon";
		
		Emp e3= new Emp();
		e3.eID=98765;
		e3.salary=87000;
		Emp.CEO="Usman";
		
        Emp e2= new Emp();
        e2.eID=54321;
        e2.salary=90000;
        Emp.CEO="Sumair";
        
        e1.show();
        e2.show();
        e3.show();
	}

}
