package StepDefinations;



import java.time.Duration;
import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RegistrationPage;


public class RegistrationStepdefination {
	
	private WebDriver driver;
	private RegistrationPage registrationpage;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
        driver.manage().window().maximize();
	}

	/*@After
	public void teardown()
	{
		if(driver!=null)
		{
			driver.quit();
		}
	}*/

	@Given("I on registration page")
	public void i_on_registration_page() {
	   driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
	   registrationpage = new RegistrationPage(driver);
	 
	}
	
	@Given("^I have entered valid (.*) , (.*) , (.*) , (.*) , (.*) , (.*)$")
	public void i_have_entered_valid_credentials(String gender,String firstname,String lastname,String email,String password, String confirmpassword) throws InterruptedException {
	    registrationpage.enterGender(gender);
	    registrationpage.enterFirstName(firstname);
	    registrationpage.enterLastName(lastname);
	    registrationpage.enterEmail(email);
	    registrationpage.enterPassword(password);
	    registrationpage.enterConfirmPassword(confirmpassword);
	    Thread.sleep(500);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    
	}

	@When("I click on Register button")
	public void i_click_on_register_button() {
	    registrationpage.clickRegisterButton();
	}

	@Then("I should be logged in Successfully")
	public void i_should_be_logged_in_successfully() throws InterruptedException {
		Thread.sleep(1000);
	   String url=driver.getCurrentUrl();
	   Assert.assertEquals(url, "https://demo.nopcommerce.com/registerresult/1?returnUrl=/");
	}
}
