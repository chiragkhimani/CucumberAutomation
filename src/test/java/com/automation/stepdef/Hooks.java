package com.automation.stepdef;

import com.automation.pages.BasePage;
import com.automation.utils.DriverUtils;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	@Before
	public void setUp() {
		DriverUtils.createDriver();
		BasePage.setDriver(DriverUtils.getDriver());
	}

	@After
	public void cleanUp() {
		DriverUtils.closeDriver();
	}
}
