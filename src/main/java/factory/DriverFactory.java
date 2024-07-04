package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public WebDriver driver;
	
	public static ThreadLocal<WebDriver> tldriver = new ThreadLocal<>();
	
	public WebDriver init_browser(String browser)
	{
		System.out.println("Browser is " + browser);
		if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			tldriver.set(new ChromeDriver());
		}
		else
		if(browser.equals("firefox"))
		{
			//WebDriverManager.chromedriver().setup();
			tldriver.set(new FirefoxDriver());
		}
		else
		if(browser.equals("safari"))
		{
			//WebDriverManager.chromedriver().setup();
			tldriver.set(new SafariDriver());
		}
		else
		{
			System.out.println("Please use valid browser:" + browser);
		}
		
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		return getDriver();
	}
	
	public static WebDriver getDriver()
	{
		return tldriver.get();
	}
	
}
