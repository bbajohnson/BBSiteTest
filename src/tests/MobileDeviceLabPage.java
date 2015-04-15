package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import Utility.LinkChecker;					//Tests links and asserts the link is working correctly by comparing the page title
import Utility.Browsers;					//Page Object which handles browser selection, launch, and tear down.
import Utility.Constants;					//This lists the data that I'm referencing for Page title, Page URL,
											//Link IDs, Link XPaths, Link CSS Paths, and so on.  It was easier to keep 
											//track of them and modify them this way.

public class MobileDeviceLabPage {
	
	Browsers browser = new Browsers();
	WebDriver driver = null;
	WebElement element = null;
	
	//Closes browser window after every test.
	@AfterMethod
	public void quitBrowser(){
		browser.closeBrowser(driver);
	}
	
	
	@Test
	//Tests the Beta Breakers bread crumb link in the Mobile Device Lab testing page
	public void checkBBBreadCrumb(){
		driver = browser.setBrowser("Mozilla");
		
		//Tests link:
		LinkChecker.testWithXpath(driver, Constants.theLabsMobileDevicesPageURL, Constants.BetaBreakersBreadCrumbLinkXPath,
								  Constants.homePageTitle);
	}
	
	
	@Test
	//Tests the Labs bread crumb link in the Mobile Device Lab testing page
	public void checkTheLabsBreadCrumb(){
		driver = browser.setBrowser("Mozilla");
		
		//Tests link:
		LinkChecker.testWithXpath(driver, Constants.theLabsMobileDevicesPageURL, "//*[@id='breadcrumbs']/span/span[2]/a",
								  Constants.theLabsPageTitle);
	}
	
	
	@Test
	//Tests the Laptop link
	public void checkLaptopLink(){
		driver = browser.setBrowser("Mozilla");
		
		//Tests link:
		LinkChecker.testWithXpath(driver, Constants.theLabsMobileDevicesPageURL, "//*[@id='menu-item-878']/a",
								  Constants.theLabsLaptopPageTitle);
	}
	
	
	@Test
	//Tests the Laptop link
	public void checkMacSystemLink(){
		driver = browser.setBrowser("Mozilla");
		
		//Tests link:
		LinkChecker.testWithXpath(driver, Constants.theLabsMobileDevicesPageURL, "//*[@id='menu-item-879']/a",
								  Constants.theLabsMacSystemsPageTitle);
	}
	
	
	@Test
	//Tests the Laptop link
	public void checkMobileDevicesLink(){
		driver = browser.setBrowser("Mozilla");
		
		//Tests link:
		LinkChecker.testWithXpath(driver, Constants.theLabsMobileDevicesPageURL, "//*[@id='menu-item-880']/a",
								  Constants.theLabsMobileDevicesPageTitle);
	}
	
	
	@Test
	//Tests the Laptop link
	public void checkPCSystemsLink(){
		driver = browser.setBrowser("Mozilla");
		
		//Tests link:
		LinkChecker.testWithXpath(driver, Constants.theLabsMobileDevicesPageURL, "//*[@id='menu-item-881']/a",
								  Constants.theLabsPCSystemsPageTitle);
	}
	
	
	@Test
	//Tests the Laptop link
	public void checkVideoCardsLink(){
		driver = browser.setBrowser("Mozilla");
		
		//Tests link:
		LinkChecker.testWithXpath(driver, Constants.theLabsMobileDevicesPageURL, "//*[@id='menu-item-882']/a",
								  Constants.theLabsVideoCardsPageTitle);
	}
	
	
	

}
































