package Utility;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;


public class Browsers {
	
	public WebDriver setBrowser(String browser){
		WebDriver driver = null;
		switch(browser){
			case "Mozilla"	:	driver = new FirefoxDriver();
								break;
			case "Chrome"	:	System.setProperty("webdriver.chrome.driver", 
												   //"C:\\Dev\\chromedriver.exe");
												   System.getProperty("user.dir") + "/vendor/chromedriver.exe");
								driver = new ChromeDriver();
								break;
//			case "IE"		:	System.setProperty("webdriver.ie.driver", 
//												   "C:\\Dev\\IEDriverServer.exe");
//								driver = new InternetExplorerDriver();
//								break;
		}
		
		return driver;
	}
	
	public void closeBrowser(WebDriver driver){
		driver.quit();
	}

}
