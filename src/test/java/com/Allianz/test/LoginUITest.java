package com.Allianz.test;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginUITest {
	WebDriver driver;
	
	
	
	@Test
	public void titleTest() {
		
		
		
		String actualtitle=driver.getTitle();
		Assert.assertEquals("actualtile", "OrangeHRM");
		
		
	}
	
	@Test
	public void applicationDescription() {

		
		//String actualtitle=driver.getTitle();
	//	Assert.assertEquals("actualtile", "OrangeHRM");System.out.println("app test");
	String actualtitle=driver.findElement(By.className("oxd-text oxd-text--p orangehrm-copyright")).getText();
	//Assert.assertEquals("actualtiltle","OrangeHRM OS 5.6.1");
	Assert.assertEquals("actualtiltle","OrangeHRM OS 5.6.1");
	}
	
	
	
}
