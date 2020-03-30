package com.syntax.class18;

public class USA {

	String state;
	String stateCapital;
	
	public void display () {
		System.out.println(state +" and it is capital is "+ stateCapital);
	}
	
	public USA (String usaState, String usaStateCapital) {
		
		//state=usaState;
		//stateCapital=usaStateCapital;
		usaState= state;
		usaStateCapital=stateCapital;
		
	}
	
	
	public static void main(String[] args) {
		USA usa = new USA ("Virginia", "Richmond");
		usa.display();

	}

}
