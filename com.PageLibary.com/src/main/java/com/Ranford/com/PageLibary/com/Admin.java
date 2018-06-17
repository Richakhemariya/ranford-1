package com.Ranford.com.PageLibary.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import TestBase.Base;

public class Admin extends Base{
	public static WebElement branches_link(WebDriver driver){
		return driver.findElement(getlocator("branches"));
		}
	
	public static WebElement roles_link(WebDriver driver){
		return driver.findElement(getlocator("roles"));		
	}
	
	public static WebElement users_link(WebDriver driver){
		return driver.findElement(getlocator("userBtn"));
	}

	public static WebElement employee_link(WebDriver driver){
		return driver.findElement(getlocator("employeeBtn"));
	}
	
	public static WebElement newBranch_link(WebDriver driver){
		return driver.findElement(getlocator("newBranch"));
	}
	
	public static WebElement newRoles_link(WebDriver driver){
		return driver.findElement(getlocator("newRoles"));
	}
	
	public static WebElement newUsers_link(WebDriver driver){
		return driver.findElement(getlocator("newUsers"));
	}
	
	public static WebElement newEmployee_link(WebDriver driver){
		return driver.findElement(getlocator("newEmployee"));
	}

}
