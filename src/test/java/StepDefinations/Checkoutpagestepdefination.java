package StepDefinations;


import org.testng.Assert;

import io.cucumber.java.en.Then;

import pageobjects.Checkoutpage;
import utility.TestSetUp;

public class Checkoutpagestepdefination {
	TestSetUp testSetUp;
	Checkoutpage checkoutpage;
	public Checkoutpagestepdefination(TestSetUp testSetUp)
	{
		this.testSetUp=testSetUp;
		 this.checkoutpage=testSetUp.pageObjectManager.checkoutpage();
	}
	@Then("User proceeds to checkout and validate the  {string} item in checkout page")
	public void user_proceeds_to_checkout_and_validate_the_item_in_checkout_page(String string) {
		testSetUp.pageObjectManager.checkoutpage().getCheckOutPage();
		String productName=testSetUp.pageObjectManager.checkoutpage().getCartProductName();
		
		Assert.assertEquals(productName, testSetUp.homepageProductName);
	}
	@Then("verify user has ability to enter promo code and place the order")
	public void verify_user_has_ability_to_enter_promo_code_and_place_the_order() {
	    
		Assert.assertTrue(checkoutpage.applyButtonDisplayed());
		
		Assert.assertTrue(checkoutpage.placeOrderButtonDisplayed());
	}

}
