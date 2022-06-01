package com.UYScuti.GenericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

//Written in Global Repo(Github)
//Written in Local Repo((Git))

public class BaseTest implements IAutoConsts{

	public static WebDriver driver;
	
	@BeforeClass
	public void openBrowser() throws Throwable
	{
		FileLib flib=new FileLib();
		String browserName = flib.readPropertyData(PROP_PATH, "browser");
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty(GECKO_KEY, GECKO_VALUE);
			driver=new FirefoxDriver();
		}
		
		else
		{
			System.out.println("Dabba Fellow, Enter Proper Browser Name");
		}
		String appURL = flib.readPropertyData(PROP_PATH, "url");
		driver.get(appURL);
		driver.manage().window().maximize();
		
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.verify(wlib.getPageTitle(), 
				flib.readPropertyData(PROP_PATH, "loginTitle"),
				"Login Page");
		
	}
	
	@AfterClass(enabled=false)
	public void closeBrowser()
	{
		driver.quit();
	}
}
