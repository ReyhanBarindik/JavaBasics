package com.repl.it;

import java.util.ArrayList;
import java.util.Scanner;

public class ReplIt182 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		ArrayList <Integer> nums= new ArrayList<>();
		
		int num1= scan.nextInt();
		int num2= scan.nextInt();
		int num3= scan.nextInt();
		int num4= scan.nextInt();
		int num5= scan.nextInt();
		
		nums.add(num1);
		nums.add(num2);
		nums.add(num3);
		nums.add(num4);
		nums.add(num5);
		
		for (int n :nums) {
			System.out.print(n+" ");
		}
		
		
		
	}

}
