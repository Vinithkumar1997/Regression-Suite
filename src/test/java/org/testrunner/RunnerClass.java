package org.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.jvmreport.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\login.feature", glue = "org.stepdefinition", plugin = "json:src\\test\\resources\\Reports\\fb.json", dryRun = false)
public class RunnerClass {
	@AfterClass
	public static void reportGeneration() {
		JVMReport.generateJVMReport(System.getProperty("user.dir") + "\\src\\test\\resources\\Reports\\fb.json");
	}
}
