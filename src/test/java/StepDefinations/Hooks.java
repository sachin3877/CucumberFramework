package StepDefinations;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import utility.TestSetUp;

public class Hooks {
	WebDriver driver;
	public Hooks(TestSetUp testSetUp) throws IOException
	{
		this.driver=testSetUp.testbase.webDriverManager();
	}
	@After
	public void tearDown()
	{
		driver.quit();
	}

}
