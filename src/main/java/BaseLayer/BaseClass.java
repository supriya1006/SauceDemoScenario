package BaseLayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	protected static Properties prop;
	public static void initialization() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	String url = prop.getProperty("URL");
	driver.get(url);
	}
	public BaseClass()
	{
		prop = new Properties();
		String path = System.getProperty("user.dir")+"/src/main/java/ConfigurationLayer/config.properties";
		try {
			FileInputStream fis = new FileInputStream(path);
			prop.load(fis);
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
	}
}
