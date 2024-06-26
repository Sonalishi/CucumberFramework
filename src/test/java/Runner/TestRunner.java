package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/Resources/Features",
                  glue= {"StepDefinations"},
                  plugin = { "pretty", "html:target/cucumber-reports","json:target/cucumber.json" },
                  monochrome = true)
public class TestRunner {

}