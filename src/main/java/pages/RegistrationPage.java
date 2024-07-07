package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.CommonUtility;

public class RegistrationPage extends CommonUtility{
	private WebDriver driver;

	//By Locators
	private By maleGenderLocator = By.xpath("//input[@id='gender-male']");
	private By femaleGenderLocator = By.xpath("//input[@id='gender-female']");
	private By firstNameLocator = By.xpath("//input[@name='FirstName']");
	private By lastNameLocator = By.xpath("//input[@name='LastName']");
	private By emailLocator = By.xpath("//input[@name='Email']");
	private By passwordLocator = By.xpath("//input[@name='Password']");
	private By confirmPasswordLocator = By.xpath("//input[@name='ConfirmPassword']");
	private By registerbuttonLocator = By.name("register-button");
	
	private By logoutLocator=By.className("ico-logout");


	//parametrise constructor
	public RegistrationPage(WebDriver driver)
	{
		this.driver=driver;
	}

	
	public void enterGender(String gender)
	{
		if(gender.equalsIgnoreCase("female"))
		{
			WebElement femaleGender = driver.findElement(femaleGenderLocator);
			femaleGender.click();
		}
		else
		{
			WebElement maleGender = driver.findElement(maleGenderLocator);
			maleGender.click();
		}			
	}

	public void enterFirstName(String firstname)
	{
		WebElement firstName = driver.findElement(firstNameLocator);
		firstName.sendKeys(firstname);
	}

	public void enterLastName(String lastname)
	{
		WebElement lastName = driver.findElement(lastNameLocator);
		lastName.sendKeys(lastname);
	}

	public void enterEmail(String email)
	{
		WebElement emailAddress = driver.findElement(emailLocator);
		String emailaddress=new CommonUtility().generateString();
		emailAddress.sendKeys(emailaddress.concat(email));
	}

	public void enterPassword(String password)
	{
		WebElement newPassword = driver.findElement(passwordLocator);
		newPassword.sendKeys(password);
	}

	public void enterConfirmPassword(String confirmpassword)
	{
		WebElement confirmPassword = driver.findElement(confirmPasswordLocator);
		confirmPassword.sendKeys(confirmpassword);
	}

	public void clickRegisterButton()
	{
		WebElement registerButton = driver.findElement(registerbuttonLocator);
		registerButton.click();
	}
	
	public void clicklogoutLink()
	{
		WebElement logout = driver.findElement(logoutLocator);
		logout.click();
	}

}
