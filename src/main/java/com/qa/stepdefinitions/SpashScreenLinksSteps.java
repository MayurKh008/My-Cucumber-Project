package com.qa.stepdefinitions;

import java.util.Iterator;
import java.util.Set;

import com.qa.pages.SplashScreenLinks;
import com.qa.utility.TestBase;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class SpashScreenLinksSteps extends TestBase
{

	SplashScreenLinks splinks=new SplashScreenLinks();
	
	@After
	public void after()
	{
		driver.quit();
	}
	
	@Given("^user is present on login page$")
	public void user_is_present_on_login_page() throws Throwable {
	    
		TestBase.initialization();
	}

	@When("^user will click on \"([^\"]*)\"$")
	public void user_will_click_on(String linkname) throws Throwable {
		SplashScreenLinks splinks=new SplashScreenLinks();
		Thread.sleep(5000);
		splinks.verifyDownloadLinks(linkname);
	}

	@And("^window with \"(.*)\" open succesfully$")
	public void window_will_open_succesfully_and_gets_closed(String windowTitle) throws Throwable {	
		Set<String> handler=driver.getWindowHandles();
		Iterator<String>it=	handler.iterator();
		it.next();
		driver.switchTo().window(it.next());
		String title=driver.getTitle();
		System.out.println("Title of Appstore"+title);
		Assert.assertEquals(windowTitle, title);
	}
	
	@Then("^close the window succesfully$")
	public void close_the_window_succesfully() throws Throwable {
	   
		
		driver.close();
	}
	
	
}
