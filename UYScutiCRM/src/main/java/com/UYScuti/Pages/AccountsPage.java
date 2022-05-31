package com.UYScuti.Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.UYScuti.GenericLib.BaseTest;

public class AccountsPage {

	@FindBy(xpath="//td[contains(text(),'Accounts: ')]")
	private WebElement accountsText;
	
	@FindBy(xpath = "//input[@value='New Account']")
	private WebElement newAccountButton;
	
	public AccountsPage() {
		PageFactory.initElements(BaseTest.driver,this);
	}
	
	public WebElement getAccountsTextAddress() {
		return accountsText;
	}
	
	public void getAccountsText() {
		accountsText.getText();
	}
	
	public void clickNewAccountButton()
	{
		newAccountButton.click();
	}
}
