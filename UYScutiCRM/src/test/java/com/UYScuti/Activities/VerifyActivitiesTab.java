package com.UYScuti.Activities;

import org.testng.annotations.Test;

import com.UYScuti.GenericLib.BaseTest;
import com.UYScuti.Login.ValidLogin;
import com.UYScuti.Pages.HomePage;

public class VerifyActivitiesTab extends BaseTest{

	@Test
	public void verifyActivitesTabTest() throws Throwable {
		//login to app and verify home page
		ValidLogin vl=new ValidLogin();
		vl.validLoginTest();
		
		//Click on Accounts TAb
		HomePage hp=new HomePage();
		hp.clickActivitiesTab();
		
		
		
}
}
