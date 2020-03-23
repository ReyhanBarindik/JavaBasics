package com.repl.it;

public class ReplIt113 {

	int sumEvenToX (int x) {
		int sum =0;
		for (int i=1; i<=x; i++) {
			if (i%2==0) {
				sum=sum+i;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		ReplIt113 x= new ReplIt113 ();
		int myNum =x.sumEvenToX(5);
		System.out.println(myNum);
		ReplIt113 y= new ReplIt113 ();
		int myNum1 =y.sumEvenToX(8);
		System.out.println(myNum1);

	}

}
