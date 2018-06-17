package com.Ranford.com.PageLibary.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import TestBase.Base;

public class HomePage extends Base {

	public static  WebElement  UserName_text(WebDriver driver)
	{
		return driver.findElement(getlocator("username"));
		
	}

	public static  WebElement  PassWord_text(WebDriver driver)
	{
		return driver.findElement(getlocator("password"));
		
	}

	public static  WebElement  LoginBTN(WebDriver driver)
	{
		return driver.findElement(getlocator("login"));
		
	}
	
	
}
