package com.repl.it;

public class PersonTest {

	public static void main(String[] args) {
		Person obj = new Person ("John", "Doe", 10, 25, 1900, "123-45-6789");
        String name=obj.getFirstname();
        System.out.println(name);
        String lastname=obj.getLastname();
        System.out.println(lastname);
        String com=obj.formatBirthday();
        System.out.println(com);
        String ssn=obj.getSsn();
        System.out.println(ssn);
	}

}
