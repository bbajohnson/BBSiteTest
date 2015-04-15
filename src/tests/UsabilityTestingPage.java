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

public class UsabilityTestingPage {
	
	Browsers browser = new Browsers();
	WebDriver driver = null;
	WebElement element = null;
	
	//Closes browser window after every test.
	@AfterMethod
	public void quitBrowser(){
		browser.closeBrowser(driver);
	}
	
	
	@Test
	//Tests the Beta Breakers bread crumb link in the Usability Testing page
	public void checkBBBreadCrumb(){
		driver = browser.setBrowser("Mozilla");
		
		//Tests link:
		LinkChecker.testWithXpath(driver, Constants.usabilityFooterLinkPageURL, "//*[@id='breadcrumbs']/span/span[1]/a",
								  Constants.homePageTitle);
	}
	
	
	@Test
	//Tests the Services bread crumb link in the Usability Testing page
	public void checkServicesBreadCrumb(){
		driver = browser.setBrowser("Mozilla");
		
		//Tests link:
		LinkChecker.testWithXpath(driver, Constants.usabilityFooterLinkPageURL, "//*[@id='breadcrumbs']/span/span[2]/a",
								  Constants.servicesPageTitle);
	}
	
	
	@Test
	//Tests the Purpose and Methodology button in the Usability Testing page
	public void checkUsabilityPurposeAndMethod(){
		driver = browser.setBrowser("Mozilla");
		
		//Tests link:
		LinkChecker.testWithXpath(driver, Constants.usabilityFooterLinkPageURL, "//*[@id='black-studio-tinymce-16']/div/h5/a",
								  Constants.usabilityPurposeAndMethodologyPageTitle);
	}
	
	
	@Test
	//Tests the Mobile Device Testing bread crumb in the Usability Purpose and Methodology page
	public void checkUsabilityTestingBreadCrumb(){
		driver = browser.setBrowser("Mozilla");
		
		//Tests link:
		LinkChecker.testWithXpath(driver, Constants.usabilityPurposeAndMethodologyPageURL, "//*[@id='breadcrumbs']/span/span[3]/a",
								  Constants.usabilityFooterLinkPageTitle);
	}

}
