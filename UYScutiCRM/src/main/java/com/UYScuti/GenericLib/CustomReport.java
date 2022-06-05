package com.UYScuti.GenericLib;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class CustomReport {

	
	//hi, will this display

	
	public static void main (String[] args)
	{
		
	ExtentSparkReporter spark= new ExtentSparkReporter("./customReports/myreport.html");
	ExtentReports extent=new ExtentReports();
	extent.attachReporter(spark);
	ExtentTest test=extent.createTest("Verify Customer");
	test.info(MarkupHelper.createLabel("Customer is Dispalyed", ExtentColor.BLUE));
	test.pass(MarkupHelper.createLabel("Method is passed",ExtentColor.GREEN));
	test.fail(MarkupHelper.createLabel("Failed",ExtentColor.RED));
	
	extent.flush();
	
	System.out.println("Done");
	
	}
}
