package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OrangeHRM_Leave_AssignLeave

{
	//SeleniumUtility selut = new SeleniumUtility();

			public OrangeHRM_Leave_AssignLeave (WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			
			@FindBy(id="menu_leave_viewLeaveModule")
			WebElement LeaveLink;
			
			@FindBy(xpath="//a[text()='Assign Leave']")
			WebElement Leave_AssignLeave;
			
			@FindBy(id="assignleave_txtEmployee_empName")
			WebElement Leave_AssignLeave_EmployeeName;
			
			@FindBy(id="assignleave_txtLeaveType")
			WebElement Leave_AssignLeave_LeaveType;
			
			@FindBy(id="assignleave_txtFromDate")
			WebElement Leave_AssignLeave_FromDate;
			
			@FindBy(id="assignleave_txtToDate")
			WebElement Leave_AssignLeave_ToDate;
			
			@FindBy(id="assignleave_duration_duration")
			WebElement Leave_AssignLeave_Duration;
			
			@FindBy(id="assignleave_txtComment")
			WebElement Leave_AssignLeave_Comments;
			 
			@FindBy(id="assignBtn")
			WebElement Leave_AssignLeave_Assignbtn;
			
	
			public void Dropdown(WebElement element, String value) {
				Select select=new Select(element);
				select.selectByVisibleText(value);
			}
			
			
			//click on Leave Tab in Application 
			public void Leave_leavelink(){
				LeaveLink.click();
			}
			
			//click on Assign Leave in Leave Tab
			public void Leave_AssignLeave()
			{
				Leave_AssignLeave.click();
			}
			
			//Enter the employee name
			public void Leave_AssignLeave_EmployeeName(String emp)
			{
				Leave_AssignLeave_EmployeeName.sendKeys(emp);
			}
			
			
			//Select Leave Type
			public void Leave_AssignLeave_LeaveTypeDropdwon(String text)
			{
				Dropdown(Leave_AssignLeave_LeaveType,text);
			}
			
			//Select From Date  
			public void Leave_AssignLeave_FromDate(String date)
			{
				Leave_AssignLeave_FromDate.clear();
				Leave_AssignLeave_FromDate.sendKeys(date);
			}
			
			
			
			//Select Leave To Date
			public void Leave_AssignLeave_ToDate(String date)
			{
				Leave_AssignLeave_ToDate.clear();
				Leave_AssignLeave_ToDate.sendKeys(date);
			}
			
			
			
			//Select Leave Duration
			public void Leave_AssignLeave_DurationDropdwon(String text)
			{
				Dropdown(Leave_AssignLeave_Duration,text);
			}
			
			//Add comments
			public void Leave_AssignLeave_Comments(String cmt)
			{
				Leave_AssignLeave_Comments.sendKeys(cmt);
			}
			
			//Click on Assign Button
			public void Leave_AssignLeave_Assignbtn()
			{
				Leave_AssignLeave_Assignbtn.click();
			}
}
