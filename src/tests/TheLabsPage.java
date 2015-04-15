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

public class TheLabsPage {
	
	Browsers browser = new Browsers();
	WebDriver driver = null;
	WebElement element = null;
	
	//Closes browser window after every test.
	@AfterMethod
	public void quitBrowser(){
		browser.closeBrowser(driver);
	}
	
	
	@Test
	//Tests the Beta Breakers bread crumb link in the Labs page
	public void checkBreadCrumb(){
		driver = browser.setBrowser("Mozilla");
		
		//Tests link:
		LinkChecker.testWithXpath(driver, Constants.theLabsPageURL, "//*[@id='breadcrumbs']/span/span[1]/a",
								  Constants.homePageTitle);
	}
	
	
	@Test
	//Tests the Mobile Device button in the Labs page
	public void checkMobileDevicesButton(){
		driver = browser.setBrowser("Mozilla");
		
		//Tests link:
		LinkChecker.testWithXpath(driver, Constants.theLabsPageURL, "//*[@id='menu-the-labs']/div[1]/span[1]/a",
								  Constants.mobileTestingInTheLabsMenuPageTitle);
	}
	
	
	@Test
	//Tests the PC Systems button in the Labs page
	public void checkPCSystemsButton(){
		driver = browser.setBrowser("Mozilla");
		
		//Tests link:
		LinkChecker.testWithXpath(driver, Constants.theLabsPageURL, "//*[@id='menu-the-labs']/div[1]/span[2]/a",
								  Constants.pcSystemsFooterLinkPageTitle);
	}
	
	
	@Test
	//Tests the Laptops button in the Labs page
	public void checkLaptopsButton(){
		driver = browser.setBrowser("Mozilla");
		
		//Tests link:
		LinkChecker.testWithXpath(driver, Constants.theLabsPageURL, "//*[@id='menu-the-labs']/div[2]/span[1]/a",
								  Constants.laptopsFooterLinkPageTitle);
	}
	
	
	@Test
	//Tests the Video Card button in the Labs page
	public void checkVideoCardButton(){
		driver = browser.setBrowser("Mozilla");
		
		//Tests link:
		LinkChecker.testWithXpath(driver, Constants.theLabsPageURL, "//*[@id='menu-the-labs']/div[2]/span[2]/a",
								  Constants.videoCardsFooterLinkPageTitle);
	}
	
	
	@Test
	//Tests the Mac Systems button in the Labs page
	public void checkMacSystemsButton(){
		driver = browser.setBrowser("Mozilla");
		
		//Tests link:
		LinkChecker.testWithXpath(driver, Constants.theLabsPageURL, "//*[@id='menu-the-labs']/p/span/a",
								  Constants.macSystemsFooterLinkPageTitle);
	}
}


























