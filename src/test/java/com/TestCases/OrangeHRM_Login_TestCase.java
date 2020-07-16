package com.TestCases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BaseClass.Library;
import com.Pages.OrangeHRM_Login_Page;
import com.SeleniumUtility.Selenium_Utility;

public class OrangeHRM_Login_TestCase extends Library{
	
	OrangeHRM_Login_Page login;
	Selenium_Utility selut;
	
	@BeforeClass
	public void Start() throws IOException {
		launchApp();
	}
	
	@Test
	public void Login() {
		login=new OrangeHRM_Login_Page(driver);
		
		login.Login("Admin", "admin123");
		login.Login_button();
	}
	
	@AfterClass
	public void teardown() {
		//selut.snapshot("LoginPage");
		closeApp();
	}

}
