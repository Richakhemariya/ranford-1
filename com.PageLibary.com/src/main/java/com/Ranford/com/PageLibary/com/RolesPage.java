package com.Ranford.com.PageLibary.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import TestBase.Base;

public class RolesPage extends Base{
	public static WebElement Role_Name(WebDriver driver)
	{
		return driver.findElement(getlocator("rolename"));
	}
	
	public static WebElement Role_Dec(WebDriver driver)
	{
		return driver.findElement(getlocator("roledesc"));
	}

	public static WebElement Role_Type(WebDriver driver)
	{
		return driver.findElement(getlocator("roleType"));
	}
	
	public static WebElement submitBtn(WebDriver driver)
	{
		return driver.findElement(getlocator("submit2"));
	}

	public static WebElement newRole_link(WebDriver driver) {
		
	 return driver.findElement(getlocator("newRoles"));
	}


}
