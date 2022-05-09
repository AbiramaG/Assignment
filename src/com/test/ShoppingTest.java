package com.test;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.base.baseclass;
import com.pages.LoginPage;
import com.pages.AddingtocartPages.CheckoutPage;
import com.pages.AddingtocartPages.ShoppingPage;
import com.pages.AddingtocartPages.shoppingsuccess;
import com.pages.AddingtocartPages.userinfo;

public class ShoppingTest extends baseclass {

	@Test
	public void AddCart() throws InterruptedException {
		
		Thread.sleep(5000);
		LoginPage Login = PageFactory.initElements(driver,LoginPage.class);
		CheckoutPage Checkout = PageFactory.initElements(driver,CheckoutPage.class);
		ShoppingPage Shopping = PageFactory.initElements(driver,ShoppingPage.class);
		shoppingsuccess Shopsuccess = PageFactory.initElements(driver,shoppingsuccess.class);
		userinfo user = PageFactory.initElements(driver, userinfo.class);
		
		Map<String, String> logindetails = new HashMap<String, String>();
		
		logindetails.put("UserName", "standard_user");
		logindetails.put("Password", "secret_sauce");
		Login.loginuser(logindetails);
		
		Shopping.clickOnAddtoCart();
		Shopping.clickOnCart();
		Checkout.clickOnCheckout();
		
		
		Map<String, String> userDetails = new HashMap<String, String>();
		
		userDetails.put("First Name", "abc");
		userDetails.put("Last Name", "def");
		userDetails.put("Postal Code", "400087");
		user.checkoutinfo(userDetails);
		
		
		Shopsuccess.clickOnCheckout();
		Thread.sleep(5000);
		Assert.assertEquals(Shopsuccess.successMessage.getText(),"CHECKOUT: COMPLETE!");
		
		 Assert.assertTrue(Shopsuccess.successMessage.isDisplayed());
		//Assert.assertTrue(false);
		//
	}

}
