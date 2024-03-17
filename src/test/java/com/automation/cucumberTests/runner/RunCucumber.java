package com.automation.cucumberTests.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/features",
		glue = "com.automation.cucumberTests"
		)
public class RunCucumber extends AbstractTestNGCucumberTests{

}
