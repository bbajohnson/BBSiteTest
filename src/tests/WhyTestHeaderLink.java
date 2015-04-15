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

public class WhyTestHeaderLink {
	
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
	public void checkWhyTestHeaderLinkFF(){
		driver = browser.setBrowser("Mozilla");
		//To Maximize Browser Window
		driver.manage().window().maximize();		
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.whyTestHeaderXPath));
		element.click();
		Assert.assertEquals(Constants.whyTestPageTitle, driver.getTitle());
	}
	
	//Tests Chrome
	@Test
	public void checkWhyTestHeaderLinkChrome(){
		driver = browser.setBrowser("Chrome");
		//To Maximize Browser Window
		driver.manage().window().maximize();		
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.whyTestHeaderXPath));
		element.click();
		Assert.assertEquals(Constants.whyTestPageTitle, driver.getTitle());
	}
	
/*	
	//Tests Internet Explorer
	@Test
	public void checkWhyTestHeaderLinkIE(){
		throw new SkipException("Skipping Test.");
//		driver = browser.setBrowser("IE");
//		//To Maximize Browser Window
//		driver.manage().window().maximize();		
//		driver.get(Constants.homePageURL);
//		element = driver.findElement(By.xpath(Constants.whyTestHeaderXPath));
//		element.click();
//		Assert.assertEquals(Constants.whyTestPageTitle, driver.getTitle());
	}
*/	
}
