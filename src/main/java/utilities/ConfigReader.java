package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	private Properties prop;
	
	public Properties init_prop()
	{
		prop=new Properties();
		{
			try
			{
				
				FileInputStream input = new FileInputStream("src/test/Resources/config/config.properties");
				prop.load(input);
			}
			catch(FileNotFoundException e)
			{
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return prop;
		}
	}
}
