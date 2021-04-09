package com.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.TestBase;

public class HomePage extends TestBase
{

	@FindBy(xpath = "//button[@aria-label='Profile']")
	WebElement profileicon;
	
	@FindBy(xpath = "//button[@aria-label='edit profile']")
	WebElement editprofile;
	
	@FindBy(id = "editPicture")
	WebElement editpic;
	
	@FindBy(id = "saveProfile")
	WebElement savebutton;
	
	
	//Initializing the page objects
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Actions
	public void verifyProfilePicture() throws AWTException
	{
		Robot robot=new Robot();
		profileicon.click();
		editprofile.click();
		editpic.click();
		
		 StringSelection stringselection=new StringSelection("D:\\ronaldoimage.jpg");
		   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselection, null);
		   
		// To paste the string control+v
		   
		   
		   robot.setAutoDelay(2000);
		   
		   
		   robot.keyPress(KeyEvent.VK_CONTROL);
		   robot.keyPress(KeyEvent.VK_V);


		   robot.keyRelease(KeyEvent.VK_CONTROL);
		   robot.keyRelease(KeyEvent.VK_V);
		    
		   robot.setAutoDelay(2000);
		   
		   robot.keyPress(KeyEvent.VK_ENTER);
		   robot.keyRelease(KeyEvent.VK_ENTER);
		
		
	}
	public void verifySaveButtonClick()
	{
		savebutton.click();
	}
	
}


