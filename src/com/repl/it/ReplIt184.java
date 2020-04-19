package com.repl.it;

import java.util.LinkedList;

public class ReplIt184 {

	public static void main(String[] args) {
		
		LinkedList <Integer> fnum= new LinkedList<>();
		
		int a=0;
		int b=1;
		int c;
		fnum.add(a);
		fnum.add(b);
		
		for (int i=0; i<8; i++) {            // 0 1 1 2 3 5 8 13 ......
			c= a+b;                        //   a b c
			a=b;                           //     a b c
			b=c;                         //         a b c
			fnum.add(c);
		}
		
		
		
		for (int f :fnum) {
			System.out.print(f+" ");
		}
		
		
		

	}

}
