package pageobjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	WebDriver driver;
	Landingpage landingpage;
	Offerpage offerpage;
	Checkoutpage checkoutpage;
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public Landingpage landingpageobject()
	{
		return landingpage=new Landingpage(driver);
	}
	public Offerpage Offerpageobject()
	{
		return offerpage=new Offerpage(driver);
	}
	public Checkoutpage checkoutpage()
	{
		return checkoutpage=new Checkoutpage(driver);
	}
	
}
