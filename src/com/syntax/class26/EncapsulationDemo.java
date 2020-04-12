package com.syntax.class26;

public class EncapsulationDemo {

	public static void main(String[] args) {
		
		Emp e1 = new Emp ();
		//e1.empID=5;
		e1.setEmpName("");
		e1.setEmpID(12345678);
        String newName= e1.getEmpName();
		System.out.println(newName);
		int newID=e1.getEmpID();
		System.out.println(newID);
	}

}
class Emp  {
	
	private int empID;
	private String empName;
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		if (empID<100000) {
			this.empID = empID;
		} else {
			System.out.println("Employee ID should be under 100000");
		}
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		if (empName.isEmpty()) {
			System.out.println("Employee Name should not be empty");
		} else {
		this.empName = empName;
		}
	}
	
	
	
	
}