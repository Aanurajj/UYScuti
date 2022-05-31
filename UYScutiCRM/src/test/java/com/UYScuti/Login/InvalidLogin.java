package com.UYScuti.Login;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.UYScuti.GenericLib.BaseTest;
import com.UYScuti.GenericLib.FileLib;
import com.UYScuti.Pages.SignInPage;

@Listeners(com.UYScuti.GenericLib.MyListeners.class)
public class InvalidLogin extends BaseTest{

	@Test
	public void validLoginTest() throws Throwable {
		
		//Open the browser
		//Enter the test URL
		//Verify LoginPage is Displayed
		FileLib flib=new FileLib();
		//Login to App
		SignInPage lp=new SignInPage();
		
		for(int i=0;i<=5;i++)
		{
			String username = flib.readExcelData(EXCEL_PATH, "Invalid", i, 0);
			String password = flib.readExcelData(EXCEL_PATH, "Invalid", i, 1);
			lp.login(username, password);
			
		}
		
		//Verify Home Page is Displayed
//		WebDriverCommonLib wlib=new WebDriverCommonLib();
//		wlib.waitForPageTitle(flib.readPropertyData(PROP_PATH, "homeTitle"));
//		wlib.verify(wlib.getPageTitle(),
//				flib.readPropertyData(PROP_PATH, "homeTitle"),
//				"Home Page");
	}
}
