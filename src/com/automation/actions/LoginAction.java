package com.automation.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.automation.pages.LoginPage;

public class LoginAction extends ActionBase{
	
	public LoginAction(){}
	
	public LoginAction(WebDriver driver){}
	
	public void LoginAttempt(String username, String password, boolean isValid)
	{
	LoginPage.UsernameTextField.GetNow().sendKeys(username);
	LoginPage.PasswordTextField.GetNow().sendKeys(password);
	LoginPage.loginButton.GetNow().click();
	 
/*	if(isValid != null && isValid == true)
	{
	LoginPage.ConfirmationMessage.WaitUntilVisibleAndPresent(“confirmation is not appearing after 5 seconds”);
	}
	 
	if(isValid != null && isValid == false)
	{
	LoginPage.ErrorMessage.WaitUntilVisibleAndPresent(“error message is not appearing after 5 seconds”);
	}*/
	}

}
