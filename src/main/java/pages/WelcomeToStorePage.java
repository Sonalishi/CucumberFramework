package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WelcomeToStorePage {

	WebDriver driver;
	
	
	//By Locators
	private By computerLocator = By.xpath("//*[@class='top-menu notmobile']//descendant::a[1]");
	private By desktopLocator = By.xpath("//*[@class='top-menu notmobile']//descendant::a[2]");
	private By notebookLocator = By.xpath("//*[@class='top-menu notmobile']//descendant::a[3]");
	private By softwareLocator = By.xpath("//*[@class='top-menu notmobile']//descendant::a[4]");
	
	private By electronicsLocator = By.xpath("//*[@class='top-menu notmobile']//descendant::a[5]");
	private By camera_photoLocator = By.xpath("//*[@class='top-menu notmobile']//descendant::a[6]");
	private By cellphonesLocator = By.xpath("//*[@class='top-menu notmobile']//descendant::a[7]");
	private By otherLocator = By.xpath("//*[@class='top-menu notmobile']//descendant::a[8]");
	
	private By searchTextLocator =By.xpath("//*[@id='small-searchterms']");
	private By searchButtonLocator =By.xpath("//*[@class='button-1 search-box-button']");
	private By searchResultLocator =By.xpath("//*[@class='product-title']//child::a");
	
	
	

	public WelcomeToStorePage(WebDriver driver) {
		this.driver=driver;	
	}
	
	
	public void moveToComputer()
	{
		WebElement computer=driver.findElement(computerLocator);
		Actions action =new Actions(driver);
		action.moveToElement(computer);
		action.build().perform();
		
	}
	
	public void moveToElectronics()
	{
		WebElement electronics=driver.findElement(electronicsLocator);
		Actions action =new Actions(driver);
		action.moveToElement(electronics);
		action.build().perform();
		
	}
	
	public boolean isDesktopVisible()
	{
		WebElement desktop=driver.findElement(desktopLocator);
		return desktop.isDisplayed();
		
	}
	

	public boolean isNotebookVisible()
	{
		WebElement  notebook=driver.findElement(notebookLocator);
		return notebook.isDisplayed();
		
	}
	
	public boolean isSoftwareVisible()
	{
	 WebElement	software=driver.findElement(softwareLocator);
		return software.isDisplayed();
		
	}
	
	public boolean isCamera_photoVisible()
	{
		WebElement camera_photo=driver.findElement(camera_photoLocator);
		return camera_photo.isDisplayed();
		
	}
	

	public boolean isCellphoneVisible()
	{
	 WebElement	cellphones=driver.findElement(cellphonesLocator);
		return cellphones.isDisplayed();
		
	}
	
	public boolean isOtherVisible()
	{
	WebElement	others=driver.findElement(otherLocator);
		return others.isDisplayed();
		
	}
	
	public void desktopClick()
	{
		WebElement desktop=driver.findElement(desktopLocator);
		desktop.click();
	}
	
	public void notebookClick()
	{
		WebElement  notebook=driver.findElement(notebookLocator);
		notebook.click();
	}
	
	public void softwareClick()
	{
		WebElement software=driver.findElement(softwareLocator);
		software.click();
	}
	
	public void camera_photoClick()
	{
		WebElement camera_photo=driver.findElement(camera_photoLocator);
		camera_photo.click();
	}
	
	public void cellPoneClick()
	{
		 WebElement	cellphones=driver.findElement(cellphonesLocator);
		cellphones.click();
	}
	
	public void otherClick()
	{
		WebElement	others=driver.findElement(otherLocator);
		others.click();
	}
	
	public void searchText(String text)
	{
		WebElement searchbar=driver.findElement(searchTextLocator);
		searchbar.sendKeys(text);
	}
	
	public void searchClick()
	{
		WebElement searchButton=driver.findElement(searchButtonLocator);
		searchButton.click();
	}
	
	public boolean searchResult()
	{
		WebElement result=driver.findElement(searchResultLocator);
		return(result.isDisplayed());
    }
	
}
