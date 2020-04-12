package com.syntax.class25;

public interface Trustable {
     
	void trust();
}
interface Bank extends Trustable {
	void depositMoney();
	void withDraw();
}
class Finance {
	void financialTransactions () {
		System.out.println("Finance ...");
	}
}
class PNC extends Finance implements Bank {

	@Override
	public void trust() {
		System.out.println("PNC is trustable Bank");
		
	}

	@Override
	public void depositMoney() {
		System.out.println("You deposit your Money in PNC");
		
	}

	@Override
	public void withDraw() {
		System.out.println("PNC draws...");
		
	}
	
}
class BOA extends Finance implements Bank, CreditUnion {

	@Override
	public void trust() {
		System.out.println("BOA is trustable Bank");
		
	}

	@Override
	public void depositMoney() {
		System.out.println("You deposit your Money in BOA");
		
	}

	@Override
	public void withDraw() {
		System.out.println("BOA draws...");
		
	}

	@Override
	public void giveCredit() {
		System.out.println("BOA gives credit...");
		
	}
	
}
interface CreditUnion {
	void giveCredit ();
}