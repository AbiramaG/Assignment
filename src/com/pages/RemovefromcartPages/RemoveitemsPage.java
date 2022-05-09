package com.pages.RemovefromcartPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.pages.LoginPage;

import org.openqa.selenium.WebElement;

public class RemoveitemsPage extends LoginPage{

	public RemoveitemsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//button[contains(text(),'Remove')]")
	public WebElement  Remove;
	
	@FindBy(xpath = "//button[@id='continue-shopping']")
	public WebElement continueshopping;
	
	public void Removeitems() {
		Remove.click();
	}
	
	public void continueshop() {
		continueshopping.click();
	}
	

}
