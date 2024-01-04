package com.simplilearn.bddtest.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/tags-ex.feature", 
	glue = {"com/simplilearn/bddtest/stepdefinitions"},
	tags = " @SmokeTest and @RegressionTest"
	// tags = " @SmokeTest or @RegressionTest"
	// tags = "not @SmokeTest or @RegressionTest"
)
public class SmokeTestsRunner {

}