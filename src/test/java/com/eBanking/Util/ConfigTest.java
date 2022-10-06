package com.eBanking.Util;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigTest {
	
	Properties pro;
	
	public ConfigTest()
	{
		File src = new File("./Configuration/config.properties");
		
		try
		{
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		}
		catch(Exception e)
		{
			System.out.println("Exception is : "+ e.getMessage());
		}		
	}
	
	public String applicationUrl()
	{
		String url= pro.getProperty("PageUrl");
		return url;
	}
	
	public String getUsernam()
	{
		String useranme= pro.getProperty("UserName");
		return useranme;
	}
	
	public String getPassword()
	{
		String password= pro.getProperty("Password");
		return password;
	}
	
	public String chromePath()
	{
		String chrompath= pro.getProperty("ChromeDriver");
		return chrompath;
	}
	
	public String firefoxPath()
	{
		String firefoxpath= pro.getProperty("FirefoxDriver");
		return firefoxpath;
	}

}
