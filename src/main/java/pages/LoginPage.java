package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	WebDriver driver;
	
	private By emailIdLocator = By.xpath("//input[@class='email']");
	private By passwordLocator = By.xpath("//input[@class='password']");
	private By logInbuttonLocator = By.xpath("//div[@class='returning-wrapper fieldset']//descendant::button");
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void goToPage()
	{
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
	}
	
	public void enterEmailID(String email)
	{
		WebElement emailid=driver.findElement(emailIdLocator);
		emailid.sendKeys(email);
	}
	
	public void enterPassword(String password)
	{
		WebElement userpassword=driver.findElement(passwordLocator);
		userpassword.sendKeys(password);
	}
	
	public void loginClick()
	{
		WebElement loginbutton=driver.findElement(logInbuttonLocator);
		loginbutton.click();
		System.out.println("Button");
	}
}
