package org.stepdefinition;

import org.baseclass.BaseClass;
import org.fbloginpojo.FBLogInPojo;
import org.junit.Assert;
import org.pageobjectmanager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FacebookLogin extends BaseClass {
	PageObjectManager pageObjectManager;
	FBLogInPojo fbLoginPojo;

	@Given("user has to launch the chrome and hit the Fb url")
	public void user_has_to_launch_the_chrome_and_hit_the_Fb_url() {
		launchBrowser();
		browserMax();
		urlLaunch("https://www.facebook.com/");
	}

	@When("user has to enter the username and password")
	public void user_has_to_enter_the_username_and_password() {
		pageObjectManager = PageObjectManager.getPageObjectManager();
		fbLoginPojo = pageObjectManager.getFbLogin();
		fbLoginPojo.loginEnterUsernameAndPassword("Greens123@gmail.com", "Greens@123");
	}

	@When("click the login button")
	public void click_the_login_button() throws InterruptedException {
		fbLoginPojo.loginButtonClick();
	}

	@Then("user unable to enter the homepage")
	public void user_unable_to_enter_the_homepage() {
		Assert.assertTrue("user unable to enter the Facebook account homepage!", false);
	}
}
