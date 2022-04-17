package StepDefinations;

import org.testng.Assert;

import io.cucumber.java.en.Then;

import pageobjects.Landingpage;
import pageobjects.Offerpage;
import utility.TestSetUp;

public class Offer_pageStepDefination {

	TestSetUp testsetup;
	String OfferPageProductname;
	Offerpage offerpage;
	public Offer_pageStepDefination(TestSetUp setup) {
		this.testsetup = setup;
		 offerpage = testsetup.pageObjectManager.Offerpageobject();

	}

	@Then("User searched for same shortname {string} in offer page to check if product exist with same name")
	public void user_searched_for_same_shortname_in_offer_page_to_check_if_product_exist_with_same_name(String string)
			throws InterruptedException {
		switchToChildWindow();
		Offerpage offerpage = testsetup.pageObjectManager.Offerpageobject();
		// Offerpage offerpage=new Offerpage(testsetup.driver);
		offerpage.searchKey(string);
		Thread.sleep(3000);
		OfferPageProductname = offerpage.getProductname();
	}

	public void switchToChildWindow() {

		Landingpage landingpage = testsetup.pageObjectManager.landingpageobject();
		landingpage.clickTopDeals();
		testsetup.genericUtils.SwitchWindowToChild();
	}

	@Then("validate product name in offers page matches with Landing page")
	public void validate_product_name_in_offers_page_matches_with_landing_page() {
		Assert.assertEquals(OfferPageProductname, testsetup.homepageProductName);
	}
}
