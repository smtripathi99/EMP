package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.automation.core.SeleniumPageBase;
import com.automation.elements.PageElement;

public class LoginPage extends PageElement{
	
	public static PageElement UsernameTextField;
	public static PageElement PasswordTextField;
	public static PageElement loginButton;
	
	public LoginPage(){}
	 
	public LoginPage(WebDriver webDriver)
	{	
		By username=By.id("login-username");
		By password=By.id("login-password");
		By login=By.id("btn-login");
		UsernameTextField = new PageElement(username, webDriver);
		PasswordTextField= new PageElement(password, webDriver);
		loginButton= new PageElement(login, webDriver);
	}
}
