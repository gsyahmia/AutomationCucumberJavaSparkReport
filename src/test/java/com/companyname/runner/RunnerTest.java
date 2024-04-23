package com.companyname.runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="Features",
				glue="stepDefinition", monochrome=true,
				plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class RunnerTest extends AbstractTestNGCucumberTests{

}
