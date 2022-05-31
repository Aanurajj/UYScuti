package com.UYScuti.Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.UYScuti.GenericLib.BaseTest;

public class ContactsPage {
	@FindBy(xpath="//td[contains(text(),'Contacts: ')]")
	private WebElement contactText;
	
	public ContactsPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public WebElement getContactsTextAddress() {
		return contactText;
	}
	public void getContactsText() {
		contactText.getText();
	}
}
