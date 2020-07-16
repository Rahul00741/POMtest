package com.SeleniumUtility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Selenium_Utility {
	WebDriver driver;

	public void Selenium_Utitlity(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void Selectdrop(WebElement element, String Value) {
		
		Select dropdown=new Select(element);
		dropdown.selectByVisibleText(Value);
	}
	
	public void SelectdropByIndex(WebElement element, int Index) {
		
		Select dropdown=new Select(element);
		dropdown.selectByIndex(Index);
	}
	
//	public void Take_Screenshot(String path) throws IOException {
//		
//		TakesScreenshot snap=(TakesScreenshot)driver;
//		File src=snap.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyDirectory(src, new File(path));
//		
//	}
	
	public void snapshot(String fileName)
	{
		String	path="./POMDemo/Screenshot/Screenshot";
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File(path+fileName+System.currentTimeMillis()+ ".png");
		try {
			FileUtils.copyFile(src, dest);
			//logger.info("ScreenShot taken in name of "+fileName);
		} catch (IOException e) {
			//logger.info("Error in taking ScreenShots");
		}
	}
	
	public void gettitle() {
		System.out.println(driver.getTitle());
	}
	
	
	public void verifylogo(boolean logo_Presence) {
		Assert.assertEquals(logo_Presence, true);
		
	}
	
}
