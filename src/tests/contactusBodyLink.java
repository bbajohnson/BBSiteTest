package tests;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import Utility.Browsers;					//Page Object which handles browser selection, launch, and tear down.
import Utility.Constants;					//This lists the data that I'm referencing for Page title, Page URL,
											//Link IDs, Link XPaths, Link CSS Paths, and so on.  It was easier to keep 
											//track of them and modify them this way.

public class contactusBodyLink {
	
	Browsers browser = new Browsers();
	WebDriver driver = null;
	WebElement element = null;
	
	//Closes browser window after every test.
	@AfterMethod
	public void quitBrowser(){
		browser.closeBrowser(driver);
	}
	  
	
	//Tests Firefox
	@Test
	//Tests Contact Us Link in the Body of the Homepage
	public void checkContactUsBodyLinkFF(){
		driver = browser.setBrowser("Mozilla");
		//To Maximize Browser Window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.contactusBodyLinkXPath));
		element.click();
		Assert.assertEquals(Constants.contactusBodyLinkPageTitle, driver.getTitle());
	}
	
	/******************** Test Methods for Chrome & IE Skipped due to problems with finding/clicking the necessary
	 * 					  Web element *************************************************************************************
	
	//Tests Chrome
	@Test(dependsOnMethods = {"checkContactUsBodyLinkFF"})
	//Tests Contact Us Link in the Body of the Homepage
	public void checkContactUsBodyLinkChrome(){
		throw new SkipException("Skipping Test.");
//		driver = browser.setBrowser("Chrome");
//		//To Maximize Browser Window
//		driver.manage().window().maximize();
//		driver.get(Constants.homePageURL);
//		element = driver.findElement(By.xpath(Constants.contactusBodyLinkXPath));
//		element.click();
//		Assert.assertEquals(Constants.contactusBodyLinkPageTitle, driver.getTitle());
	}
*/

}























