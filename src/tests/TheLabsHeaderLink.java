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

public class TheLabsHeaderLink {
	
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
	public void checkTheLabsHeaderLinkFF(){
		driver = browser.setBrowser("Mozilla");
		//To Maximize Browser Window
		driver.manage().window().maximize();		
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.theLabsHeaderXPath));
		element.click();
		Assert.assertEquals(Constants.theLabsPageTitle, driver.getTitle());
	}
	
	//Tests Chrome
	@Test
	public void checkTheLabsHeaderLinkChrome(){
		driver = browser.setBrowser("Chrome");
		//To Maximize Browser Window
		driver.manage().window().maximize();		
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.theLabsHeaderXPath));
		element.click();
		Assert.assertEquals(Constants.theLabsPageTitle, driver.getTitle());
	}
	
/*	
	//Tests Internet Explorer
	@Test
	public void checkTheLabsHeaderLinkIE(){
		throw new SkipException("Skipping Test.");
//		driver = browser.setBrowser("IE");
//		//To Maximize Browser Window
//		driver.manage().window().maximize();		
//		driver.get(Constants.homePageURL);
//		element = driver.findElement(By.xpath(Constants.theLabsHeaderXPath));
//		element.click();
//		Assert.assertEquals(Constants.theLabsPageTitle, driver.getTitle());
	}
*/	
}
