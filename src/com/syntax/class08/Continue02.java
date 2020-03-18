package com.syntax.class08;

public class Continue02 {

	public static void main(String[] args) {
    //1 to 100 except 35 to 55
		
	for(int i=1; i<100; i++) {
		if(i>=35 && i<=55) 
			continue; 
		
		System.out.println(i);
	}


	}

}
