package com.eBanking.TC;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.eBanking.PO.LoginPage;
import com.eBanking.Util.ExcelData;

public class DDTest_001 extends BaseClass {
	
	@Test(dataProvider ="LoginData")
	public void loginDDT(String username, String password) throws InterruptedException
	{
		LoginPage lp= new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Username is set.");
		lp.setPassword(password);
		logger.info("Password is set.");
		lp.clickBtn();
		Thread.sleep(20000);
		
		if (isAlertPresent()==true)
		{
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			logger.warn("Login failed");
		}
		else
		{
			Assert.assertTrue(true);
			logger.info("Login successful");
			lp.clickLogout();
			Thread.sleep(20000);
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
		}
	}
	 
	public boolean isAlertPresent()
	{
		try
		{
			
		    driver.switchTo().alert();
		    return true;
		}
		catch(NoAlertPresentException e)
		{
			return false;
		}
	}
	
	@DataProvider(name = "LoginData")
	String [][] getData() throws IOException
	{
		String path = "D:/User/Eclipse-workspace/eBanking_V01/src/test/java/com/eBanking/TD/LoginData.xlsx";
		
		int rowcount = ExcelData.getRowCount(path, "Sheet1");
		int colcount = ExcelData.getCellCount(path, "Sheet1", 1);
		String loginData[][] = new String[rowcount][colcount]; 
		
		for(int i=1; i<=rowcount; i++)
		{
			for(int j=0; j<colcount; j++)
			{
				loginData[i-1][j]= ExcelData.getCellData(path, "Sheet1", i, j);
			}
		}
		
		return loginData;
	}

}
