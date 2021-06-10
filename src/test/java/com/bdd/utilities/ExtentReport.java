package com.bdd.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExtentHtmlReporter htmlreporter = new ExtentHtmlReporter("extentreport.html");
		ExtentReports report = new ExtentReports();
		report.attachReporter(htmlreporter);
		
		ExtentTest test = report.createTest("My First Report");
		test.log(Status.PASS, "test case passed");
		test.log(Status.FAIL, "test case failed");
		test.log(Status.INFO, "test information");
		
		report.flush();

	}

}
