package com.syntax.class07;
import java.util.Scanner;
public class Lottery {

	public static void main(String[] args) {
		Scanner scan;
		int number=1;
		int luckyNumber=17;
		scan=new Scanner(System.in);
		
		do {
			System.out.println("Please enter any number from 1 to 20") ;
			number=scan.nextInt();
		} 
		while (number!=luckyNumber) ;
			System.out.println("You got it! Congrats!");
		
		
		
		
		
	}

}
