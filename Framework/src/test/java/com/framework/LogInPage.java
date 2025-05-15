package com.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {

	
	WebDriver driver;
	@FindBy(id = "username")
	WebElement username;
	
	@FindBy ( id = "password")
	WebElement password;
	
	@FindBy ( xpath = "//button[@type='submit']" )
	WebElement submit;
	
	 LogInPage(WebDriver d) {
		 driver = d;
		PageFactory.initElements(driver, this);
	}


void sendName(String name)
{
	username.sendKeys(name);
}

void sendPassword(String pass)
{
	password.sendKeys(pass);
}

void clickButton()
{
	submit.click();
}

}