package GroupHW;

public interface WebDriver {
    
	void open();
	void close();
	String getTitle();
}
interface RemoteWebDriver extends WebDriver,TakesScreenshot {
	void navigate();
}
interface TakesScreenshot {
	void getScreenshot();
}
class ChromeDriver implements RemoteWebDriver {

	@Override
	public void open() {
		System.out.println("Chrome driver opens...");
		
	}

	@Override
	public void close() {
		System.out.println("Chrome driver closes...");
		
	}

	@Override
	public String getTitle() {
		String title="*****";
		return title;
	}

	@Override
	public void navigate() {
		System.out.println("Chrome driver has navigate.");
		
	}

	@Override
	public void getScreenshot() {
		System.out.println(".......");
		
	}
	
}
class FireFoxDriver implements RemoteWebDriver {

	@Override
	public void open() {
		System.out.println("FireFox driver opens...");
		
	}

	@Override
	public void close() {
		System.out.println("FireFox driver closes...");
		
	}

	@Override
	public String getTitle() {
		String title="#####";
		return title;
	}

	@Override
	public void navigate() {
		System.out.println("FireFox driver has navigate.");
		
	}

	@Override
	public void getScreenshot() {
		System.out.println(".......");
		
	}
	
}
class SafariDriver implements RemoteWebDriver {

	@Override
	public void open() {
		System.out.println("Safari driver opens...");
		
	}

	@Override
	public void close() {
		System.out.println("Safari driver closes...");
		
	}

	@Override
	public String getTitle() {
		String title="@@@@@";
		return title;
	}

	@Override
	public void navigate() {
		System.out.println("Safari has navigate.");
		
	}

	@Override
	public void getScreenshot() {
		System.out.println(".......");
		
	}
	
}



