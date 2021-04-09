package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.TestBase;

public class SplashScreenLinks extends TestBase
{
	
	//Page Objects -- OR
	
	@FindBy(xpath ="//*[@id=\"login\"]/section[1]/div[3]/md-card[2]/a")
	WebElement Appstorelink;
	
	@FindBy(xpath ="//*[@id=\"login\"]/section[1]/div[3]/md-card[3]/a")
	WebElement Playstorelink;
	
	@FindBy(xpath ="//*[@id=\"login\"]/section[1]/div[3]/md-card[4]/a")
	WebElement Windowsstorelink;
	
	// Initialize the Page Objects
	
	public SplashScreenLinks()
	{
		PageFactory.initElements(driver, this);
	}
	
	// Actions
	
	public void verifyDownloadLinks(String link)
	{
		
		
		switch (link) {
		case "Appstore":
			Appstorelink.click();
			break;
			
		case "Playstore":
		 Playstorelink.click();
			break;
			
		case "WindowStore":
			Windowsstorelink.click();
			break;
			
		default:
			break;
		}
		
		
		
		
		
	}

	
}
