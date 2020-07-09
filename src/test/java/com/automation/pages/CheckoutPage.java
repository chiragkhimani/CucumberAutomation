package com.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.utils.WebElementUtils;

public class CheckoutPage extends BasePage {

	@FindBy(id = "first-name")
	WebElement firstName;

	@FindBy(id = "last-name")
	WebElement lastName;

	@FindBy(id = "postal-code")
	WebElement postCode;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement continueBtn;

	public CheckoutPage() {
		PageFactory.initElements(driver, this);
	}

	public void verifyCheckOutPage() {
		Assert.assertTrue("First name is not displayed on checkout page", WebElementUtils.isDisplayed(firstName));
	}

	public void fillShippingDetails() {
		firstName.sendKeys("Test");
		lastName.sendKeys("Test");
		postCode.sendKeys("1234");
	}

	public void clickOnContinue() {
		continueBtn.click();
	}
}
