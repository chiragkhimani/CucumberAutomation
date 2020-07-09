package com.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.utils.WebElementUtils;

public class LoginPage extends BasePage {

	@FindBy(id = "user-name")
	WebElement userNameInput;

	@FindBy(id = "password")
	WebElement passwordInput;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement loginBtn;

	@FindBy(xpath = "//h3")
	WebElement invalidLoginErrorMsg;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public void doLogin(String username, String password) {
		userNameInput.sendKeys(username);
		passwordInput.sendKeys(password);
		loginBtn.click();
	}

	public void openWebsite() {
		driver.get("http://www.saucedemo.com/");
	}

	public void verifyInvalidLoginErrorMessage() {
		WebElementUtils.waitForElementVisible(invalidLoginErrorMsg);
		Assert.assertTrue("invalid login error message is not displayed",
				invalidLoginErrorMsg.isDisplayed() && !invalidLoginErrorMsg.getText().isEmpty());
	}

}
