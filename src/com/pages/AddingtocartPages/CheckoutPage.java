package com.pages.AddingtocartPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.pages.LoginPage;

public class CheckoutPage extends LoginPage{

	public CheckoutPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//button[@id='checkout']")
	public WebElement checkout;

	public void clickOnCheckout() {
		checkout.click();
	}
}
