package com.syntax.class25;

public class WebDriverTest {

	public static void main(String[] args) {
		
		WebDriver [] arr = {new ChromeDriver(), new FirefoxDriver () };
		for (WebDriver a :arr) {
			a.openBrowser();
			a.closeBrowser();
			a.maximizeWindow();
			a.findElement();
		    System.out.println("___________");
		    TakesScreenshot [] arr2 = {new ChromeDriver(), new FirefoxDriver () };
		    
		    for (TakesScreenshot a2 :arr2 ) {
		    	a2.takePicture();
		    	a2.takePanoromaPic();
		    	TakesScreenshot.takeSelfie();
		    }
		}
		

	}

}
