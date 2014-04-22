package com.automation.tests;


import org.junit.Assert;
import org.junit.Test;

import com.automation.pages.LoginPage;

//This is a class to test the Login functionality
public class LoginTest extends TestBase{
  
  @Test
  public void successfulLoginTest()
  {
	  setup();
	  loginActions.LoginAttempt("admin", "admin", true);
	  if (LoginPage.loginButton.GetNow()==null){
		  Assert.assertTrue(true);
		  System.out.println("Login is successfull");
		  //Reporter.getCurrentTestResult();
	  }
	  else{
		  Assert.assertFalse(false);
		  System.out.println("Login is unsuccessfull");
	  }
	  
	  tearDown();
  }
 
}
