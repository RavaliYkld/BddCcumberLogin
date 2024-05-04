
package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import pageObjects.LoginPage;

public class steps {
	WebDriver driver;
	LoginPage lp;
	String br;
		
	
	@Given("user opens URL {string}")
	public void user_opens_url(String url) {
	    driver.get(url);
	    driver.manage().window().maximize();
	}

	@And("user enters email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String username, String password) {
		lp=new LoginPage(driver);
	    lp.setEmail(username);
	    lp.setPassword(password);
	}

	@And("user clicks on login button")
	public void user_clicks_on_login_button() {
	    lp.clickLogin();
	}

	@Then("user Validats Page title as {string}")
	public void user_validats_page_title_as(String title) {
	    if(driver.getPageSource().contains("Login was unsuccessfull"))
	    {
	    	driver.close();
	    	Assert.assertTrue(false);
	    }
	    else
	    {
	    	Assert.assertEquals(title,driver.getTitle());
	    }
	
	}

	@When("user clicks on Logout button")
	public void user_clicks_on_logout_button() {
	    lp.clicklogout();
	}

	@And("user close browser")
	public void user_close_browser() {
	    driver.quit();
	}

	
	
	
	
	

}
