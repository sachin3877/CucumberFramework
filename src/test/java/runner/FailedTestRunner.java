package runner;


import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
 
@CucumberOptions(features = "@target/failed_scenario.txt",
glue = "StepDefinations",monochrome=true,dryRun=false,
plugin={"pretty","html:target/cucumber.html","json:target/cucumber.json",
		})
public class FailedTestRunner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios() {
		return super.scenarios();
	}
}
