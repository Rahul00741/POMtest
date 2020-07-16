package com.TestCases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseClass.Library;
import com.Pages.OrangeHRM_Admin_Configuration_EmailSubscriptions;

//import com.Pages.OrangeHRM_Admin_Configuration_EmailConfiguration;

import com.Pages.OrangeHRM_Login_Page;
//import com.SeleniumUtility.SeleniumUtility;

public class OrangeHRM_Admin_Configuration_EmailSubscriptions_TestCase extends Library {
	
	OrangeHRM_Login_Page login;
	//OrangeHRM_Admin_Configuration_EmailSubscriptions emailsubscriptions;
	//SeleniumUtility selut = new SeleniumUtility(driver);
	OrangeHRM_Admin_Configuration_EmailSubscriptions emailsubscriptions;
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
	public void Admin_EmailSubscription() throws InterruptedException {
		
		emailsubscriptions = new OrangeHRM_Admin_Configuration_EmailSubscriptions(driver);
		emailsubscriptions.AdminLink();
		emailsubscriptions.Admin_Configuration();
		emailsubscriptions.Admin_Configuration_EmailSubscriptions();
		emailsubscriptions.Admin_Configuration_EmailSubscriptions_Editbtn();
		//emailsubscriptions.EnableEmaiNotiffication();
		emailsubscriptions.Admin_Configuration_EmailSubscriptions_Savebtn();
		
	}
	@AfterClass
	public void teardown() {
		
		
		closeApp();
	}
}
