package com.Allianz.page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Allianz.base.WebDriverKeywords;

public class DashboardPage extends WebDriverKeywords {
	
	private By dashboardHeaderLocator=By.xpath("//h6[contains(normalize-space(),'Dash')]");
	
	private WebDriver driver;
	
	public DashboardPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
	}
	
	public String getDashboardHeader()
	{
		//return driver.findElement(By.xpath("//h6[contains(normalize-space(),'Dash')]")).getText();
		return getText(dashboardHeaderLocator);
	}

	//clickOnAssignLeave()
	//clickOnLeaveList()
	//clickOnTimeSheet()
}