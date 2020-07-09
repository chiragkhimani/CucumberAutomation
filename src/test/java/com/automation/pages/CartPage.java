package com.automation.pages;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.utils.WebElementUtils;

public class CartPage extends BasePage {

	@FindBy(css = ".inventory_item_name")
	WebElement itemName;

	@FindBy(css = ".inventory_item_price")
	WebElement itemPrice;

	@FindBy(xpath = "//a[text()='CHECKOUT']")
	WebElement checkOutBtn;

	@FindBy(css = ".subheader")
	WebElement cartPageHeader;

	static Map<String, String> dataOnCartPage = new HashMap<String, String>();

	public CartPage() {
		PageFactory.initElements(driver, this);
	}

	public void verifyCartPage() {
		Assert.assertTrue("Item page header is not diplayed", WebElementUtils.isDisplayed(cartPageHeader));
	}

	public void verifyItemDetailsOnCartPage() {
		dataOnCartPage.put("item_price", "$" + itemPrice.getText());
		dataOnCartPage.put("item_name", itemName.getText());
		System.out.println("Data on CartPage==>" + dataOnCartPage);
		System.out.println("Data on PDP==>" + ProductDetailPage.dataOnPdpPage);
		Assert.assertTrue("Data on pdp and cartPage doesn't match",
				dataOnCartPage.equals(ProductDetailPage.dataOnPdpPage));
	}

	public void clickOnCheckOut() {
		checkOutBtn.click();
	}
}
