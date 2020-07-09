package com.automation.pages;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.utils.WebElementUtils;

public class ProductDetailPage extends BasePage {

	@FindBy(css = ".inventory_details_img")
	WebElement itemImage;

	@FindBy(css = ".inventory_details_price")
	WebElement itemPrice;

	@FindBy(css = ".inventory_details_name")
	WebElement itemName;

	@FindBy(xpath = "//button[text()='ADD TO CART']")
	WebElement addToCartBtn;

	@FindBy(xpath = "//div[@id='shopping_cart_container']/a")
	WebElement cartIcon;

	static Map<String, String> dataOnPdpPage = new HashMap<String, String>();

	public ProductDetailPage() {
		PageFactory.initElements(driver, this);
	}

	public void verifyPDPPage() {
		Assert.assertTrue("Item image is not displayed on pdp", itemImage.isDisplayed());
	}

	public void verifyItemDetailsOnPDPPage() {
		dataOnPdpPage.put("item_price", itemPrice.getText());
		dataOnPdpPage.put("item_name", itemName.getText());
		System.out.println("Data on HomePage==>" + HomePage.dataOnHomePage);
		System.out.println("Data on PDP==>" + dataOnPdpPage);
		Assert.assertTrue("Data on pdp and homepage doesn't match", dataOnPdpPage.equals(HomePage.dataOnHomePage));
	}

	public void clickOnAddToCart() {
		addToCartBtn.click();
	}

	public void verifyAddToCartIsNotDisplayed() {
		Assert.assertTrue("Add to cart is still displayed", !WebElementUtils.isDisplayed(addToCartBtn));
	}

	public void clickOnCartIcon() {
		cartIcon.click();
	}

}
