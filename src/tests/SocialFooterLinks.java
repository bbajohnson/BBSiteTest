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

public class SocialFooterLinks {
	
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
	//Tests the Facebook Link in the Labs Section of the Footer
	public void checkFacebookFooterLinkFF(){
		driver = browser.setBrowser("Mozilla");
		//To Maximize Browser Window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.cssSelector(Constants.facebookFooterLinkCSSPath));
		element.click();
		
		//This steps through new tabs/windows created until it gets to the current tab/window and switches
		//the webdriver to that window.
		for(String winHandle : driver.getWindowHandles())
			driver.switchTo().window(winHandle);

		Assert.assertEquals(Constants.facebookFooterLinkPageURL, driver.getCurrentUrl());
	}
	
	
	@Test
	//Tests the Twitter Link in the Labs Section of the Footer
	public void checkTwitterFooterLinkFF(){
		driver = browser.setBrowser("Mozilla");
		//To Maximize Browser Window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.cssSelector(Constants.twitterFooterLinkCSSPath));
		element.click();
		
		//This steps through new tabs/windows created until it gets to the current tab/window and switches
		//the webdriver to that window.
		for(String winHandle : driver.getWindowHandles())
			driver.switchTo().window(winHandle);

		Assert.assertEquals(Constants.twitterFooterLinkPageURL, driver.getCurrentUrl());
	}
	
	@Test
	//Tests the Google+ Link in the Labs Section of the Footer
	public void checkGooglePlusFooterLinkFF(){
		driver = browser.setBrowser("Mozilla");
		//To Maximize Browser Window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.cssSelector(Constants.googleplusFooterLinkCSSPath));
		element.click();
		
		//This steps through new tabs/windows created until it gets to the current tab/window and switches
		//the webdriver to that window.
		for(String winHandle : driver.getWindowHandles())
			driver.switchTo().window(winHandle);

		Assert.assertEquals(Constants.googleplusFooterLinkPageURL, driver.getCurrentUrl());
	}
	
	
	@Test
	//Tests the LinkedIn Link in the Labs Section of the Footer
	public void checkLinkedInFooterLinkFF(){
		driver = browser.setBrowser("Mozilla");
		//To Maximize Browser Window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.cssSelector(Constants.linkedInFooterLinkCSSPath));
		element.click();
		
		//This steps through new tabs/windows created until it gets to the current tab/window and switches
		//the webdriver to that window.
		for(String winHandle : driver.getWindowHandles())
			driver.switchTo().window(winHandle);

		Assert.assertEquals(Constants.linkedInFooterLinkPageURL, driver.getCurrentUrl());
	}
	
	
	
	
	
	/******************** Test Methods for Chrome & IE Skipped due to problems with finding/clicking the necessary
	 * 					  Web element *************************************************************************************
	
	//Tests Chrome
	@Test(dependsOnMethods = {"checkFacebookFooterLinkFF"})
	//Tests the Facebook Link in the Labs Section of the Footer
	public void checkFacebookFooterLinkChrome(){
		throw new SkipException("Skipping Test.");
		driver = browser.setBrowser("Chrome");
		//To Maximize Browser Window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.cssSelector(Constants.facebookFooterLinkCSSPath));
		element.click();
		
		//This steps through new tabs/windows created until it gets to the current tab/window and switches
		//the webdriver to that window.
		for(String winHandle : driver.getWindowHandles())
		driver.switchTo().window(winHandle);

		Assert.assertEquals(Constants.facebookFooterLinkPageURL, driver.getCurrentUrl());
	}
*/	

}
