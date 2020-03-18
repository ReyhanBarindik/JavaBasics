package com.syntax.class03;

public class Class03 {

	public static void main(String[] args) {
		int num=100;
		num=num+1000;
		
		System.out.println(num);
		
		int mod=num%2;
		
		System.out.println(mod);
		
		
		
		int a=10;
		int b=20;
		String x="Hello";
		String y="Bye";
		//ctrl+space -->autocomplete 
		System.out.println(a+b+x+y);
		System.out.println(a+x+b+y);
		System.out.println(x+y+a+b);
		
		System.out.println(x+y+(a+b));
		System.out.println(a+""+b+x+y);
		

	}

}
