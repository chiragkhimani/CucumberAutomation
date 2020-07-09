package com.automation.stepdef;

import com.automation.pages.HomePage;

import cucumber.api.java.en.Then;

public class HomeSteps {

	HomePage homePage = new HomePage();

	@Then("^Verif user is on homepage$")
	public void verif_user_is_on_homepage() throws Throwable {
		homePage.verifyHomePage();
	}
}
