package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class HW_4 {

	public static void main(String[] args) {
		//4. Create an arrayList of even numbers from 1 to 50. 
		//Using Iterator remove any number that is divisible by 5 from that arrayList.
		
		ArrayList <Integer>evenNumbers = new ArrayList<>();
		
		for (int i=1; i<50; i+=2) {
			evenNumbers.add(i);
		}
		
		Iterator <Integer>it = evenNumbers.iterator();
		
		while (it.hasNext()) {
			int evennumbers=it.next();
			if (evennumbers%5==0) {
				it.remove();
			}
		}
		
		for (int num : evenNumbers) {
			System.out.println(num);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
