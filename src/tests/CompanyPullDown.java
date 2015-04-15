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

public class CompanyPullDown {
	
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
	//Tests the Testimonials link in the Company drop down in the Header
	public void checkCompanyPullDown_Testimonials_FF(){
		driver = browser.setBrowser("Mozilla");
		//Maximize window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.companyHeaderXPath));
		
		//Hover over Company to activate the pull down menu
		Actions menuBuilder = new Actions(driver);
		menuBuilder.moveToElement(element).perform();
		driver.findElement(By.xpath("//*[@id='menu-item-177']/a")).click();
		
		Assert.assertEquals(Constants.testimonialsFooterLinkPageTitle, driver.getTitle());
	}
	
	
	@Test
	//Tests the Team link in the Company pull down menu in the header
	public void checkCompanyPullDown_Team_FF(){
		driver = browser.setBrowser("Mozilla");
		//Maximize window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.companyHeaderXPath));
		
		//Hovers over Company to activate the pull down menu
		Actions menuBuilder = new Actions(driver);
		menuBuilder.moveToElement(element).perform();
		driver.findElement(By.xpath("//*[@id='menu-item-176']/a")).click();
		
		Assert.assertEquals(Constants.betabreakersTeamFooterLinkPageTitle, driver.getTitle());
	}
	
	
	@Test
	//Tests the Careers link in the Company pull down menu in the header
	public void checkCompanyPullDown_Careers_FF(){
		driver = browser.setBrowser("Mozilla");
		//Maximize window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.companyHeaderXPath));
		
		//Hovers over Company to activate the Company pull down menu
		Actions menuBuilder = new Actions(driver);
		menuBuilder.moveToElement(element).perform();
		driver.findElement(By.xpath("//*[@id='menu-item-175']/a")).click();
		
		Assert.assertEquals(Constants.careersFooterLinkPageTitle, driver.getTitle());
	}
}


















