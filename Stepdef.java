package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.LoginPage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;


public class Stepdef {
	//create classes of both object
	public WebDriver driver;
	public LoginPage loginpg;

	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		//Initialization
		driver = new ChromeDriver();

		loginpg = new LoginPage(driver);
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);
	}

	@When("User enters E-mail as {string} and Password as {string}")
	public void user_enters_e_mail_as_and_password_as(String emailAdd, String password) {
		loginpg.enterEmail(emailAdd);
		loginpg.enterpassword(password);
	}


	@When("click on login")
	public void click_on_login() {
		loginpg.clickOnLoginButton();
	}


	@Then("Page Title should be {string}")
	public void page_title_should_be(String expectedTitle) {
		String actualTitle=driver.getTitle();

		if(actualTitle.equals(expectedTitle))
		{
			Assert.assertTrue(true);//pass

		}	
		else
		{
			Assert.assertTrue(false);//false
		}

	}

	@When("User click on log out link")
	public void user_click_on_log_out_link() {

		loginpg.clickOnLogOutButton();
	}


	@Then("Close browser")
	public void close_browser() {

		driver.close();
		driver.quit();
	}



}
