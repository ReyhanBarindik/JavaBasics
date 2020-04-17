package com.syntax.class27;

public abstract class Food {

	public abstract void taste();

	public abstract void cuisine();

	public abstract void serve();

}

class Hamburger extends Food {

	@Override
	public void taste() {
		System.out.println("Hamberger tastes salty and seasoned");

	}

	@Override
	public void cuisine() {
		System.out.println("Hamberger is an German's cuisine.");

	}

	@Override
	public void serve() {
		System.out.println("Hamburger serves hot.");

	}
}

class Pizza extends Food {

	@Override
	public void taste() {
		System.out.println("Pizza tastes salty and cheesy");

	}

	@Override
	public void cuisine() {
		System.out.println("Pizza is an Italian's cuisine.");

	}

	@Override
	public void serve() {
		System.out.println("Pizza serves hot.");

	}

}
class Kebab extends Food {

	@Override
	public void taste() {
		System.out.println("Kebab tastes salty and spicy");
		
	}

	@Override
	public void cuisine() {
		System.out.println("Kebab is an Turkish's cuisine");
		
	}

	@Override
	public void serve() {
		System.out.println("Kebab serves hot.");
		
	}
	
}







