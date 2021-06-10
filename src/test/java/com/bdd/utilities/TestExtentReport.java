package com.bdd.utilities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class TestExtentReport {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		ExtentHtmlReporter htmlreporter = new ExtentHtmlReporter("extentreport.html");
		ExtentReports report = new ExtentReports();
		report.attachReporter(htmlreporter);
		
		ExtentTest test = report.createTest("Alert dismiss");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Karen Amy\\eclipse-workspace\\AprilSelenium\\exe\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize(); // maximizing the browser
		driver.get("http://demo.automationtesting.in/Alerts.html"); //open URL
		
		
		String title = driver.getTitle();
		if(title.contains("Hello"))
		{
			test.log(Status.PASS, "Alert page is opened");
		}
		else
		{
			test.log(Status.FAIL, "Alert page is not opened");
		}
		
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		
		driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']")).click();
		
		Alert alert = driver.switchTo().alert();
	
		Thread.sleep(5000);
		alert.dismiss();
		
		report.flush();
	}

}
