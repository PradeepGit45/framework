package com.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	
	WebDriver driver;
	Actions action;
	
	
	ActionsClass(WebDriver d)
	{
		driver = d;
		action = new Actions(driver);
		
	}
	public  void scroll(int x, int y)
	{
		
		 action.scrollByAmount( x,  y).perform();;
		
	}
	
	public void dragAndDrop(WebElement A, WebElement B)
	{
		 action.dragAndDrop( A, B).perform();
		
		
	}
	
	public  void dragAndDrop(WebElement B, int x, int y)
	{
		 action.dragAndDropBy(B, x, y).perform();
		
		
	}
	
}
