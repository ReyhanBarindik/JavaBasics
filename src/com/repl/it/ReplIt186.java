package com.repl.it;


import java.util.LinkedList;

public class ReplIt186 {

	public static void main(String[] args) {

		LinkedList<Integer> pnum = new LinkedList<>();
        
		for (int i =2; i<100; i++) {
			if (prime(i)) {
				pnum.add(i);
			}
		}
		System.out.println(pnum);
		
		
		
		
		
	}

	public static boolean prime(int num) {

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
