package com.repl.it;

public class AccountTest {

	public static void main(String[] args) {
		Account x= new Account ();
		x.setAcc_no("7560504000");
		x.setName("Sumair");
		x.setEmail("sumair@syntax.com");
		x.setAmount(50000.0);
        String a=x.getAcc_no();
        String b=x.getName();
        String c=x.getEmail();
        double d=x.getAmount();
        
        System.out.println(a+" "+b+" "+c+" "+d);
        
        
	}

}
