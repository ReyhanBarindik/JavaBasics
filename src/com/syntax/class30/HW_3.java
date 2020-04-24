package com.syntax.class30;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HW_3 {

	public static void main(String[] args) {
		//Create a Map that will store Employee name and salary. Write a logic to retrieve an employee who gets the highest salary.
		//Output should be in the below format John Smith=$100000

		Map <String, Integer> employee= new HashMap<>();
		employee.put("Turker", 90000);
		employee.put("Selma", 87000);
		employee.put("Yunus", 98000);
		employee.put("Gulsum", 99000);
		employee.put("Senel", 100000);
		int max=employee.get("Turker");
	    Set <Entry<String, Integer>> entries= employee.entrySet();
	    
	    Iterator <Entry<String,Integer>>it= entries.iterator();
		while (it.hasNext()) {
			Entry<String,Integer> e= it.next();
			if (e.getValue()>max) {
				max=e.getValue();
				System.out.println(e.getKey()+" =$ "+max);
			}
			}	
		
		
		
		
		
	}

}
