package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class DesktopPage {
	
	WebDriver driver;
	
	private By VANQUISH3Locator= By.xpath("//a[@href ='/digital-storm-vanquish-3-custom-performance-pc']");
	private By price_1259Locator = By.partialLinkText("259");
	private By addtocartbuttonLocator = By.xpath("//button[@id='add-to-cart-button-2']");
	private By addtocartNotification=By.xpath("//div[@class='bar-notification success']");
	
	public DesktopPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void productlinkClick(String product)
	{
		if(product.contains("VANQUISH"))
		{
			System.out.println(product);
			WebElement link=driver.findElement(VANQUISH3Locator);
			link.click();
		}
		
		
	}
	
	public String getTitle()
	{
		return driver.getTitle();
	}
	
	public boolean productPrice(double price)
	{
		Boolean result=true;
		if(price==1259)
		{
			WebElement price1259=driver.findElement(price_1259Locator);
			result= price1259.isDisplayed();
			
		}
		return result;
	}
	
	public void addtocartbuttonClick()
	{
		WebElement addtocart=driver.findElement(addtocartbuttonLocator);
		addtocart.click();
	}
	
	public boolean is_addtocartnotification()
	{
		WebElement notification =driver.findElement(addtocartNotification);
		return notification.isDisplayed();
	}
}

