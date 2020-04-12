package com.syntax.class26;

public class WrapperClasses {

	public static void main(String[] args) {
		int i=10;
		//i.nothong comes
		Integer num=10;
		num.toString();
		String s=num.toString();
       System.out.println(num.MIN_VALUE);
       
       Byte b= 94;
       System.out.println(b.MIN_VALUE);
       System.out.println(b.MAX_VALUE);
       String s1= b.toString();
       System.out.println(s1);
       
       Boolean bool= true;
       boolean b1= bool;    //Auto unboxing....
       
       
       
       
	}

}
