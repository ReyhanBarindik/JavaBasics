package com.repl.it;

import java.util.HashSet;
import java.util.Set;

public class ReplIt189 {

	public static void main(String[] args) {
		
		
		Set <Integer> nums= new HashSet<>();
		
		nums.add(111);
		nums.add(111);
		nums.add(111);
		nums.add(999);
		nums.add(999);
		nums.add(999);
		
		for (int num :nums) {
			System.out.println(num);
		}
		
		
		
		

	}

}
