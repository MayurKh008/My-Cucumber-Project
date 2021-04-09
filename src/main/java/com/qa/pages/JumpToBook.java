package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.TestBase;

public class JumpToBook extends TestBase
{
	
	
	@FindBy(xpath ="/html/body/div[1]/div/div/section[1]/md-content/md-tabs/md-tabs-wrapper/md-next-button")
	WebElement arrowicon;
	
	@FindBy(xpath = "tab-item-24")
	WebElement catorynavigate;
	
	@FindBy(xpath = "59606_Book_Desktop_SubCategoery")
	WebElement book_launch;

	@FindBy(id = "thumbnailIcon")
	WebElement thumbnailicon;
	
	@FindBy(xpath = "//@img[alt='thumbnail of page9']")
	WebElement page_no_9;
	
	@FindBy(id = "mark8403033")
	WebElement jump_to_book_markup;
	
	
	public JumpToBook()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void categorynavigation()
	{
		arrowicon.click();
		arrowicon.click();
	}
	
	
}
