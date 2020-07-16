package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OrangeHRM_Leave_EmpoyeeEntitlements {
	/**
	 * @author Rahul
	 * @version
	 *  
	 */

		WebDriver driver;
		
		public OrangeHRM_Leave_EmpoyeeEntitlements(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(id="menu_leave_viewLeaveModule")
		WebElement LeaveLink;
		
		
		@FindBy(id="menu_leave_Entitlements")
		WebElement Entitlements;
		
		@FindBy(xpath="//a[contains(@id,'menu_leave_viewLeaveEntit')]")
		WebElement EmpEntitlements;
		
		@FindBy(xpath="//input[@type='text']")
		WebElement Employee;
		
		@FindBy(id="entitlements_leave_type")
		WebElement LeaveType;
		
		@FindBy(xpath="//select[contains(@id,'per')]")
		WebElement LeavePeriod;
				
		@FindBy(id="searchBtn")
		WebElement SearchButton;
		
		public void selectdrop(WebElement element, String value) {
			Select select=new Select(element);
			select.selectByVisibleText(value);
		}
		
		//click on Leave Tab in Application 
		public void Leave_leavelink(){
			LeaveLink.click();
		}
		
		//click on Leave >> Entitlements 
		public void Leave_Entitlements(){
			Entitlements.click();;
		}
		
		//click on Leave >> Entitlements >> Employee Entitlements 
		public void Leave_EmpEntitlements(){
			EmpEntitlements.click();;
		}
		
		// Enter the Employee Name
		public void Leave_Employee(String emp){
			Employee.sendKeys(emp);
		}
		
		//Select the Leave Type	
		public void Leave_DropLeaveType(String text){
			selectdrop(LeaveType, text);
		}
		
		//Select Leave Period 
		public void Leave_DropLeavePeriod(String text){
			selectdrop(LeavePeriod, text);
		}
		
		//Click on Search button 	
		public void Leave_SearchButton(){
			SearchButton.click();
		}
}
