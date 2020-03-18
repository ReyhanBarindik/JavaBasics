package com.syntax.class09;

public class ArrayTask02 {

	public static void main(String[] args) {
		// Create an array of names and store all names of your group. Then print your name from that array. (use 2 different ways of creating an array).
		//1.Way
        String [] names= {"Ayse","Ali","Ahmet","Mehmet","Reyhan","Tuba","Zeynep"};
        System.out.println(names[4]);
        
        //2.Way
        String []names1= new String[7];
        
        names1[0]="Ayse";
        names1[1]="Ali";
        names1[2]="Ahmet";
        names1[3]="Mehmet";
        names1[4]="Reyhan";
        names1[5]="Tuba";
        names1[6]="Zeynep";
		
		System.out.println(names1[4]);
		
		
		
		
		
		
		

	}

}
