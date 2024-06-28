package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/Resources/Features",
                  glue= {"StepDefinations"},
                  plugin = { "pretty", "html:target/cucumber-reports","json:target/cucumber.json" },
                  monochrome = true)
public class TestRunner extends AbstractTestNGCucumberTests{
	
	
}