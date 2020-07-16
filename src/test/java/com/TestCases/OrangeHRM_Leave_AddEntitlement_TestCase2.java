package com.TestCases;

import java.io.IOException;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import com.BaseClass.Library;

import com.Pages.OrangeHRM_Leave_AddEntitlement;
import com.Pages.OrangeHRM_Leave_EmpoyeeEntitlements;
import com.Pages.OrangeHRM_Login_Page;

public class OrangeHRM_Leave_AddEntitlement_TestCase2 extends Library{
	
	OrangeHRM_Login_Page login;
	 OrangeHRM_Leave_AddEntitlement addentitlement;
	
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
		addentitlement =new OrangeHRM_Leave_AddEntitlement(driver);
		addentitlement.Leave_leavelink();
		addentitlement.Leave_Entitlements();
		addentitlement.Leave_AddEntitlements();
		addentitlement.Leave_AddMultipleEmp();
//		Thread.sleep(5000);
		addentitlement.Leave_DropLocation("All");
		addentitlement.Leave_DropSubUnit("All");
		addentitlement.Leave_DropLeavetype("FMLA US");
		addentitlement.Leave_DropLeaveperiod("2020-01-01 - 2020-12-31");
		addentitlement.Leave_Entitlement("12");
		addentitlement.Leave_Savebutton();
	}
		
	
	@AfterClass
	public void teardown() {
		to_take_screenshot(prop.getProperty("LoginScreen"));
		closeApp();
	}


}
