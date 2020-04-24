package com.repl.it;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

class Employeee {
	private String FullName;
	private String ssn;
	private double salary;
	
	Employeee (String FullName, String ssn,double salary){
		this.FullName= FullName;
		this.ssn=ssn;
		this.salary=salary;
		
	}
	
	
	public String getFullName() {
		return FullName;
	}
	public String getSsn() {
		return ssn;
	}
	public double getSalary() {
		return salary;
	}
	
}
public class ReplIt195 {

	public static void main(String[] args) {
		
	Set <Employeee> employee= new LinkedHashSet<>();
		
		employee.add(new Employeee("John Doe", "123456789",80000.0));
		employee.add(new Employeee("Jane Smith", "987654321",90000.0));
		employee.add(new Employeee("Jackie Chan", "0",1000000.0));
		
		Iterator <Employeee> it= employee.iterator();
		while (it.hasNext()) {
			Employeee x= it.next();
			String name=x.getFullName();
			System.out.println(name);
			String ssn= x.getSsn();
			System.out.println(ssn);
			double salary= x.getSalary();
			System.out.println(salary);
		}
		

	}

}
