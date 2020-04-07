package com.repl.it;

public class Repl163 {

	
	final String reverse (String s) {
		String reverse="";
		char [] arr = s.toCharArray();
		for (int i=s.length()-1; i>=0; i--) {
			reverse=reverse+arr[i];
		}
		return reverse;
	}
	
	public static void main(String[] args) {
		Repl163 x = new Repl163();
        String newS=x.reverse("hello");
        System.out.println(newS);
	}

}
