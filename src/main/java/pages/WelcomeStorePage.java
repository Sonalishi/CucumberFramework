package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class WelcomeStorePage {

	private WebDriver driver;

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
	
	WebElement desktop;
	WebElement notebook;
	WebElement software;
	WebElement camera_photo;
	WebElement cellphones;
	WebElement others;
	

	//parametrise constructor
	public WelcomeStorePage(WebDriver driver)
	{
		this.driver=driver;
		desktop=driver.findElement(desktopLocator);
		notebook=driver.findElement(notebookLocator);
		software=driver.findElement(softwareLocator);
		camera_photo=driver.findElement(camera_photoLocator);
		cellphones=driver.findElement(cellphonesLocator);
		others=driver.findElement(otherLocator);
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
		
		return desktop.isDisplayed();
		
	}
	

	public boolean isNotebookVisible()
	{
		
		return notebook.isDisplayed();
		
	}
	
	public boolean isSoftwareVisible()
	{
		
		return software.isDisplayed();
		
	}
	
	public boolean isCamera_photoVisible()
	{
		
		return camera_photo.isDisplayed();
		
	}
	

	public boolean isCellphoneVisible()
	{
		
		return cellphones.isDisplayed();
		
	}
	
	public boolean isOtherVisible()
	{
		
		return others.isDisplayed();
		
	}
	
	public void desktopClick()
	{
		desktop.click();
	}
	
	public void notebookClick()
	{
		notebook.click();
	}
	
	public void softwareClick()
	{
		software.click();
	}
	
	public void camera_photoClick()
	{
		camera_photo.click();
	}
	
	public void cellPoneClick()
	{
		cellphones.click();
	}
	
	public void otherClick()
	{
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
