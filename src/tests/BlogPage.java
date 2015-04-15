package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import Utility.LinkChecker;					//Tests links and asserts the link is working correctly by comparing the page title
import Utility.Browsers;					//Page Object which handles browser selection, launch, and tear down.
import Utility.Constants;					//This lists the data that I'm referencing for Page title, Page URL,
											//Link IDs, Link XPaths, Link CSS Paths, and so on.  It was easier to keep 
											//track of them and modify them this way.

public class BlogPage {
	
	Browsers browser = new Browsers();
	WebDriver driver = null;
	WebElement element = null;
	
	//Closes browser window after every test.
	@AfterMethod
	public void quitBrowser(){
		browser.closeBrowser(driver);
	}
	

	@Test
	//Checks the Next link
	public void checkNextLink(){
		driver = browser.setBrowser("Mozilla");
		
		LinkChecker.testWithURL(driver, Constants.blogPageURL, "//*[@id='main']/nav/ol/li[9]/a",
								  "http://www.betabreakers.com/blog/page/2/");
	}
	
	
	@Test
	//Checks the Previous link
	public void checkPreviousLink(){
		driver = browser.setBrowser("Mozilla");
		
		LinkChecker.testWithURL(driver, "http://www.betabreakers.com/blog/page/2/", "//*[@id='main']/nav/ol/li[1]/a",
								Constants.blogPageURL);
	}

	
	@Test
	//Checks the numbered page links
	public void checkNumberedLinks(){
		driver = browser.setBrowser("Mozilla");
		
		//Navigates to the second page of the blog and checks the link for the first page
		LinkChecker.testWithURL(driver, "http://www.betabreakers.com/blog/page/2/", "//*[@id='main']/nav/ol/li[2]/a",
								Constants.blogPageURL);
		
		//Navigates to the second page of the blog, steps through each numbered link, and checks the URL to make
		//sure it is correct.
		for(int ii = 2; ii < 7; ++ii){
			String initialPage = "http://www.betabreakers.com/blog/page/" + ii + "/";
			String destinationPage = "http://www.betabreakers.com/blog/page/" + (ii + 1) + "/";
			String targetXPath = "//*[@id='main']/nav/ol/li[" + (ii + 2) + "]/a";
			LinkChecker.testWithURL(driver, initialPage, targetXPath, destinationPage);
		}
	}
	
	
	
	
	

}














