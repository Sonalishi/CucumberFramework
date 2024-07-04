package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/Resources/Features/Login.feature",
                  glue= {"StepDefinations", "appHooks"},
                  plugin = { "pretty", "html:target/cucumber-reports.html","json:target/cucumber.json" },
                  monochrome = true)
public class TestRunner extends AbstractTestNGCucumberTests{
	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}

	
}