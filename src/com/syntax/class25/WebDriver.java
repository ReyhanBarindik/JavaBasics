package com.syntax.class25;

interface TakesScreenshot {
	String  fileExtension=".png";
	void takePicture ();
	
	//features below were added from java
	static void takeSelfie () {
		System.out.println("I can take Selfie");
	}
	default void takePanoromaPic () {
		System.out.println("I can take panoroma pictures");
	}
	
	
}
public interface WebDriver {
     //Create a WebDriver Interface that will have the following unimplemented behaviour: openBrowser(), closeBrowser(), maximizeWindow(), findElement(). 
	 //Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
	public void openBrowser ();
	public void closeBrowser ();
	public void maximizeWindow();
	public void findElement();
	
	
}
class ChromeDriver implements WebDriver, TakesScreenshot {

	@Override
	public void openBrowser() {
		System.out.println("We can open Chrome");
		
	}

	@Override
	public void closeBrowser() {
		 System.out.println("We can close Chrome");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Max Window");
		
	}

	@Override
	public void findElement() {
		System.out.println("find Element");
		
	}

	@Override
	public void takePicture() {
		System.out.println("I can take pictures");
		
	}
}
class FirefoxDriver implements WebDriver, TakesScreenshot {
	


@Override
public void openBrowser() {
	System.out.println("We can open Firefox");
	
}

@Override
public void closeBrowser() {
	System.out.println("We can close Firefox");
	
}

@Override
public void maximizeWindow() {
	System.out.println("Firefox maximize Window");
	
}

@Override
public void findElement() {
	System.out.println("find element");
	
}

@Override
public void takePicture() {
	System.out.println("I can take picture");
	
}	
	
	
	
	
	
}