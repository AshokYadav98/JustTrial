package NokariPOM;

import javax.lang.model.element.Element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class LoginPage 
{
	@FindBy(css = "#login_Layer")private WebElement logIn;
	
	@FindBy(xpath = "(//input[@type='text'])[1]")private WebElement userName;
	
	@FindBy(css = "input[type=password]")private WebElement password;
	
	@FindBy(xpath = "//button[text()='Login']")private WebElement logInButton;
	
	
	public LoginPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickonlogin()
	{
		logIn.click();
		
		Reporter.log("clicking on login");
	}
	
	public void enterUserName(String userid)
	{
		userName.sendKeys(userid);
		Reporter.log("entering username");
	}
	
	public void enterPassword(String pass)
	{
		password.sendKeys(pass);
		Reporter.log("entering password");
		
	}
	
	public void clickOnLogInButton()
	{
		logInButton.click();
		Reporter.log("entering on login button for login ");
	}
	
	
	

}
