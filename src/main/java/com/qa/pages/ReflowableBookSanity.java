package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.TestBase;

public class ReflowableBookSanity extends TestBase
{

	
	@FindBy(id = "userName")
	WebElement username;
	
	
	@FindBy(id = "passwordField")
	WebElement password;
	
	
	@FindBy(xpath ="//button[@aria-label='Sign In']")
	WebElement signinbutton;
	
	@FindBy(id = "14113218_Book_Desktop")
	WebElement reflowbooklaunch;
	
	
	//Reader Logo
	@FindBy(xpath = "//*[@id=\"pageHeader\"]/section[1]/md-card/img")
	WebElement readerlogo;
	
	//Toc Panel Page objects 
	@FindBy(id  = "tocButton")
	WebElement tocicon;
	
	
	@FindBy(id ="tab-item-40")
	WebElement contents_tab;
	
	@FindBy(id = "tab-item-67")
	WebElement bookmark_tab;
	
	
	//My data panel Page objects 
	@FindBy(id ="myDataButton")
	WebElement mydataicon;
	
	@FindBy(id="searchButton")
	WebElement searchicon;
	
	@FindBy(id="reflowSettingIcon")
	WebElement Reflowicon;
	
	@FindBy(id = "fullScreenIcon")
	WebElement fullscreenicon;
	
	@FindBy(id = "profileIcon")
	WebElement profileicon;
	
	
	
	
	public ReflowableBookSanity()
	{
	PageFactory.initElements(driver, this);
	}
	
	
	public void BookShelfLogin(String user,String pass)
	{
		username.sendKeys(user);
		password.sendKeys(pass);
		signinbutton.click();
	}
	
	public void ReflowableBookLaunch()
	{
		reflowbooklaunch.click();
	}
	
	public void reader_logo()
	{
		readerlogo.isDisplayed();
	}
	
	public void toc_button_click()
	{
		tocicon.click();
				
	}
	public void content_tab()
	{
		contents_tab.click();
	}
	
	
}
