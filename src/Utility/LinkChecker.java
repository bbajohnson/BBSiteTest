package Utility;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinkChecker {
	
	public static void testWithXpath(WebDriver driver, String pageURL, String pageXPath, String pageTitle){
		WebElement element = null;
		driver.manage().window().maximize();
		driver.get(pageURL);
		element = driver.findElement(By.xpath(pageXPath));
		element.click();
		
		Assert.assertEquals(pageTitle, driver.getTitle());
	}
	
	
	public static void testWithURL(WebDriver driver, String initialPageURL, String pageXPath, String finalPageURL){
		WebElement element = null;
		driver.manage().window().maximize();
		driver.get(initialPageURL);
		element = driver.findElement(By.xpath(pageXPath));
		element.click();
		
		Assert.assertEquals(finalPageURL, driver.getCurrentUrl());
	}

}
