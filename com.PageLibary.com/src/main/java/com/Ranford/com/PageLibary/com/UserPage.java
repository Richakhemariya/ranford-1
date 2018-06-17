package com.Ranford.com.PageLibary.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import TestBase.Base;

public class UserPage extends Base{
	
	
	
	public static WebElement Customer_Role(WebDriver driver)
	{
		return driver.findElement(getlocator("role"));
	}

	public static WebElement Customer_Branch(WebDriver driver)
	{
		return driver.findElement(getlocator("branch"));
	}
	
	public static WebElement Customer_ID(WebDriver driver)
	{
		return driver.findElement(getlocator("customeid"));
	}
	
	public static WebElement Customer_Name(WebDriver driver)
	{
		return driver.findElement(getlocator("ucustomername"));
	}
	
	public static WebElement Customer_UserName(WebDriver driver)
	{
		return driver.findElement(getlocator("uusername"));
	}
	
	public static WebElement Customer_LoginPassword(WebDriver driver)
	{
		return driver.findElement(getlocator("uloginpwd"));
	}
	
	public static WebElement Customer_TransactionPassword(WebDriver driver)
	{
		return driver.findElement(getlocator("utxnpwd"));
	}
	
	public static WebElement submit(WebDriver driver)
	{
		return driver.findElement(getlocator("userSubmit"));
	}
	public static WebElement new_userBTN(WebDriver driver)
	{
		return driver.findElement(getlocator("newuser1"));
	}
	

}
