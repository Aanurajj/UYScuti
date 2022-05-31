package com.UYScuti.Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.UYScuti.GenericLib.BaseTest;
import com.UYScuti.GenericLib.WebDriverCommonLib;

public class CreateNewLeadPage {

	@FindBy(name="property(First Name)") 
	private WebElement firstNameTextBox;
	@FindBy(name="property(Last Name)") private WebElement lastNameTextBox;
	@FindBy(name="property(Company)") private WebElement companyTextBox;
	@FindBy(xpath="//td[contains(text(),'Create Lead')]/ancestor::table/following-sibling::table[2]//input[@value='Save']")
	private WebElement saveButton;
	@FindBy(name="property(saltName)") private WebElement salutationDropdown;
	
	
	public CreateNewLeadPage() {
		PageFactory.initElements(BaseTest.driver,this);
	}

	public WebElement getFirstNameTextBox() {
		return firstNameTextBox;
	}

	public WebElement getLastNameTextBox() {
		return lastNameTextBox;
	}

	public WebElement getCompanyTextBox() {
		return companyTextBox;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	public void typeFirstname(String firstname) {
		firstNameTextBox.sendKeys(firstname);
	}
	
	public void typeLastname(String lastname) {
		lastNameTextBox.sendKeys(lastname);
	}
	
	public void typeCompany(String company) {
		companyTextBox.sendKeys(company);
	}
	public void clickSaveButton() {
		saveButton.click();
	}
	
	public void CreateNewLead(String salutationText, String firstname, String lastname, String company) {
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.selectOption(salutationText, salutationDropdown);
		firstNameTextBox.sendKeys(firstname);
		lastNameTextBox.sendKeys(lastname);
		companyTextBox.sendKeys(company);
		saveButton.click();		
	}
	
}
