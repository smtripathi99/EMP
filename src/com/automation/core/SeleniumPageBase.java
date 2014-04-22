package com.automation.core;

import org.openqa.selenium.WebDriver;

public class SeleniumPageBase {
	
	protected WebDriver myWebDriver;
	
	public SeleniumPageBase(){}
	 
	public SeleniumPageBase(WebDriver webDriver)
	{
	myWebDriver = webDriver;
	}
	 
	/*protected int browserIndex
	{
	get
	{
	return Code to get Browser index;
	}
	}*/

}
