package com.bdd.stepdefinition;


import org.openqa.selenium.chrome.ChromeDriver;

import com.bdd.utilities.TestExecutor;

import cucumber.api.java.Before;



public class Hooks extends TestExecutor{
	
	@Before(order=0)
	public void lauchbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Karen Amy\\\\eclipse-workspace\\\\AprilSelenium\\\\exe\\\\chrome\\\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Before(order=1)
	public void maximizebrowser()
	{
		driver.manage().window().maximize();
	}
	
	@cucumber.api.java.After(order=0)
	public void closebrowser()
	{
		driver.close();
	}

}
