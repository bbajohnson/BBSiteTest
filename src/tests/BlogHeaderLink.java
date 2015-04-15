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

public class BlogHeaderLink {
	
	Browsers browser = new Browsers();
	WebDriver driver = null;
	WebElement element = null;
	
	//Closes browser window after every test.
	@AfterMethod
	public void quitBrowser(){
		browser.closeBrowser(driver);
	}

	//Tests Blog Link in Firefox
		@Test
		public void checkBlogHeaderLinkFF(){
			driver = browser.setBrowser("Mozilla");
			//To Maximize Browser Window
			driver.manage().window().maximize();
			driver.get(Constants.homePageURL);
			element = driver.findElement(By.xpath(Constants.blogHeaderXPath));
			element.click();
			Assert.assertEquals(Constants.blogPageTitle, driver.getTitle());
		}
		
		//Tests Blog Link in Chrome
		@Test
		public void checkBlogHeaderLinkChrome(){
			driver = browser.setBrowser("Chrome");
			//To Maximize Browser Window
			driver.manage().window().maximize();			
			driver.get(Constants.homePageURL);
			element = driver.findElement(By.xpath(Constants.blogHeaderXPath));
			element.click();
			Assert.assertEquals(Constants.blogPageTitle, driver.getTitle());
		}
		
/*		
		//Tests Blog Link in Internet Explorer
		@Test
		public void checkblogHeaderLinkIE(){
			throw new SkipException("Skipping Test.");
//			driver = browser.setBrowser("IE");
//			//To Maximize Browser Window
//			driver.manage().window().maximize();			
//			driver.get(Constants.homePageURL);
//			element = driver.findElement(By.xpath(Constants.blogHeaderXPath));
//			element.click();
//			Assert.assertEquals(Constants.blogPageTitle, driver.getTitle());
		}
*/
}
