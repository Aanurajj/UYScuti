package com.UYScuti.Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.UYScuti.GenericLib.BaseTest;

public class LeadDetailsPage {

	@FindBy(xpath="//td[contains(text(),'Lead Name')]/following-sibling::td")
	private WebElement leadName;
	
	public LeadDetailsPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public WebElement getLeadName() {
		return leadName;
	}
	
	public String getLeadNameText() {
		return leadName.getText();
	}
	
}
