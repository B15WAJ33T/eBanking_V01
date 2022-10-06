package com.eBanking.PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver ;
	
	public LoginPage (WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name = "uid")
	WebElement uid;
	
	@FindBy(name= "password")
	WebElement pwd; 
	
	@FindBy(name = "btnLogin")
	WebElement loginBtn;
	
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/ul[1]/li[15]/a[1]")
	WebElement logoutBtn;
	
	public void setUserName(String username)
	{
		uid.sendKeys(username);
	}
	
	public void setPassword(String password)
	{
		pwd.sendKeys(password);
	}
	
	public void clickBtn()
	{
		loginBtn.click();
	}
	
	public void clickLogout()
	{
		logoutBtn.click();
	}
		
	
	

}
