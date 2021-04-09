package com.qa.stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import com.qa.pages.AccessCode;
import com.qa.utility.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AccessCodeSteps extends TestBase
{
	AccessCode accesscode=new AccessCode();
	
	@Given("^user opens the browser$")
	public void user_opens_the_browser() throws Throwable {
		TestBase.initialization();
	}

	@Then("^user enters invalid access code$")
	public void user_navigates_to_access_code_window_and_enters_invalid_access_code() throws Throwable {
		
		AccessCode accesscode=new AccessCode();
		accesscode.verifyInvalidAccessCode(prop.getProperty("invalidaccesscode"));
		
	}
	
	@Given("^error message gets displayed$")
	public void error_message_gets_displayed() throws Throwable {
		AccessCode accesscode=new AccessCode();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		accesscode.verifyErrorMessage();
		String errormessage=accesscode.verifyErrorMessage();
		System.out.println(errormessage);
		Assert.assertEquals(errormessage,"Invalid Access Code entered");
	}


	
	// 
	
	
	@Then("^user enters valid access code$")
	public void user_enters_invalid_access_code()
	{
		AccessCode accesscode=new AccessCode();
		accesscode.entervalidaccesscode(prop.getProperty("validacesscode"));
	}
	
	
	@Then("^User navigates to access code window and enters \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void user_navigates_to_access_code_window_and_enters(String arg1, String arg2, String arg3, String arg4) throws Throwable {
		AccessCode accesscode=new AccessCode();
		Thread.sleep(3000);
		accesscode.verifyErrorMessage();
		accesscode.enterAccessCodefields(arg1, arg2, arg3, arg4);
	}


	@Then("^user clicks on submit button and bookshlef gets displayed$")
	public void user_clicks_on_submit_button_and_bookshlef_gets_displayed() throws Throwable {
		AccessCode accesscode=new AccessCode();
		Thread.sleep(3000);
		String signuperrormessage=accesscode.errormessge();
		System.out.println(signuperrormessage);
		Assert.assertEquals(signuperrormessage,"Passwords entered do not match");
		driver.close();
		
		
	}

		}
	
	
	

