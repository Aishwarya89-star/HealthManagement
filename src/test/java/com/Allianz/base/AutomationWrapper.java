package com.Allianz.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class AutomationWrapper {
	protected WebDriver driver;

	@BeforeMethod(alwaysRun = true)
	@Parameters({"browser"})
	public void setup(@Optional("ch") String browserName) {
		
		if(browserName.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}else if (browserName.equalsIgnoreCase("ff"))
		{
			driver = new FirefoxDriver();
		}
		else
		{
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
	}

	@AfterMethod(alwaysRun = true)
	public void teardown() {
		driver.quit();
	}
}