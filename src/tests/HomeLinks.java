package tests;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Utility.Browsers;
import Utility.Constants;

public class HomeLinks {
	Browsers browser = new Browsers();
	WebDriver driver = null;
	WebElement element = null;
	
	//Closes browser window after every test.
	@AfterMethod
	public void quitBrowser(){
		browser.closeBrowser(driver);
	}
	
	//Tests Logo in Firefox
	@Test
	public void checkLogoFF(){
		driver = browser.setBrowser("Mozilla");
		//To Maximize Browser Window
		driver.manage().window().maximize();		
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.logoXPath));
		element.click();
		Assert.assertEquals(Constants.homePageTitle, driver.getTitle());
	}
	
	//Tests Logo Chrome
	@Test
	public void checkLogoChrome(){
		driver = browser.setBrowser("Chrome");
		//To Maximize Browser Window
		driver.manage().window().maximize();		
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.logoXPath));
		element.click();
		Assert.assertEquals(Constants.homePageTitle, driver.getTitle());
	}
	


	//Tests Home Link in Firefox
		@Test
		public void checkHomeLinkFF(){
			driver = browser.setBrowser("Mozilla");
			//To Maximize Browser Window
			driver.manage().window().maximize();			
			driver.get(Constants.homePageURL);
			element = driver.findElement(By.xpath(Constants.homeHeaderXPath));
			element.click();
			Assert.assertEquals(Constants.homePageTitle, driver.getTitle());
		}
		
		//Tests Home Link in Chrome
		@Test
		public void checkHomeLinkChrome(){
			driver = browser.setBrowser("Chrome");
			//To Maximize Browser Window
			driver.manage().window().maximize();			
			driver.get(Constants.homePageURL);
			element = driver.findElement(By.xpath(Constants.homeHeaderXPath));
			element.click();
			Assert.assertEquals(Constants.homePageTitle, driver.getTitle());
		}
		
/*		
		//Tests Home Link in Internet Explorer
		@Test
		public void checkHomeLinkIE(){
			throw new SkipException("Skipping Test.");
//			driver = browser.setBrowser("IE");
//			//To Maximize Browser Window
//			driver.manage().window().maximize();			
//			driver.get(Constants.homePageURL);
//			element = driver.findElement(By.xpath(Constants.homeHeaderXPath));
//			element.click();
//			Assert.assertEquals(Constants.homePageTitle, driver.getTitle());
		}
		
		
		//Tests Logo Internet Explorer
		@Test
		public void checkLogoIE(){
			throw new SkipException("Skipping Test.");
//			driver = browser.setBrowser("IE");
//			//To Maximize Browser Window
//			driver.manage().window().maximize();		
//			driver.get(Constants.homePageURL);
//			element = driver.findElement(By.xpath(Constants.logoXPath));
//			element.click();
//			Assert.assertEquals(Constants.homePageTitle, driver.getTitle());
		}
*/		
}
