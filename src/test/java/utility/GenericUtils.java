package utility;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtils {
	WebDriver driver;
	public GenericUtils(WebDriver driver)
	{
		this.driver=driver;
	}
	public void SwitchWindowToChild()
	{
		Set<String> window = driver.getWindowHandles();
		Iterator<String> i1 = window.iterator();
		String parentwindow = i1.next();// this will contain the id of parentwindow
		String childwindow = i1.next();// this will contain the id of childwindow
		driver.switchTo().window(childwindow);
	}

}
