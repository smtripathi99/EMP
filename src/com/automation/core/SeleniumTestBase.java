package com.automation.core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTestBase {
	
	protected WebDriver myDriver;
	
	public SeleniumTestBase(){}
	 
	public SeleniumTestBase (WebDriver webDriver)
	{
	myDriver = webDriver;
	}
	 
/*	public DataTable GetData(String connString, String SQL)
	{
	//Some code which will query a DB for you
	}
*/	 
	public WebDriver StartBrowser(String browserType)
	{
	//Some code which will launch different types of browsers
		System.setProperty("webdriver.chrome.driver", "C:/Users/sneh.tripathi/AppData/Roaming/npm/node_modules/protractor/selenium/chromedriver.exe");
		myDriver = new ChromeDriver();
		myDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return myDriver;
	}
	 
	public void SwitchToWindow(String handle)
	{
	//Some code which will switch windows for you
	}
	 
	public void SwitchToFrame(String handle)
	{
	//Some code which will switch frames for you
	}
	 
	public void LaunchUrl(String URL)
	{
	//Some code which will navigate directly to the specified URL.
		myDriver.get(URL);
		
	}
	 
	public void Refresh()
	{
	//Some code to refresh the page you are currently on
	}

}
