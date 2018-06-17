package com.Ranford.com.PageLibary.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import TestBase.Base;

public class RolesUpdationPage extends Base {
	public static WebElement UpdateRoleName_text(WebDriver driver){
		return driver.findElement(getlocator("rolesupdatename"));
	}
	
	public static WebElement UpdateRoleDec_text(WebDriver driver){
		return driver.findElement(getlocator("rolesupdatedes"));
	}	
		public static WebElement UpdateBTN(WebDriver driver){
			return driver.findElement(getlocator("roleupdateBtm"));
}}
