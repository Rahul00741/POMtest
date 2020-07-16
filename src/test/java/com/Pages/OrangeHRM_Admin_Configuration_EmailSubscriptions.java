package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import com.SeleniumUtility.SeleniumUtility;
import com.SeleniumUtility.Selenium_Utility;

public class OrangeHRM_Admin_Configuration_EmailSubscriptions
{
	/**
	 *@author Rahul
	 */
	
	WebDriver driver;
	Selenium_Utility selut ;
	
	public OrangeHRM_Admin_Configuration_EmailSubscriptions(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@id='menu_admin_viewAdminModule']/b")
	WebElement AdminLink;
	
	@FindBy(xpath="(//*[@class='arrow'])[5]")
	WebElement Admin_Configuration;
	

	
	@FindBy(id= "menu_admin_viewEmailNotification")
	WebElement Admin_Configuration_EmailSubscriptions;
	
	@FindBy(xpath="//input[@name='btnEdit']")
	WebElement Admin_Configuration_EmailSubscriptions_Editbtn;
	
	@FindBy(id="ohrmList_chkSelectRecord_2")
	WebElement Admin_Configuration_EmailSubscriptions_Checkbox1;
	
	@FindBy(xpath="//input[@name='btnSave']")
	WebElement Admin_Configuration_EmailSubscriptions_Savebtn;
	
	
	//Click on Admin Link
	public void AdminLink(){
		AdminLink.click();
	}
	
	//Click on Admin Configuration
	public void Admin_Configuration()
	{
		Admin_Configuration.click();
	}
	
	//Click on email configuration
	public void Admin_Configuration_EmailSubscriptions()
	{
		Admin_Configuration_EmailSubscriptions.click();
	}
	
	//click on edit button
	public void Admin_Configuration_EmailSubscriptions_Editbtn()
	{
		Admin_Configuration_EmailSubscriptions_Editbtn.click();
	}
	
	//click on check box 
//	public void EnableEmaiNotiffication() throws InterruptedException
//	{
//		selut.checkbox_Checking(Admin_Configuration_EmailSubscriptions_Checkbox1);
//		
//	}
	
	//Click on Save button
	public void Admin_Configuration_EmailSubscriptions_Savebtn()
	{
		Admin_Configuration_EmailSubscriptions_Savebtn.click();
	}
}
