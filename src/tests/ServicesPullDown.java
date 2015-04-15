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

public class ServicesPullDown {
	
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
	//Tests the Functionality link in the Services Drop down in the Header
	public void checkServicesPullDown_Functionality_FF(){
		driver = browser.setBrowser("Mozilla");
		//To Maximize Browser Window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.servicesHeaderXPath));
		
		//This "hovers" over the Services pull down in order to activate the menu
		Actions menuBuilder = new Actions(driver);
		menuBuilder.moveToElement(element).perform();
		driver.findElement(By.xpath("//*[@id='menu-item-103']/a")).click();

		Assert.assertEquals(Constants.functionalityPageTitle, driver.getTitle());
	}
	
	
	@Test
	//Tests the Compatibility link in the Services Drop down in the Header
	public void checkServicesPullDown_Compatibility_FF(){
		driver = browser.setBrowser("Mozilla");
		//To Maximize Browser Window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.servicesHeaderXPath));
		
		//This "hovers" over the Services pull down in order to activate the menu
		Actions menuBuilder = new Actions(driver);
		menuBuilder.moveToElement(element).perform();
		driver.findElement(By.xpath("//*[@id='menu-item-109']/a")).click();
		
		Assert.assertEquals(Constants.compatibilityPageTitle, driver.getTitle());
	}
	@Test
	//Tests the Website testing link in the Services Drop down in the Header
	public void checkServicesPullDown_WebsiteTesting_FF(){
		driver = browser.setBrowser("Mozilla");
		//to Maximize Browser Window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.servicesHeaderXPath));
		
		//This "hovers" over the Services pull down in order to activate the menu
		Actions menuBuilder = new Actions(driver);
		menuBuilder.moveToElement(element).perform();
		driver.findElement(By.xpath("//*[@id='menu-item-108']/a")).click();
		
		Assert.assertEquals(Constants.websiteTestingPageTitle, driver.getTitle());
	}
	
	
	@Test
	//Tests the Mobile Device link in the Services Drop down in the Header
	public void checkServicesPullDown_MobileDevice_FF(){
		driver = browser.setBrowser("Mozilla");
		//To Maximize Browser Window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.servicesHeaderXPath));
		
		//this "hovers" over the Services pull down in order to activate the menu
		Actions menuBuilder = new Actions(driver);
		menuBuilder.moveToElement(element).perform();
		driver.findElement(By.xpath("//*[@id='menu-item-135']/a")).click();
		
		Assert.assertEquals(Constants.mobileTestingPageTitle, driver.getTitle());
	}
	
	
	@Test
	//Tests the Usability link in the Services drop down in the Header
	public void checkServicesPullDown_Usability_FF(){
		driver = browser.setBrowser("Mozilla");
		//To Maximize Browser Window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.servicesHeaderXPath));
		
		//This "hovers" over the Services pull down in order to activate the menu
		Actions menuBuilder = new Actions(driver);
		menuBuilder.moveToElement(element).perform();
		driver.findElement(By.xpath("//*[@id='menu-item-136']/a")).click();
		
		Assert.assertEquals(Constants.usabilityHeaderLinkPageTitle, driver.getTitle());
	}
	
	
	@Test
	//Tests the Test Plan Writing link in the Services drop down in the Header
	public void checkServicesPullDown_TPWriting_FF(){
		driver = browser.setBrowser("Mozilla");
		//To Maximize Browser Window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.servicesHeaderXPath));
		
		//This "hovers" over the Services pull down in order to activate the menu
		Actions menuBuilder = new Actions(driver);
		menuBuilder.moveToElement(element).perform();
		driver.findElement(By.xpath("//*[@id='menu-item-134']/a")).click();
		
		Assert.assertEquals(Constants.testPlanWritingHeaderLinkPageTitle, driver.getTitle());
	}
	
	@Test
	//Tests the Localization link in the Services drop down in the Header
	public void checkServicesPullDown_Localization_FF(){
		driver = browser.setBrowser("Mozilla");
		//To maximize the browser window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.servicesHeaderXPath));
		
		//This "hovers" over the Services pull down in order to activate the menu
		Actions menuBuilder = new Actions(driver);
		menuBuilder.moveToElement(element).perform();
		driver.findElement(By.xpath("//*[@id='menu-item-133']/a")).click();
		
		Assert.assertEquals(Constants.localizationHeaderLinkPageTitle, driver.getTitle());
	}
	
	
	@Test
	//Tests the Automation link in the Services drop down in the Header
	public void checkServicesPullDown_Automated_FF(){
		driver = browser.setBrowser("Mozilla");
		//Maximizes the browser window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.servicesHeaderXPath));
		
		//Hovers over the Services pull down in order to activate the menu
		Actions menuBuilder = new Actions(driver);
		menuBuilder.moveToElement(element).perform();
		driver.findElement(By.xpath("//*[@id='menu-item-132']/a")).click();
		
		Assert.assertEquals(Constants.automatedHeaderLinkPageTitle, driver.getTitle());
	}
	
	
	@Test
	//Tests the Load/Performance link in the Services drop down in the Header
	public void checkServicesPullDown_LoadPerf_FF(){
		driver = browser.setBrowser("Mozilla");
		//Maximizes the browser window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.servicesHeaderXPath));
		
		//Hovers over the Services pull down in order to activate the menu
		Actions menuBuilder = new Actions(driver);
		menuBuilder.moveToElement(element).perform();
		driver.findElement(By.xpath("//*[@id='menu-item-131']/a")).click();
		
		Assert.assertEquals(Constants.loadPerformanceFooterLinkPageTitle, driver.getTitle());
	}
	
	
	@Test
	//Tests the Accessibility link in the Services drop down in the Header
	public void checkServicesPullDown_Accessibility_FF(){
		driver = browser.setBrowser("Mozilla");
		//Maximizes the browser window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.servicesHeaderXPath));
		
		//Hovers over the Services pull down in order to activate the menu
		Actions menuBuilder = new Actions(driver);
		menuBuilder.moveToElement(element).perform();
		driver.findElement(By.xpath("//*[@id='menu-item-130']/a")).click();
		
		Assert.assertEquals(Constants.accessibilityHeaderLinkPageTitle, driver.getTitle());
	}
}








































