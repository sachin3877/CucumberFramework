package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Landingpage {
	
	WebDriver driver;
	By searchKey=By.cssSelector("input.search-keyword");
	By productName=By.cssSelector("h4.product-name");
	By topdeals=By.linkText("Top Deals");
	By incermentItem=By.cssSelector("a.increment");
	By AddToCart=By.cssSelector("div.stepper-input + div >button");
	public Landingpage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void searchKey(String key)
	{
		driver.findElement(searchKey).sendKeys(key);
	}
	public String getProductName()
	{
		return driver.findElement(productName).getText();
	}
	public void clickTopDeals()
	{
		driver.findElement(topdeals).click();
	}
	public void incrementItem(int item1)
	
	{
		int item2=item1-1;
		while(item2>0)
		{
		driver.findElement(incermentItem).click();
		item2--;
		}
	}
	public void addToCart()
	{
		driver.findElement(AddToCart).click();
	}
}
