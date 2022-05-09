package com.pages.AddingtocartPages;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.pages.LoginPage;

public class userinfo extends LoginPage{

	public userinfo(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//input[@id='first-name']")
	public WebElement firstname;
	
	@FindBy(xpath = "//input[@id='last-name']")
	public WebElement lastname;
	
	@FindBy(xpath = "//input[@id='postal-code']")
	public WebElement postalcode;
	
	@FindBy(xpath = "//input[@id='continue']")
	public WebElement continuebtn;
	
	
	
	public void checkoutinfo(Map<String,String> userDetails) {
		

		firstname.sendKeys(userDetails.get("First Name"));
		lastname.sendKeys(userDetails.get("Last Name"));
		postalcode.sendKeys(userDetails.get("Postal Code"));
		continuebtn.click();
	}
	
}