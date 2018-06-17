package com.Ranford.com.PageLibary.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import TestBase.Base;

public class NewBranchesPage extends Base{
	public static WebElement branchName_text(WebDriver driver){
		return driver.findElement(getlocator("branchName"));
	}

	public static WebElement address1_text(WebDriver driver){
		return driver.findElement(getlocator("address1"));
	}


	public static WebElement address2_text(WebDriver driver){
		return driver.findElement(getlocator("address2"));
	}


	public static WebElement address3_text(WebDriver driver){
		return driver.findElement(getlocator("address3"));
	}


	public static WebElement area_text(WebDriver driver){
		return driver.findElement(getlocator("area"));
	}


	public static WebElement zipcode_text(WebDriver driver){
		return driver.findElement(getlocator("zipcode"));
	}


	public static WebElement submit(WebDriver driver){
		return driver.findElement(getlocator("submit1"));
	}

	public static WebElement reset(WebDriver driver){
		return driver.findElement(getlocator("reset"));
	}

	public static WebElement cancel(WebDriver driver){
		return driver.findElement(getlocator("cancel"));
	}
	
	



}
