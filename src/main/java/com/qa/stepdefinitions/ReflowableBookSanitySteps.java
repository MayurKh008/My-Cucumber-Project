package com.qa.stepdefinitions;

import java.util.concurrent.TimeUnit;

import com.qa.pages.ReflowableBookSanity;
import com.qa.utility.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class ReflowableBookSanitySteps extends TestBase
{

	ReflowableBookSanity reflow=new ReflowableBookSanity();
	
	@Given("^user opens the browser&")
	public void user_opens_the_browser()
	{
		TestBase.initialization();
	}
	
	@Given("^user gets logged in to bookshelf$")
	public void user_gets_logged_in_to_bookshelf() throws Throwable {	
		ReflowableBookSanity reflow=new ReflowableBookSanity();
		reflow.BookShelfLogin(prop.getProperty("username"), prop.getProperty("password"));	
		Thread.sleep(3000);
		
	}

	@When("^user lauches the reflowable book$")
	public void user_lauches_the_reflowable_book() throws Throwable {
		ReflowableBookSanity reflow=new ReflowableBookSanity();
		reflow.ReflowableBookLaunch();
	}	
	
	@When("^user clicks on toc icon$")
	public void user_clicks_on_all_menu_buttons() throws Throwable {
		
		ReflowableBookSanity reflow=new ReflowableBookSanity();
		reflow.reader_logo();
		reflow.toc_button_click();
					
	}

}
