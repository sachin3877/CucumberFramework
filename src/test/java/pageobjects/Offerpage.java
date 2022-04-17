package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Offerpage {
	WebDriver driver;
	By searchKey=By.cssSelector("input#search-field");
	By productname=By.cssSelector("tr td:first-child");
	public Offerpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void searchKey(String str)
	{
		driver.findElement(searchKey).sendKeys(str);
	}
	
	public String getProductname()
	{
		return driver.findElement(productname).getText();
	}
}


