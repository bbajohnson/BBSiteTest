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

public class CareerCompanyPage {
	
	Browsers browser = new Browsers();
	WebDriver driver = null;
	WebElement element = null;
	
	//Closes browser window after every test.
	@AfterMethod
	public void quitBrowser(){
		browser.closeBrowser(driver);
	}
	
	
	@Test
	//Tests the Beta Breakers bread crumb link in the Career Company page
	public void checkBBBreadCrumb(){
		driver = browser.setBrowser("Mozilla");
		
		//Tests link:
		LinkChecker.testWithXpath(driver, Constants.companyCareersPageURL, Constants.BetaBreakersBreadCrumbLinkXPath,
								  Constants.homePageTitle);
	}
	
	
	@Test
	//Tests the Labs bread crumb link in the Team Career page
	public void checkTheLabsBreadCrumb(){
		driver = browser.setBrowser("Mozilla");
		
		//Tests link:
		LinkChecker.testWithXpath(driver, Constants.companyCareersPageURL, "//*[@id='breadcrumbs']/span/span[2]/a",
								  Constants.companyPageTitle);
	}

}
