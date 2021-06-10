package com.bdd.stepdefinition;


import org.openqa.selenium.chrome.ChromeDriver;
import com.bdd.utilities.TestExecutor;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Login extends TestExecutor{
	
	@Given("User launches the browser and open demosite URL {string}")
	public void user_launches_the_browser_and_open_demosite_URL(String url) {
	
	driver.get(url);
	   
	}

	@When("User enter emailid {string} in username textbox")
	public void user_enter_emailid_in_username_textbox(String email) {
		
		loginpage.enteremailid(email);
	   
	}

	@When("User enter password {string} in password textbox")
	public void user_enter_password_in_password_textbox(String pass) {
		loginpage.enterpassword(pass);
	}

	

}
