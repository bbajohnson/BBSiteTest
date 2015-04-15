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

public class TheLabsPullDown {
	
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
	//Tests the Mobile Devices link in the Labs Drop down in the Header
	public void checkTheLabsPullDown_MobileDevices_FF(){
		driver = browser.setBrowser("Mozilla");
		//Maximize the window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.theLabsHeaderXPath));
		
		//Hover over The Labs to activate the drop down menu
		Actions menuBuilder = new Actions(driver);
		menuBuilder.moveToElement(element).perform();
		driver.findElement(By.xpath("//*[@id='menu-item-273']/a")).click();
		
		Assert.assertEquals(Constants.mobileTestingInTheLabsMenuPageTitle, driver.getTitle());
	}
	
	
	@Test
	//Tests the PC Systems link the Labs drop down menu in the header
	public void checkTheLabsPullDown_PCSystems_FF(){
		driver = browser.setBrowser("Mozilla");
		//Maximize window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.theLabsHeaderXPath));
		
		//Hover over the Labs to activate the pull down menu
		Actions menuBuilder = new Actions(driver);
		menuBuilder.moveToElement(element).perform();
		driver.findElement(By.xpath("//*[@id='menu-item-153']/a")).click();
		
		Assert.assertEquals(Constants.pcSystemsFooterLinkPageTitle, driver.getTitle());
	}
	
	
	@Test
	//Tests the Mac link in the Labs drop down menu in the header
	public void checkTheLabsPullDown_Mac_FF(){
		driver = browser.setBrowser("Mozilla");
		//Maximize the window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.theLabsHeaderXPath));
		
		//Hovers over the Labs to activate the pull down menu
		Actions menuBuilder = new Actions(driver);
		menuBuilder.moveToElement(element).perform();
		driver.findElement(By.xpath("//*[@id='menu-item-152']/a")).click();
		
		Assert.assertEquals(Constants.macSystemsFooterLinkPageTitle, driver.getTitle());
	}
	
	
	@Test
	//Tests the Laptops link in the Labs drop down menu in the header
	public void checkTheLabsPullDown_Laptops_FF(){
		driver = browser.setBrowser("Mozilla");
		//Maximize window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.theLabsHeaderXPath));
		
		//Hover over the Labs to activate the drop down menu
		Actions menuBuilder = new Actions(driver);
		menuBuilder.moveToElement(element).perform();
		driver.findElement(By.xpath("//*[@id='menu-item-151']/a")).click();
		
		Assert.assertEquals(Constants.laptopsFooterLinkPageTitle, driver.getTitle());
	}
	
	
	@Test
	//Tests the Video Card link in the Labs pull down menu in the header
	public void checkTheLabsPullDown_VideoCards_FF(){
		driver = browser.setBrowser("Mozilla");
		//Maximize window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.theLabsHeaderXPath));
		
		//Hovers over the Labs to activate the pull down menu
		Actions menuBuilder = new Actions(driver);
		menuBuilder.moveToElement(element).perform();
		driver.findElement(By.xpath("//*[@id='menu-item-150']/a")).click();
		
		Assert.assertEquals(Constants.videoCardsFooterLinkPageTitle, driver.getTitle());
	}

}
























