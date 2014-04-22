package com.automation.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.automation.core.SeleniumPageElement;

public class PageElement extends SeleniumPageElement{
	
	
	
	public PageElement(){}
	
	public PageElement(By we, WebDriver wd){
		super(we,wd,null, 0);
	
	}	
	
}
