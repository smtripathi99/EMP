package com.automation.actions;

import org.openqa.selenium.WebDriver;

import com.automation.core.SeleniumActionBase;
import com.automation.pages.LoginPage;

public class ActionBase extends SeleniumActionBase{
	
	protected LoginPage loginPage;
	
	public ActionBase(){}
	 
	public ActionBase(WebDriver webDriver)	
	{
		loginPage = new LoginPage(webDriver);
	}

}
