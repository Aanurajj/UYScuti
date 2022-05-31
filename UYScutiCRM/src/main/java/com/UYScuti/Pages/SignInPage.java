package com.UYScuti.Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.UYScuti.GenericLib.BaseTest;

public class SignInPage {

	@FindBy(id="userName") private WebElement usernameTextBox;
	@FindBy(id="passWord") private WebElement passwordTextBox;
	@FindBy(xpath = "//input[@title='Sign In']")
	private WebElement signInButton;

	
	public SignInPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}


	public void login(String un, String pw)
	{
		usernameTextBox.sendKeys(un);
		passwordTextBox.sendKeys(pw);
		signInButton.click();
	}
	
	public WebElement getUntb() {
		return usernameTextBox;
	}


	public WebElement getPwtb() {
		return passwordTextBox;
	}


	public WebElement getLoginBtn() {
		return signInButton;
	}
	
	
	
}












