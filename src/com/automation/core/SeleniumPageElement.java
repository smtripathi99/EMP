package com.automation.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumPageElement {
	
	public By myBy;
	public WebDriver myDriver;
	public int myIndex;
	public SeleniumPageElement myParent;
	
	public SeleniumPageElement(){}
	 
	public SeleniumPageElement(By locator, WebDriver webDriver, SeleniumPageElement parent, int index)
	{
		myBy = locator;
		myDriver = webDriver;
		myIndex = index;
		myParent = parent;
	}
	 
	public WebElement GetNow()
	{
		try
		{
		if(myParent != null)
		{
		if(myIndex != 0)
		{
		//return myParent.GetNow().FindElements(myBy)[MyIndex];
		}
		return myParent.GetNow().findElement(myBy);
		}
		 
		if(myIndex != 0)
		{
		//return myDriver.findElements(myBy)[MyIndex];
		}
		return myDriver.findElement(myBy);
		}
		catch(Exception e)
		{
		return null;
		}
	}
	
	public WebElement WaitingGet(int seconds, String errorMessage)
	{
		return null;
	//Waiting function using above method.
	}
	 
	public void Click(int seconds, String errorMessage)
	{
	//WaitingGet(seconds, errorMessage).Click();

	}
}
