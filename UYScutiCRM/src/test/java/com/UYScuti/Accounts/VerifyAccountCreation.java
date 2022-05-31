package com.UYScuti.Accounts;
import java.util.Set;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.UYScuti.GenericLib.BaseTest;
import com.UYScuti.GenericLib.FileLib;
import com.UYScuti.GenericLib.WebDriverCommonLib;
import com.UYScuti.Login.ValidLogin;
import com.UYScuti.Pages.AccountsPage;
import com.UYScuti.Pages.CreateAccountPage;
import com.UYScuti.Pages.HomePage;

public class VerifyAccountCreation extends BaseTest{

	@Test
	public void createNewAccountTest() throws Throwable
	{
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
				
				ap.clickNewAccountButton();
				FileLib flib=new FileLib();
				wlib.verify(wlib.getPageTitle(),
						flib.readPropertyData(PROP_PATH, "createAccountTitle"),
						"CREATE ACCOUNTS PAGE");
				
				CreateAccountPage cap=new CreateAccountPage();
				cap.clickAccountNameButton();
				
				
				Set<String> allWindows = driver.getWindowHandles();
				for(String oneWindow:allWindows)
				{
					String title = driver.switchTo().window(oneWindow).getTitle();
					if(title.contains("Zoho CRM - Account Name Lookup"))
					{
						driver.findElement(By.xpath("((//table[*]//tr)[3]//td)[6]")).click();
						break;
					}
				}
				
				
	}
}
