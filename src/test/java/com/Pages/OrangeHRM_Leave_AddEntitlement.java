package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OrangeHRM_Leave_AddEntitlement {
	/**
	 * @author Rahul
	 */

		WebDriver driver;
		
		public OrangeHRM_Leave_AddEntitlement(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(id="menu_leave_viewLeaveModule")
		WebElement LeaveLink;
		
		
		@FindBy(id="menu_leave_Entitlements")
		WebElement Entitlements;
		
		@FindBy(id="menu_leave_addLeaveEntitlement")
		WebElement AddEntitlements;
		
		@FindBy(id="entitlements_filters_bulk_assign")
		WebElement AddMultipleEmp;
		
		@FindBy(id="entitlements_filters_location")
		WebElement Location;
		
		@FindBy(id="entitlements_filters_subunit")
		WebElement SubUnit;
		
		@FindBy(id="entitlements_leave_type")
		WebElement Leavetype;
		
		@FindBy(xpath="//select[contains(@id,'per')]")
		WebElement Leaveperiod;
		
		@FindBy(id="entitlements_entitlement")
		WebElement Entitlement;
		
		@FindBy(id="btnSave")
		WebElement Savebutton;
		
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
		
		//click on Leave >> Entitlements >> Add Entitlements
		public void Leave_AddEntitlements(){
			AddEntitlements.click();
		}
		
		// To add multiple employee select checkbox 
		public void Leave_AddMultipleEmp(){
			AddMultipleEmp.click();
		}
		
		//Enter the Location
		public void Leave_DropLocation(String text){
			selectdrop(Location, text);
		}
		
		//Select the Sub Unit
		public void Leave_DropSubUnit(String text){
			selectdrop(SubUnit, text);
		}
		
		
		//Select Leave Type
		public void Leave_DropLeavetype(String text){
			selectdrop(Leavetype, text);
		}
		
		// Select the Leave Period 
		public void Leave_DropLeaveperiod(String value){
			selectdrop(Leaveperiod, value);
		}
		
		//Enter the Entitlement 
		public void Leave_Entitlement(String entitlement) {
			Entitlement.sendKeys(entitlement);
		}
		
		//Click on Save Button 
		public void Leave_Savebutton(){
			Savebutton.click();
		}
}
