package com.framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	
WebDriver driver;
String url;
	
	@Parameters("urlName")
	@BeforeClass
	
	void setUp(String urlName) throws IOException 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		new configDataProvider(urlName);
		driver.get(configDataProvider.getUrl());
	}
	
	
	
	




@AfterClass
	
	void close()
	{
		
	}
}
