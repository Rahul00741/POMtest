package com.TestCases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BaseClass.Library;
import com.Pages.OrangeHRM_Admin_Page;
import com.Pages.OrangeHRM_Leave_AssignLeave;
import com.Pages.OrangeHRM_Login_Page;

public class OrangeHRM_Leave_AssignLeave_TestCase extends Library{
	
	OrangeHRM_Login_Page login;
	OrangeHRM_Leave_AssignLeave assignLeave;

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
	public void Admin() throws InterruptedException {
		assignLeave=new OrangeHRM_Leave_AssignLeave(driver);
		assignLeave.Leave_leavelink();
		assignLeave.Leave_AssignLeave();
		assignLeave.Leave_AssignLeave_EmployeeName("Hannah Flores");
		assignLeave.Leave_AssignLeave_LeaveTypeDropdwon("FMLA US");
		
		assignLeave.Leave_AssignLeave_FromDate("2020-06-03");
//		Thread.sleep(5000);
		
		assignLeave.Leave_AssignLeave_ToDate("2020-06-03");
//		Thread.sleep(5000);
		assignLeave.Leave_AssignLeave_DurationDropdwon("Full Day");
		assignLeave.Leave_AssignLeave_Assignbtn();
	}
	@AfterClass
	public void teardown() {
		//to_take_screenshot(prop.getProperty("AssignLeave"));
		closeApp();
	}
	
}
