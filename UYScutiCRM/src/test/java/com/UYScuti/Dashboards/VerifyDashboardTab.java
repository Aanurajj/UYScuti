package com.UYScuti.Dashboards;

import org.testng.annotations.Test;

import com.UYScuti.GenericLib.BaseTest;
import com.UYScuti.Login.ValidLogin;
import com.UYScuti.Pages.HomePage;

public class VerifyDashboardTab extends BaseTest{
	
	@Test
	public void verifyDashboardTabTest() throws Throwable {
		//login to app and verify home page
		ValidLogin vl=new ValidLogin();
		vl.validLoginTest();
		
		//Click on Dashboard TAb
		HomePage hp=new HomePage();
		hp.clickDashboardTab();
}
}
