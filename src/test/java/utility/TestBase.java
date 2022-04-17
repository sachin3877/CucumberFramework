package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestBase {

	WebDriver driver;

	public WebDriver webDriverManager() throws IOException {
		FileInputStream fil=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resourses\\global.properties");
		Properties prop=new Properties();
		prop.load(fil);
		String browser_prop=prop.getProperty("browser");
		String browser_maven=prop.getProperty("browser");//this will read the value for the browser from maven command
		//Ternary Operator Java is used below
		//variable = Expression1 ? Expression2: Expression3
		// this command is used to run in CMD "mvn test _Dbrowser=edge" to select the type of browser dynamically
		String browser=browser_maven!=null ? browser_maven : browser_prop;
		if(driver==null)
		{
			if(browser.equalsIgnoreCase("chrome"))
			{
		System.setProperty("webdriver.chrome.driver", "src\\test\\resourses\\chromedriver.exe");
		driver = new ChromeDriver();
			}else if(browser.equalsIgnoreCase("edge"))
			{
				System.setProperty("webdriver.edge.driver", "src\\test\\resourses\\msedgedriver.exe");
				driver = new EdgeDriver();
			}else 
			{
				
			}
		driver.get(prop.getProperty("QAUrl"));
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		return driver;
		}
		return driver;
		
	}

}
