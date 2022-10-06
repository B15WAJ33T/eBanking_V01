package com.eBanking.TC;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.eBanking.PO.LoginPage;

public class LoginTest_001 extends BaseClass{
	
	@Test
	public void loginTest() throws IOException
	{
		driver.get(url);
		logger.info("Page URL is opened");
		
		LoginPage lip = new LoginPage(driver);
		
		lip.setUserName(username);
		logger.info("User name is set");
		
		lip.setPassword(password);
		logger.info("Password is set");
		
		lip.clickBtn();
		
		if( driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("login test_case passed");
		}
		else
		{
			screenShot(driver, "loginTest");
			Assert.assertTrue(false);
			logger.info("login test_case failed");
		
		}
		
		
		
	}

}
