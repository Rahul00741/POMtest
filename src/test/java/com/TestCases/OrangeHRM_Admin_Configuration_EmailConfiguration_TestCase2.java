package com.TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BaseClass.Library;
import com.Pages.OrangeHRM_Admin_Configuration_EmailConfiguration;
import com.Pages.OrangeHRM_Admin_Page;

import com.Pages.OrangeHRM_Login_Page;
//import com.SeleniumUtility.SeleniumUtility;

public class OrangeHRM_Admin_Configuration_EmailConfiguration_TestCase2 extends Library{
	
	OrangeHRM_Login_Page login;
	OrangeHRM_Admin_Configuration_EmailConfiguration  emailconfiguration;
	//SeleniumUtility selut = new SeleniumUtility(driver);

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
	public void Admin_EmailConfiguration() throws InterruptedException {
		
		emailconfiguration = new OrangeHRM_Admin_Configuration_EmailConfiguration(driver);
		emailconfiguration.AdminLink();
		emailconfiguration.Admin_Configuration();
		
		emailconfiguration.Admin_Configuration_EmailConfiguration();
		Thread.sleep(5000);
//		emailconfiguration.Admin_Configuration_EmailConfigurationDropDown();
//		Thread.sleep(5000);
		emailconfiguration.Admin_Configuration_EmailConfiguration_Editbtn();
		Thread.sleep(5000);
		emailconfiguration.Admin_Configuration_EmailConfiguration_MailSentAs("admin@gamil.com");
		Thread.sleep(500);
	    emailconfiguration.Admin_Configuration_EmailConfiguration_SendingMethodDropDown();
		//emailconfiguration.Admin_Configuration_EmailConfiguration_SendingMethodDropDown();
	
		Thread.sleep(5000);
		emailconfiguration.Admin_Configuration_EmailConfiguration_Savebtn();
		
		
		
	}
	@AfterClass
	public void teardown() {
		//to_take_screenshot(prop.getProperty("AssignLeave"));
		//selut.snapshot("Admin_Configuration_EmailConfiguration");
		closeApp();
	}
	
}
