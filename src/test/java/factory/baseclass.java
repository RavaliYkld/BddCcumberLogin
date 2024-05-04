package factory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class baseclass {
	
	static Properties p;
	static WebDriver driver;
	
	
	public static WebDriver InitializeBrowser() throws IOException
	{
		switch(getProperties().getProperty("browser").toLowerCase())
		{
		case "chrome" :
		 driver=new ChromeDriver();
		 break;
		 
		case "edge" :
			driver=new EdgeDriver();
			break;
			
		case "firefox" :
			driver= new FirefoxDriver();
			break;
		default :
			System.out.println("no matching browser");
			driver=null;
		
		}
		return driver;
	}
	
	
	
	
	
	public static Properties getProperties() throws IOException {
	//Read data from properties file
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties");
		p=new Properties();
		p.load(file);
		return p;
	
	}
	
	

}
