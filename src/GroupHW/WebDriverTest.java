package GroupHW;

public class WebDriverTest {

	public static void main(String[] args) {
		RemoteWebDriver [] webdrivers = {new ChromeDriver(), new FireFoxDriver(), new SafariDriver()};
        for (RemoteWebDriver wb : webdrivers ) {
        	wb.open();
        	wb.close();
        	wb.navigate();
        	wb.getScreenshot();
            System.out.println(wb.getTitle());
        	
        	
        }
	}

}
