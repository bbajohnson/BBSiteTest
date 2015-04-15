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

public class TestimonialLinks {
	
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
	//Tests Cisco Testimonial Link
	public void checkCiscoTestimonialLinkFF(){
		driver = browser.setBrowser("Mozilla");
		//To Maximize Browser Window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.ciscoTestimonialXPath));
		element.click();
		Assert.assertEquals(Constants.ciscoTestimonialPageTitle, driver.getTitle());
	}
	
	@Test
	//Tests Oracle Testimonial Link
	public void checkOracleTestimonialLinkFF(){
		driver = browser.setBrowser("Mozilla");
		//To Maximize Browser Window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.oracleTestimonialXPath));
		element.click();
		Assert.assertEquals(Constants.oracleTestimonialPageTitle, driver.getTitle());
	}
	
	@Test
	//Tests Scripps Testimonial Link
	public void checkScrippsTestimonialLinkFF(){
		driver = browser.setBrowser("Mozilla");
		//To Maximize Browser Window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.scrippsTestimonialXPath));
		element.click();
		Assert.assertEquals(Constants.scrippsTestimonialPageTitle, driver.getTitle());
	}
	
	@Test
	//Tests Leap Frog Testimonial Link
	public void checkLeapFrogTestimonialLinkFF(){
		driver = browser.setBrowser("Mozilla");
		//To Maximize Browser Window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.leapfrogTestimonialXPath));
		element.click();
		Assert.assertEquals(Constants.leapfrogTestimonialPageTitle, driver.getTitle());
	}
	
	@Test
	//Tests Snap On Testimonial Link
	public void checkSnapOnTestimonialLinkFF(){
		driver = browser.setBrowser("Mozilla");
		//To Maximize Browser Window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.snaponTestimonalXPath));
		element.click();
		Assert.assertEquals(Constants.snaponTestimonalPageTitle, driver.getTitle());
	}
	
	@Test
	//Tests Trek Testimonial Link
	public void checkTrekTestimonialLinkFF(){
		driver = browser.setBrowser("Mozilla");
		//To Maximize Browser Window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.trekTestimonialXPath));
		element.click();
		Assert.assertEquals(Constants.trekTestimonialPageTitle, driver.getTitle());
	}
	
	
	
	
	/******************** Test Methods for Chrome & IE Skipped due to problems with finding/clicking the necessary
	 * 					  Web element *************************************************************************************
	
	//Tests Chrome
		@Test
		//Tests Cisco Testimonial Link
		public void checkCiscoTestimonialLinkChrome(){
			throw new SkipException("Skipping Test.");
//			driver = browser.setBrowser("Chrome");
//			//To Maximize Browser Window
//			driver.manage().window().maximize();
//			driver.get(Constants.homePageURL);
//			element = driver.findElement(By.xpath(Constants.ciscoTestimonialXPath));
//			element.click();
//			Assert.assertEquals(Constants.ciscoTestimonialPageTitle, driver.getTitle());
		}
*/	

}




















