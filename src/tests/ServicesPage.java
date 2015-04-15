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

public class ServicesPage {
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
	//Tests the Beta Breakers bread crumb in the Services page
	public void testBreadCrumbLink(){
		driver = browser.setBrowser("Mozilla");
		
		//Tests link:
		LinkChecker.testWithXpath(driver, Constants.servicesPageURL, "//*[@id='breadcrumbs']/span/span[1]/a",
								  Constants.homePageTitle);
	}
	
	
	@Test
	//Tests the Functionality button in the Services page
	public void testFunctionalityButton(){
		driver = browser.setBrowser("Mozilla");

		//Tests link:
		LinkChecker.testWithXpath(driver, Constants.servicesPageURL, "//*[@id='service-section']/div[1]/span[1]/a", 
						 		  Constants.functionalityPageTitle);
	}
	
	
	@Test
	//Tests the Compatibility button in the Services page
	public void testCompatibilityButton(){
		driver = browser.setBrowser("Mozilla");
		
		//Tests link:
		LinkChecker.testWithXpath(driver, Constants.servicesPageURL, "//*[@id='service-section']/div[1]/span[2]/a", 
						 		  Constants.compatibilityPageTitle);
	}
	
	
	@Test
	//Tests the Website QA button in the Services page
	public void testWebsiteQAButton(){
		driver = browser.setBrowser("Mozilla");
		
		//Tests link:
		LinkChecker.testWithXpath(driver, Constants.servicesPageURL, "//*[@id='service-section']/div[1]/span[3]/a", 
						 		  Constants.websiteTestingPageTitle);
	}
	
	
	@Test
	//Tests the Mobile Device button in the Services page
	public void testMobileDeviceButton(){
		driver = browser.setBrowser("Mozilla");
		
		//Tests link:
		LinkChecker.testWithXpath(driver, Constants.servicesPageURL, "//*[@id='service-section']/div[1]/span[4]/a", Constants.mobileTestingPageTitle);
	}
	
	
	@Test
	//Tests the Usability button in the Services page
	public void testUsabilityButton(){
		driver = browser.setBrowser("Mozilla");
		
		//Tests link:
		LinkChecker.testWithXpath(driver, Constants.servicesPageURL, "//*[@id='service-section']/div[1]/span[5]/a", 
								  Constants.usabilityHeaderLinkPageTitle);
	}
	
	
	@Test
	//Tests the Test Plan button in the Services page
	public void testTestPlanButton(){
		driver = browser.setBrowser("Mozilla");
		
		//Tests link:
		LinkChecker.testWithXpath(driver, Constants.servicesPageURL, "//*[@id='service-section']/div[2]/span[1]/a", 
								  Constants.testPlanWritingHeaderLinkPageTitle);
	}
	
	
	@Test
	//Tests the Localization button in the Services page
	public void testLocalizationButton(){
		driver = browser.setBrowser("Mozilla");
		
		//Tests link:
		LinkChecker.testWithXpath(driver, Constants.servicesPageURL, "//*[@id='service-section']/div[2]/span[2]/a",
								  Constants.localizationHeaderLinkPageTitle);
	}
	
	
	@Test
	//Tests the Automated button in the Services page
	public void testAutomatedButton(){
		driver = browser.setBrowser("Mozilla");
		
		//Tests link:
		LinkChecker.testWithXpath(driver, Constants.servicesPageURL, "//*[@id='service-section']/div[2]/span[3]/a",
								  Constants.automatedHeaderLinkPageTitle);
	}
	
	
	@Test
	//Tests the Load/Performance button in the Services page
	public void testLoadPerformanceButton(){
		driver = browser.setBrowser("Mozilla");
		
		//Tests link:
		LinkChecker.testWithXpath(driver, Constants.servicesPageURL, "//*[@id='service-section']/div[2]/span[4]/a",
								  Constants.loadPerformanceFooterLinkPageTitle);
	}
	
	
	@Test
	//Tests the Accessibility button in the Services page
	public void testAccessibilityButton(){
		driver = browser.setBrowser("Mozilla");
		
		//Tests link:
		LinkChecker.testWithXpath(driver, Constants.servicesPageURL, "//*[@id='service-section']/div[2]/span[5]/a",
								  Constants.accessibilityHeaderLinkPageTitle);
	}	
}
















