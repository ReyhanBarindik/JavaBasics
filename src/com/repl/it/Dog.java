package com.repl.it;

public class Dog {

	String dogName;
	double dogWeight;
	static String dogBreed="Mutt";
	
	 Dog ( String dogName, double dogWeight) {
		 this.dogName=dogName;
		 this.dogWeight=dogWeight;
		 
		System.out.println(dogName+" "+dogBreed+" "+dogWeight);
		}
	
	public static void main(String[] args) {
		Dog dog1 =new Dog ("Tarzan", 50.0);
		Dog dog2 =new Dog ("Lucy", 10.0);
        
	}

	

}
