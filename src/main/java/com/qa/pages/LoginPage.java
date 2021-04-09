package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.TestBase;



public class LoginPage extends TestBase
{
   //**********PAGE FACTORY-OR****************

	
	@FindBy(id = "userName")
	WebElement username;
	
	
	@FindBy(id = "passwordField")
	WebElement password;
	
	
	@FindBy(xpath ="//button[@class='signInButton md-button md-ink-ripple']")
	WebElement signinbutton;
	
	
	
	@FindBy(id = "error")
	WebElement errormessage;
	
	@FindBy(id = "tab-item-81")
	WebElement allcategary;

	
	
	//Initializing the page objects
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	//Actions
	
	public void verifyInvalidLoginTest()
	{
		username.sendKeys("invalidusername@yopmail.com");
		password.sendKeys("passowrd");
		signinbutton.click();		
	}
	
	public String verifyLoginErrorMessage() 
	{
		return errormessage.getText();	
	}
	
	public HomePage login()
	{
		username.sendKeys("mayur.sdk1@yopmail.com");
		password.sendKeys("kitaboo@789");
		signinbutton.click();
		return new HomePage();	
	}
	
	
	
	
	
}
