/*package com.automation.reports;

import java.util.List;

import org.openqa.selenium.By;
import org.testng.IReporter;
import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.xml.XmlSuite;

public class Reporter implements IReporter{
	
	public void generateReport(List xmlSuites, List suites, String outputDirectory){
	      ISuiteResult results =suites.get(0).getResults().get("Sanity Suite");
	      ITestContext context = results.getTestContext();

	      IResultMap passedTests = context.getPassedTests();
	      IResultMap failedTests = context.getFailedTests();

	      // Print all test exceptions...
	      for( ITestResult r: failedTests.getAllResults()) {
	          System.out.println( r.getThrowable());
	      }
	}

	@Override
	public void generateReport(List<XmlSuite> arg0, List<ISuite> arg1,
			String arg2) {
		// TODO Auto-generated method stub
		
	}

}
*/