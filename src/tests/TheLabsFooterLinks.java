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

public class TheLabsFooterLinks {
	
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
	//Tests the Mobile Devices Link in the Labs Section of the Footer
	public void checkMobileDevicesLabsFooterLinkFF(){
		driver = browser.setBrowser("Mozilla");
		//To Maximize Browser Window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.mobileDevicesLabsFooterLinkXPath));
		element.click();
		Assert.assertEquals(Constants.mobileDevicesLabsFooterLinkPageTitle, driver.getTitle());
	}
	
	
	@Test
	//Tests the PC Systems Link in the Labs Section of the Footer
	public void checkPCSystemsFooterLinkFF(){
		driver = browser.setBrowser("Mozilla");
		//To Maximize Browser Window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.pcSystemsFooterLinkXPath));
		element.click();
		Assert.assertEquals(Constants.pcSystemsFooterLinkPageTitle, driver.getTitle());
	}
	
	
	@Test
	//Tests the Mac Systems Link in the Labs Section of the Footer
	public void checkMacSystemsFooterLinkFF(){
		driver = browser.setBrowser("Mozilla");
		//To Maximize Browser Window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.macSystemsFooterLinkXPath));
		element.click();
		Assert.assertEquals(Constants.macSystemsFooterLinkPageTitle, driver.getTitle());
	}
	
	
	@Test
	//Tests the Laptops Link in the Labs Section of the Footer
	public void checkLaptopsFooterLinkFF(){
		driver = browser.setBrowser("Mozilla");
		//To Maximize Browser Window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.laptopsFooterLinkXPath));
		element.click();
		Assert.assertEquals(Constants.laptopsFooterLinkPageTitle, driver.getTitle());
	}
	
	
	@Test
	//Tests the Laptops Link in the Labs Section of the Footer
	public void checkVideoCardsFooterLinkFF(){
		driver = browser.setBrowser("Mozilla");
		//To Maximize Browser Window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.videoCardsFooterLinkXPath));
		element.click();
		Assert.assertEquals(Constants.videoCardsFooterLinkPageTitle, driver.getTitle());
	}
	
	
	
	/******************** Test Methods for Chrome & IE Skipped due to problems with finding/clicking the necessary
	 * 					  Web element *************************************************************************************
	
	//Tests Chrome
	@Test(dependsOnMethods = {"checkMobileDevicesLabsFooterLinkFF"})
	//Tests the Mobile Devices Link in the Labs Section of the Footer
	public void checkMobileDevicesLabsFooterLinkChrome(){
		throw new SkipException("Skipping Test.");
//		driver = browser.setBrowser("Chrome");
//		//To Maximize Browser Window
//		driver.manage().window().maximize();
//		driver.get(Constants.homePageURL);
//		element = driver.findElement(By.xpath(Constants.mobileDevicesLabsFooterLinkXPath));
//		element.click();
//		Assert.assertEquals(Constants.mobileDevicesLabsFooterLinkPageTitle, driver.getTitle());
	}
*/	

}
