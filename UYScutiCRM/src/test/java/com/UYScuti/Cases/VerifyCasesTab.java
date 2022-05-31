package com.UYScuti.Cases;

import org.testng.annotations.Test;

import com.UYScuti.GenericLib.BaseTest;
import com.UYScuti.Login.ValidLogin;
import com.UYScuti.Pages.HomePage;

public class VerifyCasesTab extends BaseTest{

	@Test
	public void verifyCasesTabTest() throws Throwable {
		//login to app and verify home page
		ValidLogin vl=new ValidLogin();
		vl.validLoginTest();
		
		//Click on Cases TAb
		HomePage hp=new HomePage();
		hp.clickCasesTab();
		
	}
}
