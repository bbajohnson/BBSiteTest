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

public class ServicesFooterLinks {
	
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
	//Tests the Functionality Link in the Services Section of the Footer
	public void checkFunctionalityFooterLinkFF(){
		driver = browser.setBrowser("Mozilla");
		//To Maximize Browser Window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.functionalityFooterLinkXPath));
		element.click();
		Assert.assertEquals(Constants.functionalityFooterLinkPageTitle, driver.getTitle());
	}
	
	
	@Test
	//Tests the Compatibility Link in the Services Section of the Footer
	public void checkCompatibilityFooterLinkFF(){
		driver = browser.setBrowser("Mozilla");
		//To Maximize Browser Window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.compatibilityFooterLinkXPath));
		element.click();
		Assert.assertEquals(Constants.compatibilityFooterLinkPageTitle, driver.getTitle());
	}
	
	
	@Test
	//Tests the Website Link in the Services Section of the Footer
	public void checkWebsiteFooterLinkFF(){
		driver = browser.setBrowser("Mozilla");
		//To Maximize Browser Window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.websiteFooterLinkXPath));
		element.click();
		Assert.assertEquals(Constants.websiteFooterLinkPageTitle, driver.getTitle());
	}
	
	
	@Test
	//Tests the Mobile Device Link in the Services Section of the Footer
	public void checkMobileDeviceServicesFooterLinkFF(){
		driver = browser.setBrowser("Mozilla");
		//To Maximize Browser Window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.mobileDeviceServicesFooterLinkXPath));
		element.click();
		Assert.assertEquals(Constants.mobileDeviceServicesFooterLinkPageTitle, driver.getTitle());
	}
	
	
	@Test
	//Tests the Usability Link in the Services Section of the Footer
	public void checkUsabilityFooterLinkFF(){
		driver = browser.setBrowser("Mozilla");
		//To Maximize Browser Window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.usabilityFooterLinkXPath));
		element.click();
		Assert.assertEquals(Constants.usabilityFooterLinkPageTitle, driver.getTitle());
	}
	
	
	@Test
	//Tests the Test Plan Writing Link in the Services Section of the Footer
	public void checkTestPlanWritingFooterLinkFF(){
		driver = browser.setBrowser("Mozilla");
		//To Maximize Browser Window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.testPlanWritingFooterLinkXPath));
		element.click();
		Assert.assertEquals(Constants.testPlanWritingFooterLinkPageTitle, driver.getTitle());
	}
	
	
	@Test
	//Tests the Localization Link in the Services Section of the Footer
	public void checkLocalizationFooterLinkFF(){
		driver = browser.setBrowser("Mozilla");
		//To Maximize Browser Window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.localizationFooterLinkXPath));
		element.click();
		Assert.assertEquals(Constants.localizationFooterLinkPageTitle, driver.getTitle());
	}
	
	
	@Test
	//Tests the Automated Link in the Services Section of the Footer
	public void checkAutomatedFooterLinkFF(){
		driver = browser.setBrowser("Mozilla");
		//To Maximize Browser Window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.automatedFooterLinkXPath));
		element.click();
		Assert.assertEquals(Constants.automatedFooterLinkPageTitle, driver.getTitle());
	}
	
	
	@Test
	//Tests the Load/Performance Link in the Services Section of the Footer
	public void checkLoadPerformanceFooterLinkFF(){
		driver = browser.setBrowser("Mozilla");
		//To Maximize Browser Window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.loadPerformanceFooterLinkXPath));
		element.click();
		Assert.assertEquals(Constants.loadPerformanceFooterLinkPageTitle, driver.getTitle());
	}
	
	
	@Test
	//Tests the Accessibility Link in the Services Section of the Footer
	public void checkAccesibilityFooterLinkFF(){
		driver = browser.setBrowser("Mozilla");
		//To Maximize Browser Window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.accessibilityFooterLinkXPath));
		element.click();
		Assert.assertEquals(Constants.accessibilityFooterLinkPageTitle, driver.getTitle());
	}
	
	
	/******************** Test Methods for Chrome & IE Skipped due to problems with finding/clicking the necessary
	 * 					  Web element *************************************************************************************
	
	//Tests Chrome
	@Test(dependsOnMethods = {"checkFunctionalityFooterLinkFF"})
	//Tests the Functionality Link in the Services Section of the Footer
	public void checkFunctionalityFooterLinkChrome(){
		throw new SkipException("Skipping Test.");
//		driver = browser.setBrowser("Chrome");
//		//To Maximize Browser Window
//		driver.manage().window().maximize();
//		driver.get(Constants.homePageURL);
//		element = driver.findElement(By.xpath(Constants.functionalityFooterLinkXPath));
//		element.click();
//		Assert.assertEquals(Constants.functionalityFooterLinkPageTitle, driver.getTitle());
	}
*/	
}
