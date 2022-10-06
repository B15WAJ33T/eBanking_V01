package com.eBanking.PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerDetailsPage {
	
    WebDriver ldriver ;
	
	public AddCustomerDetailsPage (WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[1]/ul[1]/li[2]/a[1]")
	@CacheLookup
	WebElement addNewCustomer;
	
	@FindBy(how = How.NAME, using = "name")
	@CacheLookup
	WebElement userName;
	
	@FindBy(how = How.NAME, using = "rad1")
	@CacheLookup
	WebElement gender;
	
	@FindBy(how = How.ID_OR_NAME, using = "dob")
	@CacheLookup
	WebElement dob;
	
	@FindBy(how = How.NAME, using = "addr")
	@CacheLookup
	WebElement customerAddress;
	
	@FindBy(how = How.NAME, using = "city")
	@CacheLookup
	WebElement city;
	
	@FindBy(how = How.NAME, using = "state")
	@CacheLookup
	WebElement state;
	
	@FindBy(how = How.NAME, using = "pinno")
	@CacheLookup
	WebElement pincode;
	
	@FindBy(how = How.NAME, using = "telephoneno")
	@CacheLookup
	WebElement contactNum;
	
	@FindBy(how = How.NAME, using = "emailid")
	@CacheLookup
	WebElement email;
	
	@FindBy(how = How.NAME, using = "password")
	@CacheLookup
	WebElement password;
	
	@FindBy(how = How.NAME, using = "sub")
	@CacheLookup
	WebElement submitBtn;
	
	public void clickAddCustomer()
	{
		addNewCustomer.click();
	}
	
	public void setUserName(String name)
	{
		userName.sendKeys(name);
	}
	
	public void setGender(String cgendre)
	{
		gender.click();
	}
	
	public void setDob(String dd, String mm, String yy)
	{
		dob.sendKeys(dd);
		dob.sendKeys(mm);
		dob.sendKeys(yy);
	}
	
	public void setAddress(String address)
	{
		customerAddress.sendKeys(address);
	}
	
	public void setCity(String customerCity)
	{
		city.sendKeys(customerCity);
	}
	
	public void setState(String customerState)
	{
		state.sendKeys(customerState);
	}
	
	public void setPin(String pin)
	{
		pincode.sendKeys(pin);
	}
	
	public void setMobileNumber(String cellNum)
	{
		contactNum.sendKeys(cellNum);
	}
	
	public void setEmail(String emailId)
	{
		email.sendKeys(emailId);
	}
	
	public void setPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void clickSubmitBtn()
	{
		submitBtn.click();
	}

}
