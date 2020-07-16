package com.TestCases;

import java.io.IOException;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import com.BaseClass.Library;

import com.Pages.OrangeHRM_Leave_AddEntitlement;
import com.Pages.OrangeHRM_Leave_EmpoyeeEntitlements;
import com.Pages.OrangeHRM_Login_Page;

public class OrangeHRM_Leave_EmployeeEntitlement_TestCase2 extends Library{

	
	OrangeHRM_Login_Page login;
	 OrangeHRM_Leave_EmpoyeeEntitlements empentitlement;
	
	@BeforeClass
	public void Start() throws IOException {
		launchApp();
	}
	
	@Test(priority=2)
	public void Login() {
		login=new OrangeHRM_Login_Page(driver);
		login.Login(prop.getProperty("uname"), prop.getProperty("pwd"));
		login.Login_button();
	}
	@Test(dependsOnMethods = "Login")
	public void Leave() throws InterruptedException {
		empentitlement =new OrangeHRM_Leave_EmpoyeeEntitlements(driver);
		empentitlement.Leave_leavelink();
		empentitlement.Leave_Entitlements();
		empentitlement.Leave_EmpEntitlements();
		empentitlement.Leave_Employee("Hannah Flores");
		empentitlement.Leave_DropLeaveType("FMLA US");
		empentitlement.Leave_DropLeavePeriod("2020-01-01 - 2020-12-31");
		empentitlement.Leave_SearchButton();

		
	}
	@AfterClass
	public void teardown() {
		to_take_screenshot(prop.getProperty("LoginScreen"));
		closeApp();
	}


}
