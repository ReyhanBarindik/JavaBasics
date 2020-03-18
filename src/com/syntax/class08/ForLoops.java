package com.syntax.class08;

public class ForLoops {

	public static void main(String[] args) {
		
		int sumOdd=0;
		for (int i=1; i<99; i++) {
		if (i%2==1) {
			sumOdd=sumOdd+i;
		}
		}
		System.out.println(sumOdd);
		
		int sumEven=0;
		for (int a=1; a<99; a++) {
			if (a%2==0) {
			sumEven=sumEven+a;
		}
		}
		System.out.println(sumEven);
		
		

	}

}
