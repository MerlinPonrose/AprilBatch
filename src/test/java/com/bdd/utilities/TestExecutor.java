package com.bdd.utilities;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.bdd.pages.HomePage;
import com.bdd.pages.Loginpage;

import cucumber.api.java.Before;

public class TestExecutor {
	
	public static WebDriver driver;
	public static Common com = new Common();
	public static Loginpage loginpage = new Loginpage();
	public static HomePage hmpg = new HomePage();
	public static ExtentHtmlReporter reporter;
	public static ExtentReports reports;
	public static ExtentTest test;
	
	@Before
	public void createreport()
	{
		 reporter = new ExtentHtmlReporter("extentreport.html");
		 reports = new ExtentReports();
		reports.attachReporter(reporter);
	}
	
	
	public void generatereport()
	{
		reports.flush();
	}
	
	

}
