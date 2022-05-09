package com.pages.AddingtocartPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.pages.LoginPage;

public class ShoppingPage extends LoginPage{

	public ShoppingPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
	public WebElement Backbag;
	
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
	public WebElement onesie;
	
	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	public WebElement cart;
	
	public void clickOnAddtoCartOneItem() {
		Backbag.click();
	}
	public void clickOnAddtoCart() {
		Backbag.click();
		onesie.click();
	}
	
	public void clickOnCart() {
		cart.click();
	}
	

}
