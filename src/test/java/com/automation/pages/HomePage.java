package com.automation.pages;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

	@FindBy(css = ".product_label")
	WebElement homePageTitle;

	@FindBy(css = ".inventory_item_name")
	List<WebElement> itemNameList;

	@FindBy(css = ".inventory_item_price")
	List<WebElement> itemPriceList;

	static Map<String, String> dataOnHomePage = new HashMap<String, String>();

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public void verifyHomePage() {
		Assert.assertTrue("home page title is not displayed", !homePageTitle.getText().isEmpty());
	}

	public void verifyItemPrice(String itemName) {
		dataOnHomePage.put("item_name", itemName);
		
		for (int i = 0; i < itemNameList.size(); i++) {
			if (itemNameList.get(i).getText().equals(itemName)) {
				Assert.assertTrue("Item " + itemName + " price is blank", !itemPriceList.get(i).getText().isEmpty());
				dataOnHomePage.put("item_price", itemPriceList.get(i).getText());
			}
		}
	}

	public void clickOnItem(String itemName) {
		for (int i = 0; i < itemNameList.size(); i++) {
			if (itemNameList.get(i).getText().equals(itemName)) {
				itemNameList.get(i).click();
			}
		}
	}
}
