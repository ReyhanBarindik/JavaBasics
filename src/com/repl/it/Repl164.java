package com.repl.it;

public class Repl164 {

	 static final double avgElements (int [] a) {
		 double sum=0;
		 double avg=0;
		 for (int i =0; i<a.length; i++) {
			sum=sum+a[i] ;
			
		 }
		 avg=sum/a.length;
		 
		 return avg;
		 
	 }
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		int[] a = {2,7,3,8,4};
		System.out.println(avgElements(a)); //should print 4.8
	}
	
	
}
