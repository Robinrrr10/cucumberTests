package com.automation.cucumberTests.stepDefinitions;

import io.cucumber.java.en.Given;

public class LoginStepDef {
	
	@Given("open webpage")
	public void openWebPage() {
		System.out.println("Opening web page");
	}
	
	@Given("go to login page")
	public void clickLogin() {
		System.out.println("Click login link and open login page");
	}
	
	@Given("give valid credential")
	public void giveValidCredentials() {
		System.out.println("Give valid username and password for login");
	}
	
	@Given("validate login success")
	public void verifyLoginIsSuccess() {
		System.out.println("Verify login is success or not and it got navigated to home page or not");
	}

}
