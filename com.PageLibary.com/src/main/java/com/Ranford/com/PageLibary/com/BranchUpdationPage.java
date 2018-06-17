package com.Ranford.com.PageLibary.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import TestBase.Base;

public class BranchUpdationPage extends Base{
	public static WebElement UpdateBranchName_text(WebDriver driver){
		return driver.findElement(getlocator("updatebranchName"));
	}
	
	public static WebElement UpdateAdd1_text(WebDriver driver){
		return driver.findElement(getlocator("updatebranchadd1"));
	}
	public static WebElement UpdateAdd2_text(WebDriver driver){
		return driver.findElement(getlocator("updatebranchadd2"));
	}
	public static WebElement UpdateAdd3_text(WebDriver driver){
		return driver.findElement(getlocator("updatebranchadd3"));
	}
	
	public static WebElement UpdateArea_text(WebDriver driver){
		return driver.findElement(getlocator("updatebrancharea"));
	}
	public static WebElement UpdateCountry_text(WebDriver driver){
		return driver.findElement(getlocator("updatebranchcountry"));
	}
	public static WebElement UpdateZipCode_text(WebDriver driver){
		return driver.findElement(getlocator("updatebranchzipcode"));
	}
	public static WebElement UpdateState_text(WebDriver driver){
		return driver.findElement(getlocator("updatebranchstate"));
	}
	public static WebElement UpdateCity_text(WebDriver driver){
		return driver.findElement(getlocator("updatebranchcity"));
	}
	public static WebElement Update_BTN(WebDriver driver){
		return driver.findElement(getlocator("updateButton"));
	}
	public static WebElement Update_CancelBTN(WebDriver driver){
		return driver.findElement(getlocator("updatebranchcancel"));
	}

}
