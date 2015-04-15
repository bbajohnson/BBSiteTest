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

public class ContactHeaderLink {

	Browsers browser = new Browsers();
	WebDriver driver = null;
	WebElement element = null;
	
	//Closes browser window after every test.
	@AfterMethod
	public void quitBrowser(){
		browser.closeBrowser(driver);
	}
	
	//Tests Contact Link in Firefox
		@Test
		public void checkContactHeaderLinkFF(){
			driver = browser.setBrowser("Mozilla");
			//To Maximize Browser Window
			driver.manage().window().maximize();			
			driver.get(Constants.homePageURL);
			element = driver.findElement(By.xpath(Constants.contactHeaderXPath));
			element.click();
			Assert.assertEquals(Constants.contactPageTitle, driver.getTitle());
		}
		
		//Tests Contact Link in Chrome
		@Test
		public void checkContactHeaderLinkChrome(){
			driver = browser.setBrowser("Chrome");
			//To Maximize Browser Window
			driver.manage().window().maximize();			
			driver.get(Constants.homePageURL);
			element = driver.findElement(By.xpath(Constants.contactHeaderXPath));
			element.click();
			Assert.assertEquals(Constants.contactPageTitle, driver.getTitle());
		}
		
/*		
		//Tests Contact Link in Internet Explorer
		@Test
		public void checkContactHeaderLinkIE(){
			throw new SkipException("Skipping Test.");
//			driver = browser.setBrowser("IE");
//			//To Maximize Browser Window
//			driver.manage().window().maximize();			
//			driver.get(Constants.homePageURL);
//			element = driver.findElement(By.xpath(Constants.contactHeaderXPath));
//			element.click();
//			Assert.assertEquals(Constants.contactPageTitle, driver.getTitle());
		}
*/
}
