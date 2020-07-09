package com.automation.stepdef;

import java.util.List;
import java.util.Map;

import com.automation.pages.LoginPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {

	LoginPage loginPage = new LoginPage();

	@Given("^User open website$")
	public void user_open_website() {
		loginPage.openWebsite();
	}

	@When("^Enter username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void enter_username_and_password(String username, String password) {
		loginPage.doLogin(username, password);
	}

	@When("^Verif invalid login error message is displayed$")
	public void verifyInvalidLoginError() {
		loginPage.verifyInvalidLoginErrorMessage();
	}

	@Then("^read data from data table$")
	public void read_data_from_data_table(DataTable table) throws Throwable {

		List<List<String>> listOfData = table.asLists(String.class);

		for (int i = 0; i < listOfData.size(); i++) {
			for (int j = 0; j < listOfData.get(i).size(); j++) {
				System.out.print(listOfData.get(i).get(j) + " ");
			}
			System.out.println();
		}

	}

	@Then("^read data from data table using map$")
	public void read_data_from_data_table_map(DataTable table) throws Throwable {
		List<Map<String, String>> tableData = table.asMaps(String.class, String.class);

		for (int i = 0; i < tableData.size(); i++) {
			System.out.println(tableData.get(i).get("name"));
			System.out.println(tableData.get(i).get("gender"));
		}
	}

}
