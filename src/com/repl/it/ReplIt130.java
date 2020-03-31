package com.repl.it;

public class ReplIt130 {

	
	
	private void method () {
		System.out.println("This is Private Method");
	}
	
	 void method1 () {
		System.out.println("This is Default Method");
	}
	
	 protected void method2 () {
			System.out.println("This is Protected Method");
		}
	 public void method3 () {
			System.out.println("This is Public Method");
		}
	 public static void main(String[] args) {
		ReplIt130 x= new ReplIt130 ();
		x.method();
		x.method1();
		x.method2();
		x.method3();
	}

}
