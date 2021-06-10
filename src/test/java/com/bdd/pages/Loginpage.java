package com.bdd.pages;

import org.openqa.selenium.By;

import com.bdd.utilities.TestExecutor;

public class Loginpage extends TestExecutor{
	
	public static String emailid = "//input[@placeholder='E mail']";
	public static String password = "//input[@placeholder='Password']";
	

	
	public void enteremailid(String email)
	{
		com.clickElement(By.xpath(emailid));
		com.sendvalue(emailid, email);
	}
	
	public void enterpassword(String pass)
	{
		com.clickElement(By.xpath(password));
		com.sendvalue(password, pass);
	}
	
}
