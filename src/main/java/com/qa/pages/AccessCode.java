package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.TestBase;

public class AccessCode extends TestBase
{

	// Page Objects - OR
	
		@FindBy(id="tab-item-3")
		WebElement accesscode;	
		
		@FindBy(id="accessUsername")
		WebElement enteraccesscode;
		
		@FindBy(xpath = "//button[@class='sendButton md-button md-ink-ripple']")
		WebElement sendbutton;
		
		@FindBy(xpath = "//*[@id=\"accessError\"]")
		WebElement accesscodeerror;
		
   // Access Code Fields
		
	@FindBy(id ="input_4")
	WebElement firstname;
	
	@FindBy(id = "input_5")
	WebElement emailid;
	
	@FindBy(id="input_6")
	WebElement password;
	
	@FindBy(id="input_7")
	WebElement confirmpassword;
	
	@FindBy(xpath = "//md-checkbox[@aria-label='Accept Condition']")
	WebElement acceptcondition;
	
	@FindBy(xpath = "//*[@id=\"accessCodeForm\"]/div/div[3]/button[2]")
	WebElement submitbutton;
	
	@FindBy(xpath = "//div[@aria-label='Passwords entered do not match']")
	WebElement incorrectpass;
		
		
		public AccessCode()
		{
			PageFactory.initElements(driver, this);
		}
		
	//	Actions
		
		public void verifyInvalidAccessCode(String acc_code)
		{
		
		accesscode.click();
		enteraccesscode.sendKeys(acc_code);
		
			
		}
		
		public String verifyErrorMessage() throws InterruptedException
		{
			sendbutton.click();
			return accesscodeerror.getText();
		}
		
		//Access Code Signup
		
		
		public void entervalidaccesscode(String validcode)
		{
			accesscode.click();
			enteraccesscode.sendKeys(validcode);
			sendbutton.click();
		}
		
		
	public  void enterAccessCodefields(String fname, String eid, String pwd, String cpwd) throws InterruptedException
	{
	
		
		firstname.sendKeys(fname);
		emailid.sendKeys(eid);
		password.sendKeys(pwd);
		confirmpassword.sendKeys(cpwd);
		acceptcondition.click();
				
	}
	
	public String errormessge() throws InterruptedException
	{
		Thread.sleep(3000);
	submitbutton.click();
    return incorrectpass.getText();
} }
