package com.Ranford.com.PageLibary.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

import Excel.ExcelDataDriven;
import TestBase.Base;
import Utility.Library;
import Utility.Validation;
import WebTable.Table;

public class Reprository extends Base {
	
	WebDriver driver;

	public void login() {
			HomePage.UserName_text(driver).sendKeys("Admin");
			HomePage.PassWord_text(driver).sendKeys("Admin");
			HomePage.LoginBTN(driver).click();
		if(Validation.IsTextIsPresent(driver, "Welcome to Admin"))
			{
				Reporter.log("login test pass");
			}else
			{
				Reporter.log("login test is failed");
				//Library.screenshort("login123");
				//Library.attachement("login fail");
			}
			
		}
		
//==========================================================================================================================================================================================================	
   public void launch(String browser) {
	  if(browser.equalsIgnoreCase("firefox"))
	  { 
		  System.setProperty("webdriver.gecko.driver","C:\\Users\\abhishek khemariya\\Desktop\\Raghu-sir-programing-class\\com.PageLibary.com\\src\\test\\java\\drivers\\geckodriver.exe");
		   driver = new FirefoxDriver();
	  }else {
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\abhishek khemariya\\Desktop\\Raghu-sir-programing-class\\com.PageLibary.com\\src\\test\\java\\drivers\\chromedriver.exe");
		   driver = new ChromeDriver();
	  }  
			driver.get("http://srssprojects.in/home.aspx");
		
	if(Validation.IsTextIsPresent(driver, "Welcome to Ranford Bank"))
		{
			Reporter.log("lanuch test pass");
		}else
		{
			Reporter.log("lanuch test is failed");
			//Library.screenshort("launch634764");
			//Library.attachement("login fail45");
		}
		
	}
//======================================================================================================================================================================================================
	public void branchCreation(String bname,String address1,String address2,String address3,String area,String zipcode,String country,String state,String city)   {
		try {
			Admin.branches_link(driver).click();
			Admin.newBranch_link(driver).click();
			NewBranchesPage.branchName_text(driver).sendKeys(bname);
			NewBranchesPage.address1_text(driver).sendKeys(address1);
			
			NewBranchesPage.address2_text(driver).sendKeys(address2);
			NewBranchesPage.address3_text(driver).sendKeys(address3);
			NewBranchesPage.area_text(driver).sendKeys(area);
			NewBranchesPage.zipcode_text(driver).sendKeys(zipcode);
		
			generic.dropdown(driver, getlocator("country"),country);
		
			generic.dropdown(driver, getlocator("state"),state);
		
			generic.dropdown(driver, getlocator("city"),city);
			NewBranchesPage.submit(driver).click();
			
			/*if(Validation.IsTextIsPresent(driver,"created Sucessfully"))
			{
				Reporter.log("Branch creation is passed");
			}else 
			{
				Reporter.log("Branch creation is failed");
			}*/
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
			}
//====================================================================================================================================================================================================================
	public void roleCreation(String rname,String rdec,String rtype) {
		Admin.roles_link(driver).click();
		RolesPage.newRole_link(driver).click();
		RolesPage.Role_Name(driver).sendKeys(rname);
		RolesPage.Role_Dec(driver).sendKeys(rdec);
		generic.dropdown(driver, getlocator("roleType"), rtype);
	
		
		RolesPage.submitBtn(driver).click();
		/*	if (Validation.IsAlertPresent(driver, "Created Sucessfully")) {
				Reporter.log("pass");
				
			}else {
				Reporter.log("fail");
				Library.screenshort("role Failed");
			}
		*/
generic.alertHandle(driver);
	}
//======================================================================================================================================================================================================================
	public void userCreation(String urole,String ubranch,String ucustomerid,String uUsername,String uloginpwd,String uTxnpwd) {
		
		Admin.users_link(driver).click();
		UserPage.new_userBTN(driver).click();
		generic.dropdown(driver, getlocator("urole"),urole);
		generic.dropdown(driver,getlocator("ubranch"),ubranch);
		generic.dropdown(driver,getlocator("uid"),ucustomerid);
		//UserPage.Customer_Branch(driver).sendKeys("");
		//UserPage.Customer_Name(driver).sendKeys(uCustomername);
		UserPage.Customer_UserName(driver).sendKeys(uUsername);
		UserPage.Customer_LoginPassword(driver).sendKeys(uloginpwd);
		UserPage.Customer_TransactionPassword(driver).sendKeys(uTxnpwd);

		UserPage.submit(driver).click();
		
		if(Validation.IsAlertPresent(driver, "added Sucessfully"))
		{
			Reporter.log(" pass");
		}else
		{
			Reporter.log("fail");
			Library.screenshort("user creation");
		}
				generic.alertHandle(driver);
		}
	
//=====================================================================================================================================================================================================================	
	
	public void employeeCreation(String Ename,String Eloginpwd,String Erole,String EBranch) {
		Admin.employee_link(driver).click();
		NewEmployeePage.New_EmpBtn(driver).click();
		NewEmployeePage.E_EmployeeName(driver).sendKeys(Ename);
		NewEmployeePage.E_LoginPwd(driver).sendKeys(Eloginpwd);
		generic.dropdown(driver,getlocator("Erole"),Erole);
		generic.dropdown(driver,getlocator("Ebranch"),EBranch);
		NewEmployeePage.E_SubmitBtn(driver).click();
		if(Validation.IsAlertPresent(driver, "Successfully"))
		{
			Reporter.log("pass");
		}else {
			Reporter.log("fail");
			Library.screenshort("Employee Creation");
		}
		generic.alertHandle(driver);
	}
//=====================================================================================================================================================================================	
		
	public void operaionBranchTable() {
		Admin.branches_link(driver).click();
		Table.m(driver, getlocator("branchTable"), "edit", "77");
		BranchUpdationPage.Update_BTN(driver).click();
		if (Validation.IsAlertPresent(driver, "Branch updated Sucessfully")) {
			Reporter.log("branch edit test  pass");
			
		}else {
			Reporter.log("branch edit test  fail");
			Library.attachement("branchEdit failed");
		}
		generic.alertHandle(driver);

	}
//============================================================================================================================================================
public void operationRolesTable() {
	Admin.roles_link(driver).click();
	Table.m(driver, getlocator("roleTable"), "edit", "64");
	RolesUpdationPage.UpdateBTN(driver).click();
	if(Validation.IsAlertPresent(driver, "New Role updated Sucessfully")) {
		Reporter.log("role table edit pass");
	}else {
		Reporter.log("role table edit fail");
		Library.attachement("roletable update fail");
	}
	generic.alertHandle(driver);
}

//==============================================================================================================================================================

  public String[][] excelcontent(String filename,String sheetname)
  {
	  
	  ExcelDataDriven.excelconnection(filename, sheetname);
	  
	  int rc=ExcelDataDriven.rcount();
	 
	  int cc=ExcelDataDriven.ccount();
	  
	  String[][] data=new String[rc-1][cc];
	  
	  for(int r=1;r<rc;r++)
	  {
		  for(int c=0;c<cc;c++)
		  {
			 data[r-1][c]=ExcelDataDriven.readdata(c, r);
		  }
	  }
	return data;
	  
  }
  
//=================================================================================================================================================================






















	
	
}
