package com.syntax.class26;

public class Registiration {

	private String email;
	private String userName;
	private String password;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if (email.contains("yahoo")) {
		this.email = email;
		}else {
		System.out.println("Vali email consider to be only yahuu");
		}
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		if (!userName.isEmpty() && userName.length()>6) {
		this.userName = userName;
		}else {
		System.out.println("Valid username should not be empty");
		}
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		if (!password.isEmpty()&& password.length()>6) {
		this.password = password;
	}else if (!password.contains(userName)) {
		this.password=password;
	} else {
		System.out.println("Invalid password");
	}
	
	
	
	
	
	
	
	
	
	
	}	
}
