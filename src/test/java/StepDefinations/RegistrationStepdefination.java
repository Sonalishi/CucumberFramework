package StepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationStepdefination {
	
	private WebDriver driver;
	//public Registration registrationpage;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
	}

	@After
	public void teardown()
	{
		if(driver!=null)
		{
			driver.quit();
		}
	}

	@Given("I on registration page")
	public void i_on_registration_page() {
	   driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");

	}
	
	@Given("^I have entered valid (.*) , (.*) , (.*) , (.*) , (.*) , (.*)$")
	public void i_have_entered_valid_credentials(String gender,String firstname,String lastname,String email,String password, String confirmpassword) {
	    System.out.println(gender + firstname);
	}

	@When("I click on Register button")
	public void i_click_on_register_button() {
	    System.out.println("Hello1");
	}

	@Then("I should be logged in Successfully")
	public void i_should_be_logged_in_successfully() {
	   System.out.println("Hello2");
	}
}
