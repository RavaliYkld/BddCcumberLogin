package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	
	
	public LoginPage(WebDriver driver){
		super(driver);
	}

	@FindBy(id="Email")
	WebElement  txtEmailAdd;
	
	@FindBy()
	WebElement txtpassword;
	
	@FindBy()
	WebElement btnlogin;
	
	@FindBy()
	WebElement btnlogout;
	
	
	public void setEmail(String email)
	{
	txtEmailAdd.sendKeys(email);
	}
	
	public void setPassword(String password)
	{
		txtpassword.sendKeys(password);
	}

	public void clickLogin()
	{
		btnlogin.click();
	}
	
	public void clicklogout()
	{
		btnlogout.click();
	}
	
	
	
	
	
	
}
