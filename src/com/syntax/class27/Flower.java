package com.syntax.class27;

public abstract class Flower {

	

	public String type;

	public Flower(String type) {
		this.type = type;
	}

	public abstract void bloom();
}

class Tulip extends Flower {
	public Tulip(String type) {
		super(type);
	}

	public void bloom() {
		System.out.println(type + " blooms in March.");
	}
}
class Rose extends Flower {
	public Rose (String type) {
		super(type);
	}
	public void bloom () {
		System.out.println(type +" blooms in June.");
	}
}
class Sunflower extends Flower {
	public Sunflower (String type) {
		super (type);
	}
	public void bloom () {
		System.out.println(type+ " blooms in Agust.");
	}
}