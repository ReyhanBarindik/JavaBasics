package com.syntax.class24;

public abstract class PhoneAb {
	// implemented methods
	public void call() {
		System.out.println("Phone can make a call");
	}

	public void text() {
		System.out.println("Phone can send text");
	}

	// unimplemented methods = undefined methods = abstract methods
	public abstract void takePicture();

	public abstract void playMusic();

}

class IphoneAb extends PhoneAb {
    @Override
	public void takePicture() {
        System.out.println("Iphone takes pictures");
	}
    @Override
	public void playMusic() {
        System.out.println("Iphones play music apple store");
	}
}
