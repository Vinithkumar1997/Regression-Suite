package org.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver d;
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver();
	}
	public static void browserMax() {
		d.manage().window().maximize();
	}
	public static void urlLaunch(String url) {
		d.get(url);
	}
	public static void enterTheValues(WebElement e, String value) {
	    e.sendKeys(value);
	}
	
	public static void buttonClick(WebElement e) {
		e.click();
	}
}
