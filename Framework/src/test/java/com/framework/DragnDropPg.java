package com.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DragnDropPg {

	WebDriver driver;
	@FindBy(id = "column-a")
	WebElement A;
	
	@FindBy(id = "column-b")
	WebElement B;
	
	 DragnDropPg(WebDriver d) {
		 driver = d;
		PageFactory.initElements(driver, this);
	}
	
	 
	 
	 public String getAText()
	 {
		String a = A.getText();
		
		return a;
	 }
	 
	 public String getBText()
	 {
		 
		String b = B.getText();
		
		return b;
	 }
	
	 
	 
	 
}
