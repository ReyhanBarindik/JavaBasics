package com.syntax.InterviewQuestions;

public class InterviewQ07 {

	public static void main(String[] args) {
		// Write a java program to find the second largest number in the array? Maximum and minimum number in the array?

		int [] arr = {80, 20, 100, 30, 40, 10, 50, 6};
		
		int maxNum=arr[0];
		
		int minNum=arr[0];
		
	    
		for (int a : arr) {
			if (a>maxNum) {
				maxNum=a;
			} else if (a<minNum) {
				minNum=a;
			}
		}
		int secondLargestNum=minNum;         //initialized ettik. sonra karsilastirma yapacagiz.
		for (int a : arr) {
			if (a>secondLargestNum &&  a != maxNum) {
				secondLargestNum=a;
			}
		}
		
		
		System.out.println("Max num of arr array is "+maxNum);
		System.out.println("Min num of arr array is "+minNum);
		System.out.println("Second largest num of arr array is "+secondLargestNum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
