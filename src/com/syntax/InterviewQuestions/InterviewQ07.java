package com.syntax.InterviewQuestions;

public class InterviewQ07 {

	public static void main(String[] args) {
		// Write a java program to find the second largest number in the array? Maximum and minimum number in the array?

		int [] arr = {100, 20, 70, 30, 40, 10, 50, 6};
		
		int maxNum=arr[0];
		int secondLargestNum=arr[0];
		int minNum=arr[0];
		
		for (int i=0; i<arr.length; i++) {
			if (arr[i]>maxNum) {
				secondLargestNum= maxNum;                 // why we equals them ??? When I am delete it, nothing change. 
				maxNum=arr[i];
				
			}else if (arr[i]> secondLargestNum) {
				secondLargestNum=arr[i];
				
			} else if (arr[i]<minNum) {
				minNum=arr[i];
			}
			
		}
		System.out.println("Max num of arr array is "+maxNum);
		System.out.println("Min num of arr array is "+minNum);
		System.out.println("Second largest num of arr array is "+secondLargestNum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
