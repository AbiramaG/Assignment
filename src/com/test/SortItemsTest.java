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
import com.pages.RemovefromcartPages.RemoveitemsPage;
import com.pages.SortItems.SortItemsPage;

public class SortItemsTest extends baseclass {
		@Test
		public void Removeitem() throws InterruptedException {
		LoginPage Login = PageFactory.initElements(driver,LoginPage.class);
		CheckoutPage Checkout = PageFactory.initElements(driver,CheckoutPage.class);
		ShoppingPage Shopping = PageFactory.initElements(driver,ShoppingPage.class);
		shoppingsuccess Shopsuccess = PageFactory.initElements(driver,shoppingsuccess.class);
		userinfo user = PageFactory.initElements(driver, userinfo.class);
		RemoveitemsPage remove = PageFactory.initElements(driver, RemoveitemsPage.class);
		SortItemsPage sort = PageFactory.initElements(driver, SortItemsPage.class);
		
		Map<String, String> logindetails = new HashMap<String, String>();
		
		logindetails.put("UserName", "standard_user");
		logindetails.put("Password", "secret_sauce");
		Login.loginuser(logindetails);
		
		sort.sort("Price (low to high)");
		Thread.sleep(2000);
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
		}

}
