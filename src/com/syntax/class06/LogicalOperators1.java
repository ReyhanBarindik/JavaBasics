package com.syntax.class06;
import java.util.Scanner;
public class LogicalOperators1 {

	public static void main(String[] args) {
		Scanner scan;
		int hour=30;
		String timeOfDay;
		scan=new Scanner(System.in);
		System.out.println("What time is it?");
		hour=scan.nextInt();
		
		
		if (hour>=1 && hour<=11 ) {
			timeOfDay="Morning";
			
		}else if (hour>=12 && hour<=15) {
			timeOfDay="Afternoon";
			
		}else if (hour>=16 && hour<=20) {
			timeOfDay="Evening";
			
		}else if (hour>=21 && hour<=24) {
			timeOfDay="Night";
			
		}else if (hour>24) {
			timeOfDay="Invalid hour";
			
		} else {
			timeOfDay="Unknow";
		}
		//if time of the day is not unknow --> only then I want to see this message 
		
		if (!timeOfDay.contentEquals("Unknow")) {
			System.out.println("Right now is "+timeOfDay);
		}
		
		
		
		
		
		

	}

}
