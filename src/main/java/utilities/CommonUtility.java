package utilities;

import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import factory.DriverFactory;
import io.cucumber.java.Scenario;

public class CommonUtility {

	public String generateString() 
	{
		Random r=new Random();
		   String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789";
		      StringBuilder generatedString= new StringBuilder();
		      for (int i = 0; i < 2; i++) {
		          int randonSequence = r .nextInt(CHARACTERS.length());
		          generatedString.append(CHARACTERS.charAt(randonSequence));
		      }
		      return generatedString.toString();
	}
	
    public void takescreenshot(Scenario scenario)
    {
    	String screenshotName= scenario.getName().replaceAll(" ", "_");
		byte[] sourcepath = ((TakesScreenshot)DriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES);
		
		scenario.attach(sourcepath, "image/png", screenshotName);
    }
}
