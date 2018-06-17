package com.Ranford.com.PageLibary.com;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import Excel.ExcelDataDriven;
import TestBase.Base;

public class TestExecution extends Reprository {

	@Parameters({"browser"})
	@BeforeTest
	//@Test(priority=1)
	public void verify_launch(String browser) {
		
		launch(browser);
	}
//======================================================================================================================================================================================================
	
	@Test(priority=2)
	public void verify_login() {
		login();
    }
//======================================================================================================================================================================================================
	/*@DataProvider(name="branches")
	public String[][] verify_excelcontent()
	{
		return excelcontent("datadriven.xls", "BranchSheet");
	}
	@Test(priority=3,dataProvider="branches")
	public void verify_branchCreation(String bname,String address1,String address2,String address3,String area,String zipcode,String country,String state,String city) throws InterruptedException {
		branchCreation(bname,address1,address2,address3,area,zipcode,country,state,city);
	}*/
//======================================================================================================================================================================================================
	@Test(priority=3)
	public void excelcontent() throws InterruptedException
	{
		ExcelDataDriven.excelconnection("datadriven.xls", "BranchSheet");

		ExcelDataDriven.outputexcelconnection("datadriven.xls", "output.xls", "BranchSheet");

		int c=ExcelDataDriven.ccount();
		for(int r=1;r<ExcelDataDriven.rcount();r++)
		{

			branchCreation(ExcelDataDriven.readdata(0, r), ExcelDataDriven.readdata(1, r), ExcelDataDriven.readdata(2, r), ExcelDataDriven.readdata(3, r), ExcelDataDriven.readdata(4, r), ExcelDataDriven.readdata(5, r), ExcelDataDriven.readdata(6, r), ExcelDataDriven.readdata(7, r), ExcelDataDriven.readdata(8, r));
			String text=generic.alertHandle(driver).getText();
			generic.alertHandle(driver).accept();

			if(text.contains("created successufully"))
			{
				ExcelDataDriven.writedata(c++, r, "Test Passed");
				c--;
			}
			else if(text.contains("Already Exits"))
			{
				ExcelDataDriven.writedata(c++, r, "Test Failed");
				c--;
			}
			else
			{
				ExcelDataDriven.writedata(c++, r, "alert is not present");
				c--;
			}

		}
		ExcelDataDriven.saveworkbook();
	}

/*//============================================================================================================================================================	
	@Test(priority=4, groups="2")
	public void rolesexcelcontent() {
		ExcelDataDriven.excelconnection("datadriven.xls", "roleSheet");
		ExcelDataDriven.outputexcelconnection("datadriven.xls", "output.xls", "roleSheet");
		int c = ExcelDataDriven.ccount();
		for (int r = 1; r < ExcelDataDriven.rcount(); r++) {
			roleCreation(ExcelDataDriven.readdata(0, r), ExcelDataDriven.readdata(1, r), ExcelDataDriven.readdata(2, r));

			String text = generic.alertHandle(driver).getText();
			generic.alertHandle(driver).accept();
			if (text.contains("created successufully")) {

				ExcelDataDriven.writedata(c++, r, "Test Passed");
				c--;
			}else if(text.contains("Already Exits")) {
				ExcelDataDriven.writedata(c++, r, "Test Failed");
				c--;
			}
			else {
				ExcelDataDriven.writedata(c++, r, "alert not present");
				c--;
			}

		}
		ExcelDataDriven.saveworkbook();
	}
//==========================================================================================================================================	
	@Test(priority=5)
	public void userexcelcontent() {
		ExcelDataDriven.excelconnection("datadriven.xls","UserSheet");
		ExcelDataDriven.outputexcelconnection("datadriven.xls","output.xls","UserSheet");
		int c=ExcelDataDriven.ccount();
		for(int r=1;r<ExcelDataDriven.rcount();r++)
		{
			userCreation(ExcelDataDriven.readdata(0,r), ExcelDataDriven.readdata(1,r),ExcelDataDriven.readdata(2,r),ExcelDataDriven.readdata(3,r),ExcelDataDriven.readdata(4,r), ExcelDataDriven.readdata(5,r));
			String text=generic.alertHandle(driver).getText();
			generic.alertHandle(driver).accept();
			if (text.contains("created successufully")) {

				ExcelDataDriven.writedata(c++, r, "Test Passed");
				c--;
			}else if(text.contains("Already Exits")) {
				ExcelDataDriven.writedata(c++, r, "Test Failed");
				c--;
			}
			else {
				ExcelDataDriven.writedata(c++, r, "alert not present");
				c--;
			}
		}
		ExcelDataDriven.saveworkbook();

	}
//===========================================================================================================================================================================================================

	@DataProvider(name="roles")
	public String[][] verify_Rolesexcelcontent()
	{
		return excelcontent("datadriven.xls", "roleSheet");
	}	

	@Test(priority=4,dataProvider="roles")
	public void verify_rolesCreation(String rname,String rdec,String rtype) throws InterruptedException {
		roleCreation(rname,rdec,rtype);
	}
//==================================================================================================================================================================================================


	@DataProvider(name="user")
	public String[][] verify_Userexcelcontent()
	{
		return excelcontent("datadriven.xls", "UserSheet");
	}	

	@Test(priority=5,dataProvider="user")
	public void verify_userCreation(String urole,String ubranch,String ucustomerid,String uUsername,String uloginpwd,String uTxnpwd) throws InterruptedException {
		userCreation(urole,ubranch,ucustomerid,uUsername,uloginpwd,uTxnpwd);
	}
//==================================================================================================================================================================================================	

	@DataProvider(name="employee")
	public String[][] verify_emploiyeeexcelcontent()
	{
		return excelcontent("datadriven.xls", "EmployeeSheet");
	}	

	@Test(priority=6,dataProvider="employee")
	public void verify_employeeCreation(String Ename,String Eloginpwd,String ERole,String EBranch) throws InterruptedException {
		employeeCreation(Ename,Eloginpwd,ERole,EBranch);
	}
//=================================================================================================================================================================================================
@Test(priority=3)
public void varify_BranchTAbleEdit() {
	operaionBranchTable();
}

@Test(priority=4)
public void varify_RolesTableEdit() {
	operationRolesTable();

}

@AfterMethod
public void varify_closeBrowser() {
	driver.close();
}
*/
}