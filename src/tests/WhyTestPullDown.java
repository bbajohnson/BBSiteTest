package tests;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Utility.Browsers;					//Page Object which handles browser selection, launch, and tear down.
import Utility.Constants;					//This lists the data that I'm referencing for Page title, Page URL,
											//Link IDs, Link XPaths, Link CSS Paths, and so on.  It was easier to keep 
											//track of them and modify them this way.

public class WhyTestPullDown {
	
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
	//Tests the Process link in the Why Test Drop down in the Header
	public void checkWhyTestPulldown_Process_FF(){
		driver = browser.setBrowser("Mozilla");
		//Maximize window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.whyTestHeaderXPath));
		
		//Hovers over the Why Test element to activate the pull down menu
		Actions menuBuilder = new Actions(driver);
		menuBuilder.moveToElement(element).perform();
		driver.findElement(By.xpath("//*[@id='menu-item-236']/a")).click();
		
		Assert.assertEquals(Constants.theProcesslinkInWhyTestMenuPageTitle, driver.getTitle());
	}
	
	
	@Test
	//Tests the Why Outsource link the Why Test drop down menu in the header
	public void checkWhyTestPullDown_WhyOutsource_FF(){
		driver = browser.setBrowser("Mozilla");
		//Maximize window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.whyTestHeaderXPath));
		
		//Hover over Why Test to activate menu
		Actions menuBuilder = new Actions(driver);
		menuBuilder.moveToElement(element).perform();
		driver.findElement(By.xpath("//*[@id='menu-item-261']/a")).click();
		
		Assert.assertEquals(Constants.whyOutsourceLinkInWhyTestMenuPageTitle, driver.getTitle());
	}
	
	
	@Test
	//Tests the Why Hire Beta Breakers link in the Why Test drop down in the header
	public void checkWhyTestPullDown_WhyHire_FF(){
		driver = browser.setBrowser("Mozilla");
		//Maximize the window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.whyTestHeaderXPath));
		
		//Hover over Why Test to activate menu
		Actions menuBuilder = new Actions(driver);
		menuBuilder.moveToElement(element).perform();
		driver.findElement(By.xpath("//*[@id='menu-item-416']/a")).click();
		
		Assert.assertEquals(Constants.whyHireLinkInWhyTestMenuPageTitle, driver.getTitle());
	}
	
	
	@Test
	//Tests the FAQ link in the Why Test drop down menu in the header
	public void checkWhyTestPullDown_FAQ_FF(){
		driver = browser.setBrowser("Mozilla");
		//Maximize window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.whyTestHeaderXPath));
		
		//Hover over Why Test to activate menu drop down
		Actions menuBuilder = new Actions(driver);
		menuBuilder.moveToElement(element).perform();
		driver.findElement(By.xpath("//*[@id='menu-item-174']/a")).click();
		
		Assert.assertEquals(Constants.FAQLinkInWhyTestMenuPageTitle, driver.getTitle());
	}
}




















