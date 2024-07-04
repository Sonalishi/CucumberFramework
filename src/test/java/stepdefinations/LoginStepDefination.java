package stepdefinations;



import org.junit.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.*;
import pages.LoginPage;


public class LoginStepDefination {

	
	private LoginPage login=new LoginPage(DriverFactory.getDriver());
	
	
	@Given("I am on Login page")
	public void i_on_Login_page() throws InterruptedException {
		DriverFactory.getDriver().get("https://demo.nopcommerce.com/login?returnUrl=%2Fdesktops");
	}
	
	@When("User enters Email {string}")
	public void user_enters_email(String email) {
	   login.enterEmailID(email);
	}

	@And("User enters Password {string}")
	public void user_enters_password(String password) {
	    login.enterPassword(password);
	}

	@When("User click on Login butten")
	public void user_click_on_login_butten() {
	    login.loginClick();
	    
	}

	@Then("User should successfully login to store")
	public void user_should_successfully_login_to_store() throws InterruptedException {
		   Thread.sleep(1000);
		   String url=DriverFactory.getDriver().getCurrentUrl();
		   Assert.assertEquals(url, "https://demo.nopcommerce.com/desktops");
	}

	
}
