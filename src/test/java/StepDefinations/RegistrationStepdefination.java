package StepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class RegistrationStepdefination {
	
	private WebDriver driver;
	//public Registration registrationpage;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
	}

	@Given("I on registration page")
	public void i_on_registration_page() {
	   driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
	   System.out.print("Hello");
	}
	
	@When("I retest")
	public void i_retest() {
		 System.out.print("Hello Again");
	}
}
