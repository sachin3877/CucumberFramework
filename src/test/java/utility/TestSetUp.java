package utility;




import java.io.IOException;

import pageobjects.Checkoutpage;
import pageobjects.PageObjectManager;

public class TestSetUp {
	
	public String homepageProductName;
	public PageObjectManager pageObjectManager;
	public TestBase testbase;
	public GenericUtils genericUtils;
	public Checkoutpage checkoutpage;
	public TestSetUp() throws IOException
	{
		testbase=new TestBase();
		checkoutpage =new Checkoutpage(testbase.webDriverManager());
		pageObjectManager=new PageObjectManager(testbase.webDriverManager());
		genericUtils=new GenericUtils(testbase.webDriverManager());
	}
}
