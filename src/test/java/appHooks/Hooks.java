package appHooks;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.ConfigReader;

public class Hooks {

	private WebDriver driver;
	private DriverFactory dfactory;
	private ConfigReader confreader;
	Properties prop;
	
	@Before(order=0)
	public void getProperties()
	{
		confreader = new ConfigReader();
		prop = confreader.init_prop();
	}
	
	@Before(order=1)
	public void lounchBrowser()
	{
		String browserName=prop.getProperty("browser");
		dfactory = new DriverFactory();
		driver=dfactory.init_browser(browserName);
	}
	/*
	@After(order=0)
	public void quitBrowser()
	{
		driver.quit();
	}*/
}
