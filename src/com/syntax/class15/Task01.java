package com.syntax.class15;

public class Task01 {

	        // Create a method createEmail(). 
			// Based on provided users name, lastName and email type, your method should return complete email Address. 
			// Example: johnsnow@gmail.com or johnsnow@yahoo.com*
	  
	String createEmail (String usersName, String lastName, String type) {
		  return usersName + lastName + type ;
	}
	
	
	
	
	public static void main(String[] args) {
		
		Task01 user1 = new Task01 ();
		String myEmail=user1.createEmail("reyhane", "barindik", "@icloud.com");
        System.out.println(myEmail);
		
		
	}

	
}
