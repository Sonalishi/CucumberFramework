package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/Resources/Features/Registration.feature",
                  glue= {"StepDefinations"})
public class TestRunner {

}