package com.framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class configDataProvider {
	
	
	public static String url;
	private static Properties pro;
	public static String username;
	private static String password;
	
	 configDataProvider(String urlName) throws IOException
	{
		System.out.println(urlName);
		File file = new File("./config/config.properties");
		FileInputStream fis = new FileInputStream(file);
		pro = new Properties();
		pro.load(fis);
		url = pro.getProperty(urlName);
		System.out.println("Printed: " + url);
		
	}
	
	public static String getUrl()
	{
		
		return url;
		
		
	}
	
	public static String getUsername()
	{
		
		username = pro.getProperty("username");
		System.out.println("Username :" + username );
		return username;
		
		
	}
	
	public static String getPassword()
	{
		
		password = pro.getProperty("password");
		return password;
		
		
	}
	
}
