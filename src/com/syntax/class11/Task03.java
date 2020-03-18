package com.syntax.class11;
import java.util.Scanner;
public class Task03 {

	public static void main(String[] args) {
		
		Scanner scan;
		String username;
		String password;
		String confirmedPassword;
		
		scan=new Scanner (System.in);
		System.out.println("Please enter your username");
		username=scan.nextLine();
		System.out.println("Please enter your password");
		password=scan.nextLine();
		System.out.println("What is confirmedPassword?");
		confirmedPassword=scan.nextLine();
		
		if (!(username.isEmpty()) && !(password.isEmpty())) {
			
			if (password.length()>=8) {
				
				if (!(password.contains(username))) {
					 
					if (password.equals(confirmedPassword)) {
						System.out.println("Your username and password has been created");
					}else {
						System.out.println("Password do not match");
					}
					
				} else {
					System.out.println("Password cannot be contain username"); 
				}
				
				
			} else {
				System.out.println("Password is too short");
			}
			
			
			} else {
			System.out.println("Username and Password cannot be empty");
		    }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
