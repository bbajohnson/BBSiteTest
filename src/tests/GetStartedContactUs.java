package tests;

import org.junit.Assert;					//For the Thank you for your submission page check
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Utility.Browsers;					//Page Object which handles browser selection, launch, and tear down.
import Utility.Constants;					//This lists the data that I'm referencing for Page title, Page URL,
											//Link IDs, Link XPaths, Link CSS Paths, and so on.  It was easier to keep 
											//track of them and modify them this way.

public class GetStartedContactUs {
	
	Browsers browser = new Browsers();
	WebDriver driver = null;
	WebElement element = null;
	
	//Closes browser window after every test.
	@AfterMethod
	public void quitBrowser(){
		browser.closeBrowser(driver);
	}
	
	
	@Test
	//Tests the page response to clicking the Submit button with none of
	//the mandatory fields filled out.
	public void emptyTextFieldsTest(){
		driver = browser.setBrowser("Mozilla");
		//Maximize window
		driver.manage().window().maximize();
		driver.get(Constants.contactPageURL);
		
		//Enter no data just hit the submit button
		driver.findElement(By.xpath("//*[@id='gform_submit_button_1']")).click();
		//Check for error message
		Assert.assertTrue("Error message was not present after clicking Submit button with empty mandatory fields.",
						  driver.findElement(By.cssSelector(".validation_error")).isDisplayed());
		
	}
	
	
	@Test
	//Tests Populated Name field, all others empty
	public void justNameFieldPopulated(){
		driver = browser.setBrowser("Mozilla");
		//Maximize window
		driver.manage().window().maximize();
		driver.get(Constants.contactPageURL);

		//Enters data into the Name field
		driver.findElement(By.xpath("//*[@id='input_1_1']")).sendKeys("Test Name Data");
		
		//Enter no data in the remaining fields and hit the submit button
		driver.findElement(By.xpath("//*[@id='gform_submit_button_1']")).click();
		
		//Check for error message
		Assert.assertTrue("Error message was not present after clicking Submit button with only the Name field populated.",
						   driver.findElement(By.cssSelector(".validation_error")).isDisplayed());	
	}
	
	
	@Test
	//Tests a bad email address
	public void badEmailAddress(){
		driver = browser.setBrowser("Mozilla");
		//Maximize window
		driver.manage().window().maximize();
		driver.get(Constants.contactPageURL);

		//Enters data into the Name field
		driver.findElement(By.xpath("//*[@id='input_1_1']")).sendKeys("Test Name Data");
		
		//Enters data into the Company Name field
		driver.findElement(By.xpath("//*[@id='input_1_2']")).sendKeys("Test Company Name Data");
		
		//Enters data into the Email field
		driver.findElement(By.xpath("//*[@id='input_1_3']")).sendKeys("A8ad3ma1lAddre55withsp#c1a&CHars!!!");
		
		//Enters data into the Phone Number field
		driver.findElement(By.xpath("//*[@id='input_1_9']")).sendKeys("(415) 878 - 2990");
		
		//Enters data in the Message field
		driver.findElement(By.xpath("//*[@id='input_1_5']")).sendKeys
						  ("Test Message:  The quick brown fox jumps over the lazy dog.");
		
		//Hit the Submit button
		driver.findElement(By.xpath("//*[@id='gform_submit_button_1']")).click();
		
		//Check for error message
		Assert.assertTrue("Error message was not present after clicking Submit button with a bad email address.",
						  driver.findElement(By.cssSelector(".validation_error")).isDisplayed());
		
	}
	
	
	@Test
	//Javascript in the Message text body
	public void javascriptTestInMessageField() throws InterruptedException{
		driver = browser.setBrowser("Mozilla");
		//Maximize window
		driver.manage().window().maximize();
		driver.get(Constants.contactPageURL);

		//Enters java script into the Message field
		driver.findElement(By.xpath("//*[@id='input_1_5']")).sendKeys
						  ("<script type='text/javascript'> alert('Alert Script in Message Field'); </script>");
		
		//Hit the Submit button
		driver.findElement(By.xpath("//*[@id='gform_submit_button_1']")).click();
				
		//Check for error message
		Assert.assertTrue("Error message was not present after clicking Submit button with javascript in the message field.",
						  driver.findElement(By.cssSelector(".validation_error")).isDisplayed());
		Thread.sleep(5000);
	}
	
	
	@Test
	//Tests the text fields in the Services page
	public void textField() throws InterruptedException{
		driver = browser.setBrowser("Mozilla");
		//Maximize window
		driver.manage().window().maximize();
		driver.get(Constants.contactPageURL);

		//Enters data into the Name field
		driver.findElement(By.xpath("//*[@id='input_1_1']")).sendKeys("Test Name Data");
		
		//Enters data into the Company Name field
		driver.findElement(By.xpath("//*[@id='input_1_2']")).sendKeys("Test Company Name Data");
		
		//Enters data into the Email field
		driver.findElement(By.xpath("//*[@id='input_1_3']")).sendKeys("bb20@betabreakers.com");
		
		//Enters data into the Phone Number field
		driver.findElement(By.xpath("//*[@id='input_1_9']")).sendKeys("(415) 878 - 2990");
		
		//Enters data in the Message field
		driver.findElement(By.xpath("//*[@id='input_1_5']")).sendKeys
						  ("Test Message:  The quick brown fox jumps over the lazy dog.");

		//Submits the data - ONLY UNCOMMENT THIS TO RUN IT ONCE, OTHERWISE LEAVE THIS COMMENTED OUT.
//		driver.findElement(By.xpath("//*[@id='gform_submit_button_1']")).click();
//		Assert.assertEquals(Constants.thankYouSubmssionPageTitle, driver.getTitle());
//		Thread.sleep(2000);

	}

}
