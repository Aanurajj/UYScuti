package com.UYScuti.Accounts;

import org.testng.annotations.Test;

import com.UYScuti.GenericLib.BaseTest;
import com.UYScuti.GenericLib.WebDriverCommonLib;
import com.UYScuti.Login.ValidLogin;
import com.UYScuti.Pages.AccountsPage;
import com.UYScuti.Pages.HomePage;

public class VerifyAccountsTab extends BaseTest{

	@Test
	public void verifyAccountsTabTest() throws Throwable {
		//login to app and verify home page
		ValidLogin vl=new ValidLogin();
		vl.validLoginTest();
		
		//Click on Accounts TAb
		HomePage hp=new HomePage();
		hp.clickAccountsTab();
		
		//verify accounts text is displayed
		AccountsPage ap=new AccountsPage();
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.elementDisplayed(ap.getAccountsTextAddress(),
				"Accounts Text");
		
		
		
	}
	
	
}
