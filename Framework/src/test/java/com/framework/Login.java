package com.framework;

import org.testng.annotations.Test;

public class Login extends BaseClass {

	@Test
	
	void loginTest()
	{
		
		LogInPage loginPG = new LogInPage(driver);
		loginPG.sendName(configDataProvider.getUsername());
		loginPG.sendPassword(configDataProvider.getPassword());
		loginPG.clickButton();
		
	}
	
	
}
