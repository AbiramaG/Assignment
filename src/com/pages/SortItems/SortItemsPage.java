package com.pages.SortItems;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.pages.LoginPage;

public class SortItemsPage extends LoginPage{

	public SortItemsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//select[@class='product_sort_container']")
	public WebElement SortName;
	
	
	public void sort(String sortby) {	
		sorting(SortName,sortby);
	}
	
	
	private void sorting(WebElement e, String s ) {
		Select select=new Select(e);
		select.selectByVisibleText(s);
	}

}
