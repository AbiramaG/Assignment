package com.pages;


import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;

public class LoginPage {
	@SuppressWarnings("unused")
	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		//PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath = "//input[@id = 'user-name']")
	public WebElement username;

	@FindBy(xpath = "//input[@id = 'password']")
	public WebElement password;


	@FindBy(xpath = "//input[@id = 'login-button']")
	public WebElement Login;
	
	
	public void loginuser(Map<String,String> logindetails) {
		

		username.sendKeys(logindetails.get("UserName"));
		password.sendKeys(logindetails.get("Password"));
		Login.click();
	}
		

}
