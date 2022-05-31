package com.UYScuti.Contacts;
import org.testng.annotations.Test;

import com.UYScuti.GenericLib.BaseTest;
import com.UYScuti.GenericLib.WebDriverCommonLib;
import com.UYScuti.Login.ValidLogin;
import com.UYScuti.Pages.ContactsPage;
import com.UYScuti.Pages.HomePage;

public class VerifyContactsTab extends BaseTest{

	@Test
	public void verifyContactsTabTest() throws Throwable {
		//login to app and verify home page
		ValidLogin vl=new ValidLogin();
		vl.validLoginTest();
		
		//Click on Contacts TAb
		HomePage hp=new HomePage();
		hp.clickContactsTab();
		
		//verify contacts text
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		ContactsPage cp=new ContactsPage();
		wlib.elementDisplayed(cp.getContactsTextAddress(), "Contacts Text");
	}
}
