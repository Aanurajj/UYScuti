package com.UYScuti.Login;

import org.testng.annotations.Listeners;
import com.UYScuti.GenericLib.BaseTest;
import com.UYScuti.GenericLib.FileLib;
import com.UYScuti.GenericLib.WebDriverCommonLib;
import com.UYScuti.Pages.SignInPage;

@Listeners(com.UYScuti.GenericLib.MyListeners.class)
public class ValidLogin extends BaseTest{

	public void validLoginTest() throws Throwable {
		
		//Open the browser
		//Enter the test URL
		//Verify LoginPage is Displayed
		FileLib flib=new FileLib();
		//Login to App
		SignInPage lp=new SignInPage();
		lp.login(flib.readPropertyData(PROP_PATH, "username"), 
				flib.readPropertyData(PROP_PATH, "password"));
		//Verify Home Page is Displayed
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.waitForPageTitle(flib.readPropertyData(PROP_PATH, "homeTitle"));
		wlib.verify(wlib.getPageTitle(),
				flib.readPropertyData(PROP_PATH, "homeTitle"),
				"Home Page");
	}
}
