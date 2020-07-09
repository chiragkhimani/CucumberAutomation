package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReviewPage extends BasePage {

	@FindBy(xpath = "//a[text()='FINISH']")
	WebElement finishBtn;

	public ReviewPage() {
		PageFactory.initElements(driver, this);
	}

	public void verifyReviewPage() {

	}

	public void verifyItemDetailsOnReviewPage() {

	}

	public void clickOnFinishBtn() {
		finishBtn.click();
	}
}
