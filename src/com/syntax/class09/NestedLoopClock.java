package com.syntax.class09;

public class NestedLoopClock {

	public static void main(String[] args) {
		
		for(int h=0; h<13; h++) {
			
			for(int m=0; m<60; m++) {
				
				if (m<10) {
				System.out.println(h+":"+"0"+m);
				continue;
				}
				
				System.out.println(h+":"+m);
				
				
			}
			
		}
		
		
		
		
		
		
		
		
		
		

	}

}
