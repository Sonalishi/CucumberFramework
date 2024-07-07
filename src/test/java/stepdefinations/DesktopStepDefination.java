package stepdefinations;

import static org.testng.Assert.assertTrue;

import factory.DriverFactory;
import io.cucumber.java.en.*;
import pages.DesktopPage;

public class DesktopStepDefination {

	private DesktopPage desktop = new DesktopPage(DriverFactory.getDriver());

	@Given("I am on Desktop page")
	public void i_am_on_desktop_page() {
		DriverFactory.getDriver().get("https://demo.nopcommerce.com/desktops");
	}
	
	@When("^User click on product (.*)$")
	public void user_click_on_product(String productlink) {
        desktop.productlinkClick(productlink);
	}

	@Then("^User should get full page information of (.*)$")
	public void user_should_get_full_details_of_the_product(String product) {
	    desktop.getTitle();
	    System.out.println(desktop.getTitle());
	    assertTrue(desktop.getTitle().contains(product));

	}

	@When("User click on Add to cart button")
	public void user_click_on_add_to_cart_butten() {
	    desktop.addtocartbuttonClick();
	}

	@Then("Product should add to cart successfully.")
	public void product_should_add_to_cart_successfully() throws InterruptedException {
	    Thread.sleep(500);
	    assertTrue(desktop.is_addtocartnotification());
	}

	
}
