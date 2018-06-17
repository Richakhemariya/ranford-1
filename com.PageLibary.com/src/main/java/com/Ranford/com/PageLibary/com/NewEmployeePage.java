package com.Ranford.com.PageLibary.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import TestBase.Base;

public class NewEmployeePage extends Base{
	public static WebElement New_EmpBtn(WebDriver driver)
	{
		return driver.findElement(getlocator("newempBtn"));
	}

	public static WebElement E_EmployeeName(WebDriver driver)
	{
		return driver.findElement(getlocator("Eempname"));
	}

	public static WebElement E_LoginPwd(WebDriver driver)
	{
		return driver.findElement(getlocator("Eloginpwd"));
	}
	public static WebElement E_Role(WebDriver driver)
	{
		return driver.findElement(getlocator("Erole"));
	}
	public static WebElement E_Branch(WebDriver driver)
	{
		return driver.findElement(getlocator("Eempname"));
	}

	public static WebElement E_SubmitBtn(WebDriver driver)
	{
		return driver.findElement(getlocator("Esubmit"));
	}









}