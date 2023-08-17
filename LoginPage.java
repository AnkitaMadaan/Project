package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;

	public LoginPage(WebDriver rDriver)

	{

		ldriver=rDriver;

		PageFactory.initElements(rDriver, this);
	}


	// We have written statements for 3 web Elements

	@FindBy(id = "Email")
	WebElement email;


	@FindBy(id= "Password")
	WebElement password;

	@FindBy(xpath = "//button[@class='button-1 login-button']")
	WebElement LoginBtn;

	@FindBy(linkText="Logout")
	WebElement logout;


	// For 3 web elements, we have perform action method

	public void enterEmail(String emailAdd)
	{
		email.clear();
		email.sendKeys(emailAdd);
	}

	public void enterpassword(String pwd)
	{
		password.clear();
		password.sendKeys(pwd);
	}

	public void clickOnLoginButton()

	{

		LoginBtn.click();
	}

	public void clickOnLogOutButton()

	{

		logout.click();
	}











}
