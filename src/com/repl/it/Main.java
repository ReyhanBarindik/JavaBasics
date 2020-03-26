package com.repl.it;

public class Main {

	static String makeThreeSubstr (String word, int startIndex, int endIndex)
	{
    String sum =word.substring(startIndex, endIndex);
	return sum+sum+sum;
	}
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(makeThreeSubstr("hello",0,2)); //should be hehehe
		System.out.println(makeThreeSubstr("shenanigans",3,7)); //should be naninaninani
	}
}
