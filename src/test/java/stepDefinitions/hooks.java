package stepDefinitions;

import java.io.IOException;
import java.util.Properties;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import factory.baseclass;

public class hooks {
	WebDriver driver;
	Properties p;
	
	@Before
	public void setup() throws IOException {
		driver=baseclass.InitializeBrowser();
		p=baseclass.getProperties();
	}
	
	
	@After
	public void teardown()
	{
		driver.quit();
	}
	
	
	//@BeforeStep
	
	
	
	//@AfterStep

}
