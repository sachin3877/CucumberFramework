package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkoutpage {
	
	WebDriver driver;
	
	
	
	By cartIcon=By.cssSelector("a.cart-icon");
	By CheckOutButton=By.cssSelector("div.cart-preview.active>:last-child>*");
	By CartProductName=By.cssSelector("p.product-name");
	By ApplyButton =By.cssSelector("button.promoBtn");
	By PlaceOrder=By.cssSelector("span.totAmt~button");
	
	public Checkoutpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void getCheckOutPage()
	{
		driver.findElement(cartIcon).click();
		driver.findElement(CheckOutButton).click();
	}
	
	
	public String getCartProductName()
	{
		return driver.findElement(CartProductName).getText().split("-")[0].trim();
	}
	public boolean applyButtonDisplayed()
	{
		return driver.findElement(ApplyButton).isDisplayed();
	}
	public boolean placeOrderButtonDisplayed()
	{
		return driver.findElement(PlaceOrder).isDisplayed();
	}
}
