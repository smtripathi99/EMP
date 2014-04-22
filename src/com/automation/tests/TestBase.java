package com.automation.tests;

import org.openqa.selenium.WebDriver;

import com.automation.actions.LoginAction;
import com.automation.core.SeleniumTestBase;
import com.automation.pages.LoginPage;
import com.automation.properties.EMPProperties;

public class TestBase extends SeleniumTestBase{
	protected LoginAction loginActions;
	protected LoginPage loginPage;
	protected String url;
	EMPProperties emp=new EMPProperties();
	
	public TestBase() { } 
	
	public TestBase(WebDriver driver) 
	{
		//super(driver); 
	} 
	 
	public void CreateActions(WebDriver webDriver)
	{
		loginActions = new LoginAction(webDriver);
	}
	 
	public void CreatePages(WebDriver webDriver)
	{
		loginPage= new LoginPage(webDriver);
	}
	 
	public void setURL(){		
		
		url=emp.getProperties();
	};
	 

	public void setup()
	{
		//Function is virtual so child test classes can have additional functionality.
		myDriver = StartBrowser("firefox");		
		CreateActions(myDriver);
		CreatePages(myDriver);
		setURL();
		LaunchUrl(url);		
	}
	 

	public void tearDown()
	{
		//Function is virtual so child test classes can have additional functionality.
		myDriver.quit();
	}
	

}
