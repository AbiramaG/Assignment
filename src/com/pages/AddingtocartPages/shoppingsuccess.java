package com.pages.AddingtocartPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.pages.LoginPage;

public class shoppingsuccess extends LoginPage{

	public shoppingsuccess(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//button[@id='finish']")
	public WebElement finish;
	
	//@FindBy(xpath = "//*[contains(text(),'Checkout: Complete!')]")
	//public WebElement title;
	
	public void clickOnCheckout() {
		finish.click();
	}
	
	@FindBy(xpath = "//*[contains(text(),'Checkout: Complete!')]")
	public WebElement successMessage;
	//String s = successMessage.getText();

}
