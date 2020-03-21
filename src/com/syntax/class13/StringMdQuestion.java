package com.syntax.class13;
import java.util.Scanner; 
public class StringMdQuestion {

	public static void main(String[] args) {
		// how to print one character at a time on one line using a METHOD

        // input : rrreeyyhhaannn    output: reyhan
		
		Scanner scan;
		String str;
		
		scan=new Scanner (System.in);
		str=scan.nextLine();
		
		char [] arr = str.toCharArray();
		
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr.length; j++) {
				if (i == j && str.charAt(i) != str.charAt(j)) {
					System.out.println(i);
				}
				
				
			}
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
     








    /*String s1= "How are How";
int i = 0;
outer: for(;i<s1.length(); i++)
{
    for(int j=0;j<s1.length(); j++)
    {
      if (i!=j && s1.charAt(i) == s1.charAt(j))
       continue outer;
    }
    break;
}
if(i<s1.length()) System.out.println(s1.charAt(i));  */