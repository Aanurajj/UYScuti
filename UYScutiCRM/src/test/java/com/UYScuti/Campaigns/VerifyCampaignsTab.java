package com.UYScuti.Campaigns;

import org.testng.annotations.Test;

import com.UYScuti.GenericLib.BaseTest;
import com.UYScuti.Login.ValidLogin;
import com.UYScuti.Pages.HomePage;

public class VerifyCampaignsTab extends BaseTest{

	@Test
	public void verifyCampaignsTabTest() throws Throwable {
		//login to app and verify home page
		ValidLogin vl=new ValidLogin();
		vl.validLoginTest();
		
		//Click on campaigns TAb
		HomePage hp=new HomePage();
		hp.clickCampaignsTab();
		
	}
}
