package StepDefinations;


import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.When;
import pageobjects.Landingpage;
import utility.TestSetUp;

public class Landing_pageStepDefination {

	
	TestSetUp testsetup;
	String homepageProductName;
	Landingpage landingpage;

	public Landing_pageStepDefination(TestSetUp setup) {
		this.testsetup = setup;
		this.landingpage=testsetup.pageObjectManager.landingpageobject();
		
	}

	@Given("User is on GreenCart Landing page")
	public void user_is_on_green_cart_landing_page() throws IOException {
		//testsetup.testbase.webDriverManager();	
		}

	@When("User searched with shortname {string} and extrated the actual name of product")
	public void user_searched_with_shortname_and_extrated_the_actual_name_of_product(String string)
			throws InterruptedException {
		//Landingpage landingpage=testsetup.pageObjectManager.landingpageobject();
		landingpage.searchKey(string);
		Thread.sleep(3000);
		testsetup.homepageProductName = landingpage.getProductName().split("-")[0]
				.trim();
	}
	@When("Add {string} items of the selected product to cart")
	public void add_items_of_the_selected_product_to_cart(String string) {
		landingpage.incrementItem(Integer. parseInt(string));
		landingpage.addToCart();
	}

}
