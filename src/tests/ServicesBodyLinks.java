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

public class ServicesBodyLinks {
	
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
	//Tests Functionality Icon Link
	public void checkFunctionalityIconLinkFF(){
		driver = browser.setBrowser("Mozilla");
		//To Maximize Browser Window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.functionalityIconXPath));
		element.click();
		Assert.assertEquals(Constants.functionalityPageTitle, driver.getTitle());
	}
	
	@Test
	//Tests Functionality Read More Link
	public void checkFunctionalityReadMoreLinkFF(){
		driver = browser.setBrowser("Mozilla");
		//To Maximize Browser Window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.functionalityReadMoreXPath));
		element.click();
		Assert.assertEquals(Constants.functionalityPageTitle, driver.getTitle());
	}
	
	@Test
	//Tests Compatibility Icon Link
	public void checkCompatibilityIconLinkFF(){
		driver = browser.setBrowser("Mozilla");
		//To Maximize Browser Window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.compatibilityIconXPath));
		element.click();
		Assert.assertEquals(Constants.compatibilityPageTitle, driver.getTitle());
	}
	
	@Test
	//Tests Compatibility Read More Link
	public void checkCompatibilityReadMoreLinkFF(){
		driver = browser.setBrowser("Mozilla");
		//To Maximize Browser Window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.compatibilityReadMoreXPath));
		element.click();
		Assert.assertEquals(Constants.compatibilityPageTitle, driver.getTitle());
	}
	
	@Test
	//Tests Compatibility Icon Link
	public void checkWebsiteTestingIconLinkFF(){
		driver = browser.setBrowser("Mozilla");
		//To Maximize Browser Window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.websiteTestingIconXPath));
		element.click();
		Assert.assertEquals(Constants.websiteTestingPageTitle, driver.getTitle());
	}
	
	@Test
	//Tests Compatibility Read More Link
	public void checkWebsiteTestingReadMoreLinkFF(){
		driver = browser.setBrowser("Mozilla");
		//To Maximize Browser Window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.websiteTestingReadMoreXPath));
		element.click();
		Assert.assertEquals(Constants.websiteTestingPageTitle, driver.getTitle());
	}
	
	@Test
	//Tests Compatibility Icon Link
	public void checkMobileTestingIconLinkFF(){
		driver = browser.setBrowser("Mozilla");
		//To Maximize Browser Window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.mobileTestingIconXPath));
		element.click();
		Assert.assertEquals(Constants.mobileTestingPageTitle, driver.getTitle());
	}
	
	@Test
	//Tests Compatibility Read More Link
	public void checkMobileTestingReadMoreLinkFF(){
		driver = browser.setBrowser("Mozilla");
		//To Maximize Browser Window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.mobileTestingReadMoreXPath));
		element.click();
		Assert.assertEquals(Constants.mobileTestingPageTitle, driver.getTitle());
	}
	
	
	
/******************** Test Methods for Chrome & IE Skipped due to problems with finding/clicking the necessary
 * 					  Web element *************************************************************************************
	//Tests Chrome
	@Test(dependsOnMethods = {"checkFunctionalityReadMoreLinkFF"})  //I don't know why I needed to put this depends on annotation here, but the script was skipping all of the tests without it.
	public void checkFunctionalityIconLinkChrome() throws InterruptedException{
		throw new SkipException("Skipping Test.");
//		driver = browser.setBrowser("Chrome");
//		driver.manage().window().maximize();
//		driver.get(Constants.homePageURL);
//		element = driver.findElement(By.xpath(Constants.functionalityIconXPath));
//		element.click();
//		Assert.assertEquals(Constants.functionalityPageTitle, driver.getTitle());
	}
	
	@Test(dependsOnMethods = {"checkFunctionalityReadMoreLinkFF"})
	public void checkFunctionalityReadMoreLinkChrome(){
		throw new SkipException("Skipping Test.");
//		driver = browser.setBrowser("Chrome");
		//To Maximize Browser Window
//		driver.manage().window().maximize();
//		driver.get(Constants.homePageURL);
//		element = driver.findElement(By.xpath(Constants.functionalityReadMoreXPath));
//		element.click();
//		Assert.assertEquals(Constants.functionalityPageTitle, driver.getTitle());
		}
	
	//Tests Internet Explorer
	@Test(dependsOnMethods = {"checkFunctionalityReadMoreLinkFF"})
	public void checkFunctionalityIconLinkIE(){
		throw new SkipException("Skipping Test.");
//		driver = browser.setBrowser("IE");
		//To Maximize Browser Window
//		driver.manage().window().maximize();
//		driver.get(Constants.homePageURL);
//		element = driver.findElement(By.xpath(Constants.functionalityIconXPath));
//		element.click();
//		Assert.assertEquals(Constants.functionalityPageTitle, driver.getTitle());
	}
	
	@Test(dependsOnMethods = {"checkFunctionalityReadMoreLinkFF"})
	public void checkFunctionalityReadMoreLinkIE(){
		throw new SkipException("Skipping Test.");
//		driver = browser.setBrowser("IE");
		//To Maximize Browser Window
//		driver.manage().window().maximize();
//		driver.get(Constants.homePageURL);
//		element = driver.findElement(By.xpath(Constants.functionalityReadMoreXPath));
//		element.click();
//		Assert.assertEquals(Constants.functionalityPageTitle, driver.getTitle());
	}
*/	
}
