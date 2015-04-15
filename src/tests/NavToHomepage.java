package tests;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
//import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Utility.Browsers;
import Utility.Constants;


public class NavToHomepage {

	Browsers browser = new Browsers();
	WebDriver driver = null;
	
	//Closes browser window after every test.
	@AfterMethod
	public void quitBrowser(){
		browser.closeBrowser(driver);
	}
	
	//Tests Firefox
	@Test
	public void checkHomePageLoadFF(){
		driver = browser.setBrowser("Mozilla");
		//To Maximize Browser Window
		driver.manage().window().maximize();		
		driver.get(Constants.homePageURL);
		Assert.assertEquals(Constants.homePageTitle, driver.getTitle());
	}
	
	//Tests Chrome
	@Test
	public void checkHomePageLoadChrome(){
		driver = browser.setBrowser("Chrome");
		//To Maximize Browser Window
		driver.manage().window().maximize();		
		driver.get(Constants.homePageURL);
		Assert.assertEquals(Constants.homePageTitle, driver.getTitle());
	}
	
/*	
	//Tests Internet Explorer
	@Test
	public void checkHomePageLoadIE(){
		throw new SkipException("Skipping Test.");
//		driver = browser.setBrowser("IE");
//		//To Maximize Browser Window
//		driver.manage().window().maximize();		
//		driver.get(Constants.homePageURL);
//		Assert.assertEquals(Constants.homePageTitle, driver.getTitle());
	}
*/	
}
