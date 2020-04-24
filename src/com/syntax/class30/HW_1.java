package com.syntax.class30;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * Create a Person class with following private fields: name, lastName, age,
 * salary.  Variables should be initialized through constructor. Inside the
 * class also create a method to print user details. In Test Class create a Map
 * that will store key in ascending order. In that map store personId and a
 * Person Object. Print each object details.
 * 
 */
class Person {
	String name;
	String lastName;
	int age;
	int salary;
	
	
	Person (String name, String lastName, int age, int salary){
		this.name=name;
		this.lastName=lastName;
		this.age=age;
		this.salary=salary;
	}
	public void display () {
		System.out.println("Name: "+name +" Lastname: "+lastName+" Age: "+age+" Salary: "+salary);
	}
	
}
public class HW_1 {

	public static void main(String[] args) {
     Map <Integer, Person> user= new HashMap<>();
	 user.put(12345, new Person("Gulsum","Inci",35,106000));
	 user.put(12333, new Person("Senel","Duman",25,105000));	
	 user.put(12355, new Person("Yunus","Yakut",32,114000));
	 user.put(12377, new Person("Selma","Kara",29,106000));
	 user.put(12399, new Person("Turker","Dogru",34,107000));
	 
	 Set<Entry<Integer, Person>> entries= user.entrySet();
	 for (Entry<Integer, Person> entry : entries) {
		 entry.getValue().display();
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
		
	}

}
