package org.stepdefinition;

import org.baseclass.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass{
	@Before
	public void beforeScenario() {
		System.out.println("Scenario Starts...");
	}
	@After
	public void afterScenario(Scenario s) {
		if(s.isFailed()) {
			TakesScreenshot tk = (TakesScreenshot) d;
			byte[] screenshot = tk.getScreenshotAs(OutputType.BYTES);
			s.embed(screenshot, "image/png");
			System.out.println(s.getName() + "Scenario Failed...");
		}
		System.out.println("Scenario Ends...");
	}
}
