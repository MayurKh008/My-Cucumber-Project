package com.qa.stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.utility.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class HomeSteps extends TestBase
{
	LoginPage loginpage=new LoginPage();
	HomePage homepage=new HomePage();
	
	@Given("^opens the browser$")
	public void opens_the_browser() throws Throwable {
		TestBase.initialization();
	}

	@Then("^user will enter invalid username and invalid password$")
	public void user_will_enter_invalid_username_and_invalid_password() throws Throwable {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		LoginPage loginpage=new LoginPage();
		loginpage.verifyInvalidLoginTest();
	  
	}

	@Then("^error message will be displayed$")
	public void user_message_will_be_displayed() throws Throwable {
		LoginPage loginpage=new LoginPage();
		
		loginpage.verifyLoginErrorMessage();

         Thread.sleep(3000);
		
		String actual_error_message=loginpage.verifyLoginErrorMessage();
		
		Assert.assertEquals(actual_error_message, "Username or Password entered is incorrect");
	
		driver.close();
	}

	@Then("^user will enter valid username and valid password$")
	public void user_will_enter_valid_username_and_valid_password() throws Throwable {
		LoginPage loginpage=new LoginPage();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		homepage=loginpage.login();		
	}

	@Then("^User will navigate to homepage$")
	public void user_will_navigate_to_homepage() throws Throwable {
	
		
	}
	
	@Given("^user will click on profile icon and upload the picture$")
	public void user_will_click_on_profile_icon_and_upload_the_picture() throws Throwable {
	    
		homepage.verifyProfilePicture();
	}

	@Then("^user will click on save button$")
	public void user_will_click_on_save_button() throws Throwable {
		homepage.verifySaveButtonClick();
		driver.close();
	}

}
	



 
	
	



	
	

