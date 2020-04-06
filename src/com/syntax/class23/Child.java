package com.syntax.class23;

public class Child extends Parent  {
	public void method() {
		System.out.println("I am a child public method");
	}

	protected void method1() {
		System.out.println("I am a child protected method");
	}
    void method2 () {
    	System.out.println("I am a child default method");
    }
    private void method3 () {
    	System.out.println("I am a child private method");
    }
}
