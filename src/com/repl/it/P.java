package com.repl.it;

public class P {
	void hello() {
		System.out.println("method in Parent class");
	}
}

class C1 extends P {
	void hello() {
		System.out.println("method in Child1 class");
	}
}

class C2 extends P {
	void hello() {
		System.out.println("method in Child2 class");
	}
}

class C3 extends P {
	void hello() {
		System.out.println("method in Child3 class");
	}
}