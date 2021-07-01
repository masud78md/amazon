package com.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "Feature", glue = "com.stepdef", tags = "@search")

public class TestRunner extends AbstractTestNGCucumberTests {

}
