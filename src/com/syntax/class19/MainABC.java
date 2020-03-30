package com.syntax.class19;

public class MainABC {

	public static void main(String[] args) {
		
		
	ClassB person = new ClassB ();	
		
		person.age=30;
		person.almondEye=true;
		person.arms=2;
		person.eyesColor="Brown";
		person.hairColor="Brown";
		person.name="Leyla";
		person.lastName="Idiz";
		person.almondEye=true;
		//person.nickName="Leyl";
		//person.fuzzyHair=true;
		ClassA.eat();
		ClassA.talk();
		ClassA.walk();
		ClassC.leftHanded();
		ClassC.mathematicalIntelligence();
		ClassC.leftHanded();
		
	ClassC person2 =new ClassC();	
    person2.nickName="B";
    person2.religious="Muslim";
    person2.fuzzyHair=true;
    System.out.println(person2.nickName+" has fuzzy hair ? "+person2.fuzzyHair);
    System.out.println(person.name+" has "+person.eyesColor+" eyes.");
	}

}
