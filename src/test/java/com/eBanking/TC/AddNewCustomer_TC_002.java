package com.eBanking.TC;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.eBanking.PO.AddCustomerDetailsPage;
import com.eBanking.PO.LoginPage;

public class AddNewCustomer_TC_002 extends BaseClass {
	
	@Test
	public void addCustomer() throws InterruptedException, IOException
	{
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickBtn();
		logger.info("Logged in to page");
		Thread.sleep(5000);
		
		logger.info("Adding a new customer");
		AddCustomerDetailsPage addcust = new AddCustomerDetailsPage(driver);
		addcust.clickAddCustomer();
		addcust.setUserName("Biswajit");
		addcust.setGender("male");
		addcust.setDob("30", "05", "1993");
		Thread.sleep(5000);
		addcust.setAddress("Madhabereni");
		addcust.setCity("Bhubaneswar");
		addcust.setState("Odisha");
		addcust.setPin("364378");
		addcust.setMobileNumber("976485369");
		String email = random()+"@gmail.com";
		addcust.setEmail(email);
		addcust.setPassword("dgsutk");
		addcust.clickSubmitBtn();
		
		Thread.sleep(5000);
		
		boolean res =driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		logger.info("Validating user data");
		if (res==true)
		{
			Assert.assertTrue(true);
			logger.info("Test case passd");
		}
		else
		{
			logger.info("Test case failed");
			screenShot(driver, "addCustomer");
			Assert.assertTrue(false);
		}
	
	}
	
	public String random()
	{
		String generatedString = RandomStringUtils.randomAlphabetic(8);
		return generatedString ;
		
	}

}
