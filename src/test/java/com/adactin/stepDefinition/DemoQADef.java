package com.adactin.stepDefinition;

import java.awt.AWTException;

import com.adactin.pageExecution.LoginPageExe;

import io.cucumber.java.en.*;

public class DemoQADef extends LoginPageExe{
	
	@Given("User Enters the URL")
	public void user_enters_the_url() {
		launchingBrowser("chrome");
		urllaunch(propRead("URL"));
		maximizeWindowSize();
	    
	}

	@When("User enters the username {string}")
	public void user_enters_the_username(String string) {
		username();
		
	}

	@When("User enters the password {string}")
	public void user_enters_the_password(String string) {
		password();
		
	}

	@When("User clicks the login button")
	public void user_clicks_the_login_button() {
		login();
	}

	
	

}
