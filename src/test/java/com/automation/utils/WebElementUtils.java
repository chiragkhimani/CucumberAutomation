package com.automation.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementUtils {
	
	public static boolean isDisplayed(WebElement element) {
		try {
			element.isDisplayed();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public static void waitForElementVisible(WebElement element) {
		WebDriverWait wait = new WebDriverWait(DriverUtils.getDriver(), 20);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
}
