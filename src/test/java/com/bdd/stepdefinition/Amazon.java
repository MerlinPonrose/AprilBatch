package com.bdd.stepdefinition;

import org.junit.Assert;

import com.bdd.utilities.TestExecutor;

import cucumber.api.java.en.Then;

public class Amazon extends TestExecutor{
	
	@Then("User verify page title is {string}")
	public void user_verify_page_title_is(String string) {
	   
		//Assert.assertTrue(hmpg.verifytitle(string));
		Assert.assertTrue("Page title is not equal", hmpg.verifytitle(string));
	}

}
