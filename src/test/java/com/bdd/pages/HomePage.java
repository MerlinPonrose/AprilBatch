package com.bdd.pages;

import com.bdd.utilities.TestExecutor;

public class HomePage extends TestExecutor{
	
	public boolean verifytitle(String ExpectedTitle)
	{
		return com.verifyPageTitle(ExpectedTitle);
	}
	
	public void clickcart()
	{
		///
	}

}
