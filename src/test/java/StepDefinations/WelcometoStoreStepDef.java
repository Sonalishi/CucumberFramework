package StepDefinations;



import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pages.WelcomeStorePage;


public class WelcometoStoreStepDef {

	private WebDriver driver;
	private WelcomeStorePage store;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
        driver.manage().window().maximize();
        
	}
	
	@After
	public void teardown()
	{
		if(driver!=null)
		{
			driver.quit();
		}
	}
	
	@Given("I am on Welcome to Store page")
	public void i_am_on_welcome_to_store_page() {
		 driver.get("https://demo.nopcommerce.com/");
		 store = new WelcomeStorePage(driver);
	}

	
	@Given("^I see visible options under (.*) option$")
	public void i_see_visible_options_option(String mainoption) throws InterruptedException {
		 if(mainoption.equals("Computers"))
		 {
		  store.moveToComputer();
		  Thread.sleep(1000);
		  Assert.assertTrue(store.isDesktopVisible());
		  Assert.assertTrue(store.isNotebookVisible());
		  Assert.assertTrue(store.isSoftwareVisible());
		 }
		 else
		 if(mainoption.equals("Electronics"))
		 {
			 store.moveToElectronics();
			  Thread.sleep(1000);
			  Assert.assertTrue(store.isCamera_photoVisible());
			  Assert.assertTrue(store.isCellphoneVisible());
			  Assert.assertTrue(store.isOtherVisible());
		 }
		  
		}
		
	@When("^I click on (.*) option$")
	public void i_click_on_option(String listoption) {
	    if(listoption.equals("Desktops"))
	    {
	    	store.desktopClick();
	    }
	    else
	    if(listoption.equals("Notebooks"))
		{
		    store.notebookClick();
		}
	    else
	    if(listoption.equals("Software"))
	    {
	    	store.softwareClick();
	    }
	    else
	    	if(listoption.equals("Camera & Photos"))
		    {
		    	store.camera_photoClick();
		    }
		    else
		    if(listoption.equals("Cell Phones"))
			{
			    store.cellPoneClick();
			}
		    else
		    if(listoption.equals("Others"))
		    {
		    	store.otherClick();
		    }
	}

	@Then("^I should go on (.*) page$")
	public void i_should_go_on_option_page(String listoption) throws InterruptedException {
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		if(listoption.equals("Desktops"))
	    {
			Assert.assertEquals(url, "https://demo.nopcommerce.com/desktops");
	    }
		else
		if(listoption.equals("Notebooks"))
		 {
			Assert.assertEquals(url, "https://demo.nopcommerce.com/notebooks");
		 }
		else
		if(listoption.equals("software"))
	    {
			Assert.assertEquals(url, "https://demo.nopcommerce.com/software");
		}
		else
			if(listoption.equals("Camera & Photos"))
		    {
				Assert.assertEquals(url, "https://demo.nopcommerce.com/camera-photo");
		    }
			else
			if(listoption.equals("Cell Phones"))
			 {
				Assert.assertEquals(url, "https://demo.nopcommerce.com/cell-phones");
			 }
			else
			if(listoption.equals("Others"))
		    {
				Assert.assertEquals(url, "https://demo.nopcommerce.com/others");
			}
	}
	
	@Given("I entered product in search bar and click on search button")
	public void i_entered_product_in_search_bar() {
	    store.searchText("Flower Girl Bracelet");
	    store.searchClick();
	}

	@Then("Product shoud display on page")
	public void product_shoud_display_on_page() {
		
		Assert.assertTrue(store.searchResult());
		
	}

	
}
