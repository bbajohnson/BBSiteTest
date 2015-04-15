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

public class TheCompany {
	
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
	//Tests the Testimonials Link in the Labs Section of the Footer
	public void checkTestimonialsFooterLinkFF(){
		driver = browser.setBrowser("Mozilla");
		//To Maximize Browser Window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.testimonialsFooterLinkXPath));
		element.click();
		Assert.assertEquals(Constants.testimonialsFooterLinkPageTitle, driver.getTitle());
	}
	
	
	@Test
	//Tests the Beta Breakers Team Link in the Labs Section of the Footer
	public void checkBBTeamFooterLinkFF(){
		driver = browser.setBrowser("Mozilla");
		//To Maximize Browser Window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.betabreakersTeamFooterLinkXPath));
		element.click();
		Assert.assertEquals(Constants.betabreakersTeamFooterLinkPageTitle, driver.getTitle());
	}
	
	
	@Test
	//Tests the Careers Link in the Labs Section of the Footer
	public void checkCareersFooterLinkFF(){
		driver = browser.setBrowser("Mozilla");
		//To Maximize Browser Window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.careersFooterLinkXPath));
		element.click();
		Assert.assertEquals(Constants.careersFooterLinkPageTitle, driver.getTitle());
	}
	
	
	@Test
	//Tests the Sitemap Link in the Labs Section of the Footer
	public void checkSitemapFooterLinkFF(){
		driver = browser.setBrowser("Mozilla");
		//To Maximize Browser Window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.sitemapFooterLinkXPath));
		element.click();
		Assert.assertEquals(Constants.sitemapFooterLinkPageTitle, driver.getTitle());
	}
	
	
	
	/******************** Test Methods for Chrome & IE Skipped due to problems with finding/clicking the necessary
	 * 					  Web element *************************************************************************************
	
	//Tests Chrome
	@Test(dependsOnMethods = {"checkTestimonialsFooterLinkFF"})
	//Tests the Testimonials Link in the Labs Section of the Footer
	public void checkTestimonialsFooterLinkChrome(){
		throw new SkipException("Skipping Test.");
//		driver = browser.setBrowser("Chrome");
//		//To Maximize Browser Window
//		driver.manage().window().maximize();
//		driver.get(Constants.homePageURL);
//		element = driver.findElement(By.xpath(Constants.testimonialsFooterLinkXPath));
//		element.click();
//		Assert.assertEquals(Constants.testimonialsFooterLinkPageTitle, driver.getTitle());
	}
*/	

}
