package com.syntax.class04;

public class NestingElseIf {

	public static void main(String[] args) {
		
	   /*if students completed a quiz we will check for a score 
	    * if score >90  --> great job
	    * if score >80 --> well done
	    * if score >70 --> you could have done better 
	    * if student did not copmleted the quiz --> not good 
	    * please do homework 
	    */

		boolean quizCompleted=true;
		int score = 86;
		
		if (quizCompleted) {
			System.out.println("Please let your score");
			if (score>90) {
				System.out.println("Great Job");
			}else if (score>80) {
				System.out.println("Well Done");
			}else if (score>70) {
				System.out.println("You could have done better");
			}else {
					System.out.println("You failed");
				}
			
			
			
			
			} else {
			System.out.println("Please do homework on time");
		}
		
		
		
		
	}

}
