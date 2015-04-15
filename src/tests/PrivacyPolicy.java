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

public class PrivacyPolicy {
	
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
	//Tests the Privacy Policy Link in the Labs Section of the Footer
	public void checkPrivacyPolicyFooterLinkFF(){
		driver = browser.setBrowser("Mozilla");
		//To Maximize Browser Window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.privacyPolicyFooterLinkXPath));
		element.click();
		Assert.assertEquals(Constants.privacyPolicyFooterLinkPageTitle, driver.getTitle());
	}
	
	
	//Tests Chrome
	@Test//(dependsOnMethods = {"checkPrivacyPolicyFooterLinkFF"})
	//Tests the Testimonials Link in the Labs Section of the Footer
	public void checkPrivacyPolicyFooterLinkChrome(){
//		throw new SkipException("Skipping Test.");
		driver = browser.setBrowser("Chrome");
		//To Maximize Browser Window
		driver.manage().window().maximize();
		driver.get(Constants.homePageURL);
		element = driver.findElement(By.xpath(Constants.privacyPolicyFooterLinkXPath));
		element.click();
		Assert.assertEquals(Constants.privacyPolicyFooterLinkPageTitle, driver.getTitle());
		
	}

}
