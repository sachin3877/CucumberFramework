package runner;


import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
 
@CucumberOptions(features = "src/test/java/feature",
glue = "StepDefinations",monochrome=true,dryRun=false,tags="@Addcart or @Sanity",
plugin={"pretty","html:target/cucumber.html","json:target/cucumber.json",
		"rerun:target/failed_scenario.txt"})
public class TestRunner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios() {
		return super.scenarios();
	}
}
