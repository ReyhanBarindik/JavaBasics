package com.syntax.class10;

public class Question {

	public static void main(String[] args) {
		//how to print average of add numbers in given array int arr[] = {12,22,33,1,-2,3,8,11,9}
		
		
		int arr[]={12,22,33,1,-2,3,8,11,9} ;
		int sum=0;
		int avrg=0;
		int odd=0;
		
		for( int a: arr ){ 
        if(a%2==1){  
        odd++;
        
        sum=sum+a;
        avrg=sum/odd;
       
		}  
        }  
		 System.out.println(avrg);  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
