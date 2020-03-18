package com.syntax.class10;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		int [] [] numbers= new int [3] [4]; 
		
		int [] [] nums= {{10,20,30,40}, {5,10,15,20} , {1,2,3,4} } ;
		
		String [] [] months= {{"Jan","Feb","Dec"}, {"March","April","May"}, {"Jun","July","Agust"}, {"Sep","Oct","Nov"} };
		
	   for( int i=0; i<months.length; i++) {
		   for (int j=0; j<months[i].length; j++) {
			   
			   System.out.print(months[i][j]+" ");
			   
			}
		    
		    }
	      System.out.println();
	      System.out.println(months.length);
	      
		  int rows=months.length;
		  int firstArray=months[0].length;
		  System.out.println(firstArray);
		  
		
		
		
		
		
		
		
		
		
		
		

	}

}
