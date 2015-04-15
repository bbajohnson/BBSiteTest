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

public class LoadPerformanceTestingPage {
	
	Browsers browser = new Browsers();
	WebDriver driver = null;
	WebElement element = null;
	
	//Closes browser window after every test.
	@AfterMethod
	public void quitBrowser(){
		browser.closeBrowser(driver);
	}
	
	
	@Test
	//Tests the Beta Breakers bread crumb link in the Load and Performance testing page
	public void checkBBBreadCrumb(){
		driver = browser.setBrowser("Mozilla");
		
		//Tests link:
		LinkChecker.testWithXpath(driver, Constants.loadPerformanceFooterLinkPageURL, "//*[@id='breadcrumbs']/span/span[1]/a",
								  Constants.homePageTitle);
	}
	
	
	@Test
	//Tests the Services bread crumb link in the Load and Performance testing page
	public void checkServicesBreadCrumb(){
		driver = browser.setBrowser("Mozilla");
		
		//Tests link:
		LinkChecker.testWithXpath(driver, Constants.loadPerformanceFooterLinkPageURL, "//*[@id='breadcrumbs']/span/span[2]/a",
								  Constants.servicesPageTitle);
	}
	
	
	@Test
	//Tests the Purpose and Methodology button in the Load and Performance testing page
	public void checkLoadPerformancePurposeAndMethod(){
		driver = browser.setBrowser("Mozilla");
		
		//Tests link:
		LinkChecker.testWithXpath(driver, Constants.loadPerformanceFooterLinkPageURL, "//*[@id='black-studio-tinymce-20']/div/h5/a",
								  Constants.loadPerformancePurposeAndMethodPageTitle);
	}
	
	
	@Test
	//Tests the Mobile Device Testing bread crumb in the Load and Performance testing Purpose and Methodology page
	public void checkLoadPerformanceBreadCrumb(){
		driver = browser.setBrowser("Mozilla");
		
		//Tests link:
		LinkChecker.testWithXpath(driver, Constants.loadPerformancePurposeAndMethodPageURL, "//*[@id='breadcrumbs']/span/span[3]/a",
								  Constants.loadPerformanceFooterLinkPageTitle);
	}

}
