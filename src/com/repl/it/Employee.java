package com.repl.it;

public class Employee {
 
	String name;
	String lastName;
	int employeeId;
	String startDate;
	int salary;
	
	Employee () {
		
	}
	Employee (String name, String lastName, int employeeId, String startDate, int salary) {
		this.name=name;
		this.lastName=lastName;
		this.employeeId=employeeId;
		this.startDate=startDate;
		this.salary=salary;
	}
	
	public void print () {
		System.out.println(name+" "+lastName+" "+employeeId+" "+startDate+" "+salary);
	}
	
	public static void main(String[] args) {
		Employee e1 =new Employee ();
		e1.print();
        Employee e2 =new Employee ("Joe","Smith",12345,"01/01/1970",35000);
        e2.print();
	}

}
