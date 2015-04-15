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

public class FollowOurBlog {
	
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
	//Tests Follow Our Blog Link in the Body of the Homepage
	public void checkFollowOurBlogLinkFF(){
		driver = browser.setBrowser("Mozilla");
		//To Maximize Browser Window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.followOurBlogBodyLinkXPath));
		element.click();
		Assert.assertEquals(Constants.followOurBlogBodyLinkPageTitle, driver.getTitle());
	}
	
	
	@Test
	//Tests Project Management Tips Link in the Follow Our Blog section of the Homepage
	public void checkProjectManagementTipsLinkFF(){
		driver = browser.setBrowser("Mozilla");
		//To Maximize Browser Window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.projectManagementTipsBodyLinkXPath));
		element.click();
		Assert.assertEquals(Constants.projectManagementTipsBodyLinkPageTitle, driver.getTitle());
	}
	
	
	@Test
	//Tests Project Management Tips Link in the Follow Our Blog section of the Homepage
	public void checkProjectManagementTipsReadMoreLinkFF(){
		driver = browser.setBrowser("Mozilla");
		//To Maximize Browser Window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.projectManagementTipsReadMoreBodyLinkXPath));
		element.click();
		Assert.assertEquals(Constants.projectManagementTipsBodyLinkPageTitle, driver.getTitle());
	}
	
	
	@Test
	//Tests What Should be in Your Test Plan Link in the Follow Our Blog section of the Homepage
	public void checkWhatShouldBeInYourTestPlanLinkFF(){
		driver = browser.setBrowser("Mozilla");
		//To Maximize Browser Window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.whatShouldBeInYourTestPlanBodyLinkXPath));
		element.click();
		Assert.assertEquals(Constants.whatShouldBeInYourTestPlanBodyLinkPageTitle, driver.getTitle());
	}
	
	
	@Test
	//Tests What Should be in Your Test Plan Link in the Follow Our Blog section of the Homepage
	public void checkWhatShouldBeInYourTestPlanReadMoreLinkFF(){
		driver = browser.setBrowser("Mozilla");
		//To Maximize Browser Window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.whatShouldBeInYourTestPlanReadMoreBodyLinkXPath));
		element.click();
		Assert.assertEquals(Constants.whatShouldBeInYourTestPlanBodyLinkPageTitle, driver.getTitle());
	}
	
	
	@Test
	//Tests How QA Can Increase Your ROI Link in the Follow Our Blog section of the Homepage
	public void checkHowQACanIncreaseYourROILinkFF(){
		driver = browser.setBrowser("Mozilla");
		//To Maximize Browser Window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.howQACanIncreaseYourROIBodyLinkXPath));
		element.click();
		Assert.assertEquals(Constants.howQACanIncreaseYourROIBodyLinkPageTitle, driver.getTitle());
	}
	
	
	@Test
	//Tests How QA Can Increase Your ROI Link in the Follow Our Blog section of the Homepage
	public void checkHowQACanIncreaseYourROIReadMoreLinkFF(){
		driver = browser.setBrowser("Mozilla");
		//To Maximize Browser Window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.howQACanIncreaseYourROIBodyReadMoreLinkXPath));
		element.click();
		Assert.assertEquals(Constants.howQACanIncreaseYourROIBodyLinkPageTitle, driver.getTitle());
	}
	
	
	
	/******************** Test Methods for Chrome & IE Skipped due to problems with finding/clicking the necessary
	 * 					  Web element *************************************************************************************
	
	//Tests Chrome
	@Test(dependsOnMethods = {"checkFollowOurBlogLinkFF"})
	//Tests Follow Our Blog Link in the Body of the Homepage
	public void checkFollowOurBlogLinkChrome(){
		throw new SkipException("Skipping Test.");
//		driver = browser.setBrowser("Chrome");
//		//To Maximize Browser Window
//		driver.manage().window().maximize();
//		driver.get(Constants.homePageURL);
//		element = driver.findElement(By.xpath(Constants.followOurBlogBodyLinkXPath));
//		element.click();
//		Assert.assertEquals(Constants.followOurBlogBodyLinkPageTitle, driver.getTitle());
	}
*/	

}
