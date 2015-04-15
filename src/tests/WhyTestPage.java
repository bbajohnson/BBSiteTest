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

public class WhyTestPage {
	
	Browsers browser = new Browsers();
	WebDriver driver = null;
	WebElement element = null;
	
	//Closes browser window after every test.
	@AfterMethod
	public void quitBrowser(){
		browser.closeBrowser(driver);
	}
	
	
	@Test
	//Tests the Beta Breakers bread crumb link in the Why Test page
	public void checkBreadCrumbLink(){
		driver = browser.setBrowser("Mozilla");
		
		//Tests link:
		LinkChecker.testWithXpath(driver, Constants.whyTestPageURL, "//*[@id='breadcrumbs']/span/span[1]/a",
								  Constants.homePageTitle);
	}
}




























