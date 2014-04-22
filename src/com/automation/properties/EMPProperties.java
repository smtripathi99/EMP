package com.automation.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class EMPProperties {
	Properties configFile = new Properties();
	InputStream file=null;
	
	public String getProperties(){
		
		try {
			file=new FileInputStream("C:/WS_Selenium/EMP/src/com/automation/properties/Environment.properties");
			configFile.load(file);
			String name = configFile.getProperty("url");
			System.out.println(name);
			return name;	
			} catch (IOException e) {
				e.printStackTrace();
			}
		return null;
	}

}
