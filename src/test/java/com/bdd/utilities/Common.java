package com.bdd.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.Status;

import junit.framework.Assert;

public class Common extends TestExecutor{
	
	
	public void ClickByXpath(String xpath)
	{
		try
		{
			driver.findElement(By.xpath(xpath)).click();
			test.log(Status.PASS, "element is clicked");
		}
		catch (Exception e) {
			test.log(Status.FAIL, "element is not clicked");
		}
		
	}
	
	public void sendvalue(String xpath,String value)
	{
		WebElement ele =	driver.findElement(By.xpath(xpath));
		ele.click();
		ele.clear();
		ele.sendKeys(value);
	}
	
	public static void clickElement(By locator)
	{
		driver.findElement(locator).click();
	}
	
	public  boolean verifyPageTitle(String ExpectedTitle)
	{
		String actualtitle = driver.getTitle();
		if(actualtitle.contains(ExpectedTitle))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}
