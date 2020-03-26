package com.syntax.class17;

public class Task3_1 {

	public static void main(String[] args) {
		System.out.println(Task3_1.vowels("reyhan"));

	}

	private static String vowels (String st) {
		String vowel="";
		String [] v=st.split("");
		for (int i=0; i<v.length; i++) {
			if (v[i].equals("e") || v[i].equals("u") || v[i].equals("a") || v[i].equals("i") ){
				vowel+=v[i];
			}
		}
		return vowel;
	}
	
	
	
	
	
	
}
