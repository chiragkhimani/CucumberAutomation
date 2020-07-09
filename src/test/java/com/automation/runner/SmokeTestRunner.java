package com.automation.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(features = { 
							  "src//test//resources//features//DataTable.feature",
							},
							tags = "@WIP", 
							glue = "com.automation.stepdef",
							plugin = {"html:report","json:target/cucumber.json"},
							dryRun = true
				)
@RunWith(Cucumber.class)
public class SmokeTestRunner {

}
