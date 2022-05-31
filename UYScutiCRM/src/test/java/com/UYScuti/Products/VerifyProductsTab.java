package com.UYScuti.Products;

import org.testng.annotations.Test;

import com.UYScuti.GenericLib.BaseTest;
import com.UYScuti.Login.ValidLogin;
import com.UYScuti.Pages.HomePage;

public class VerifyProductsTab extends BaseTest{

	@Test
	public void verifyProductsTabTest() throws Throwable {
		//login to app and verify home page
		ValidLogin vl=new ValidLogin();
		vl.validLoginTest();
		
		//Click on Products TAb
		HomePage hp=new HomePage();
		hp.clickProductsTab();
	}
}
