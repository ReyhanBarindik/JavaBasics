package com.syntax.class08;

public class Continue1 {

	public static void main(String[] args) {
		for(int i=1; i<21; i++) {
			if(i==5 || i==6 || i==7) {
				continue;
			}
			System.out.println(i);
		}
			
	}

}
