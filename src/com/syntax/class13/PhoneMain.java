package com.syntax.class13;

public class PhoneMain {

	public static void main(String[] args) {
		
		Phone phone1 = new Phone ();
		
		phone1.make="Iphone";
		phone1.model="Iphone 11";
		phone1.color="Gold";
		phone1.speed= 21.7;
        
		phone1.open();
		phone1.access();
		phone1.call();
		
		
		Phone phone2 =new Phone ();
		
		phone2.make="Android";
		phone2.model="Android 10";
		phone2.color="Black";
		phone2.speed=17.5;
		
		phone2.open();
		phone2.access();
		phone2.call();
		
		Phone phone3= new Phone ();
		phone3.make="Nokia";
		phone3.model="Nokia 9 PureView";
		phone3.speed=7.1;
		
		phone3.open();
		phone3.access();
		phone3.call();
	}
       
	
}
